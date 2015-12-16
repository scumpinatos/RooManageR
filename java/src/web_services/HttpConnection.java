package web_services;

import exceptions.HttpException;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import constants.StatusCodes;
import javax.swing.JOptionPane;

/**
 * Classe che si occupa della connessione HTTP con il server contenente il database
 * @author emanuelegargiulo
 */
public abstract class HttpConnection {
    
    /**
     * Funzione che si occupa della connessione
     * @param parameters
     * @return 
     */
    public static String getResponse(String parameters) {
        
        try {
            // APERTURA CONNESSIONE
            String url = "http://localhost/RooManageR/server/index.php";
            URL obj = new URL(url);
            HttpURLConnection connessione = (HttpURLConnection) obj.openConnection();
            connessione.setRequestProperty("User-Agent", "Mozilla/5.0");
            
            // SETTAGGIO TIPO DI RICHIESTA ED INSERIMENTO DATI
            connessione.setRequestMethod("POST");
            connessione.setDoOutput(true);
            DataOutputStream wr = new DataOutputStream(connessione.getOutputStream());
            wr.writeBytes(parameters);
            wr.flush();
            wr.close();
            
            // CONTROLLO STATUS CODE
            int responseCode = connessione.getResponseCode();
            if(responseCode != StatusCodes.SUCCESS) {
                throw new HttpException(responseCode);
            }
            
            // LETTURA RISPOSTA DEL SERVER
            BufferedReader in = new BufferedReader(new InputStreamReader(connessione.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();
            
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            
            in.close();
            return response.toString();
        } catch (MalformedURLException ex) {
            System.out.println("MalformedURLException in HttpConnection");
        } catch (ProtocolException ex) {
            System.out.println("ProtocolException in HttpConnection");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Server offline. Contattare l'amministratore di sistema.");
            return null;
        } catch (HttpException ex) {
            System.out.println("HttpException in HttpConnection");
        }
        
        return null;
    }
}
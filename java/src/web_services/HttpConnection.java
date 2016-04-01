package web_services;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

/**
 * Classe che implementa la connessione HTTP con il server
 * @author emanuelegargiulo
 * @author giandomenicoizzo
 */
public abstract class HttpConnection {
    
    /**
     * Funzione che si occupa di effettuare la connessione, inviare la richiesta e restituire la risposta
     * @param parameters
     * @return risposta del server
     */
    public static String getResponse(String parameters) {
        
        try {
            String url = "http://localhost/RooManageR/server/index.php";
            URL obj = new URL(url);
            HttpURLConnection connessione = (HttpURLConnection) obj.openConnection();
            connessione.setRequestProperty("User-Agent", "Mozilla/5.0");
            
            connessione.setRequestMethod("POST");
            connessione.setDoOutput(true);
            DataOutputStream wr = new DataOutputStream(connessione.getOutputStream());
            wr.writeBytes(parameters);
            wr.flush();
            wr.close();
            
            BufferedReader in = new BufferedReader(new InputStreamReader(connessione.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();
            
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            
            in.close();
            return response.toString();
        } catch (MalformedURLException | ProtocolException ex) {
        } catch (IOException ex) {
            return null;
        }
        
        return null;
    }
}
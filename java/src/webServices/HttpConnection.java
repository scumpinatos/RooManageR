package webServices;

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


public abstract class HttpConnection {
    
    public static String getResponse(String parameters) throws ProtocolException, MalformedURLException, IOException, HttpException {
        
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
    }
    
}

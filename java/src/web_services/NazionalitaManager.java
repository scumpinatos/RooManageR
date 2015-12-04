package web_services;

import cache.ListaNazionalita;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import constants.ServerCodes;
import entities.Nazionalita;
import interfaces.ICallback;
import java.io.IOException;
import java.net.MalformedURLException;
import javax.swing.JOptionPane;

public class NazionalitaManager extends HttpConnection {

    public NazionalitaManager() {

    }

    public void getNazionalita(ICallback<ListaNazionalita> callback) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                try {

                    String response = getResponse(String.format("opCode=%s", ServerCodes.READ_NAZ));
                    if (callback != null) {
                        callback.onResult(new ObjectMapper().readValue(response, ListaNazionalita.class));
                    }
                } catch (MalformedURLException ex) {
                    System.out.println("MalformerdURLException in class " + this.getClass().getName());
                } catch (IOException ex) {
                    System.out.println("IOException in class " + this.getClass().getName());
                }
            }
        };

        new Thread(runnable).start();
    }

    public void addNazionalita(Nazionalita input) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                ObjectMapper mapper = new ObjectMapper();
                String json = null;
                try {
                    json = mapper.writeValueAsString(input);
                } catch (JsonProcessingException ex) {
                }

                String response = getResponse(String.format("opCode=%s&json=%s", ServerCodes.ADD_NAZ, json));
                if(response.equals("DONE")) {
                    System.out.println(response);
                }
                if(response.equals("NOT DONE")) {
                    JOptionPane.showMessageDialog(null, "Inserimento nuova nazionalità non riuscito");
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        
    }
}

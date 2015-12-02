
package web_services;

import cache.ListaStanze;
import com.fasterxml.jackson.databind.ObjectMapper;
import constants.ServerCodes;
import exceptions.HttpException;
import java.io.IOException;
import java.net.MalformedURLException;

public class StrutturaManager extends HttpConnection {

    public void getStanzeByStruttura(int idStruttura) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    String response = getResponse(String.format("opCode=%s&idStruttura=%s", ServerCodes.STANZE_STR, idStruttura));
                    ListaStanze.setIstanza(new ObjectMapper().readValue(response, ListaStanze.class));
                } catch (MalformedURLException ex) {
                    System.out.println("MalformerdURLException in class " + this.getClass().getName());
                } catch (IOException ex) {
                    System.out.println("IOException in class " + this.getClass().getName());
                } catch (HttpException ex) {
                    System.out.println("HttpException in class " + this.getClass().getName());
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        while(thread.getState() != Thread.State.TERMINATED) { }
        new Thread(runnable).start();
    }
}

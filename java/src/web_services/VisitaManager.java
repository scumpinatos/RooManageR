
package web_services;

import constants.ServerCodes;
import entities.Visita;
import exceptions.HttpException;
import java.awt.Frame;
import java.io.IOException;
import java.net.MalformedURLException;


public class VisitaManager extends HttpConnection {
    
    public VisitaManager() {
        
    }
    
    public void addVisita(Visita input, Frame frame) {
        
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    String response = getResponse(String.format("opCode=%s&idStruttura=%s", ServerCodes.ADD_VIS, null));
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
    }
}

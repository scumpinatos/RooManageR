
package web_services;

import constants.ServerCodes;
import entities.Visita;
import java.awt.Frame;


public class VisitaManager extends HttpConnection {
    
    public VisitaManager() {
        
    }
    
    public void addVisita(Visita input, Frame frame) {
        
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                String response = getResponse(String.format("opCode=%s&idStruttura=%s", ServerCodes.ADD_VIS, null));
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        while(thread.getState() != Thread.State.TERMINATED) { }
    }
}

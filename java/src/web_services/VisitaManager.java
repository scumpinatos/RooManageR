
package web_services;

import constants.ServerCodes;
import entities.Visita;
import java.awt.Frame;
import javax.swing.JDialog;


public class VisitaManager extends HttpConnection {
    
    public VisitaManager() {
        
    }
    
    public void addVisita(Visita input, JDialog dialog) {
        
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                String response = getResponse(String.format("opCode=%s&idStruttura=%s", ServerCodes.INS_VIS, null));
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        while(thread.getState() != Thread.State.TERMINATED) { }
    }
}

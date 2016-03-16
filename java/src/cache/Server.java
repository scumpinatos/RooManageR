package cache;

import javax.swing.JOptionPane;

/**
 *
 * @author giandomenico
 */
public class Server {
    
    public static void serverOffline(Runnable runnable) {

        String messaggio = "Server offline. Cliccare SI per riprovare,\n"
                + "altrimenti cliccare NO per chiudere il programma";
        int choice = JOptionPane.showConfirmDialog(null, messaggio, null, JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            runnable.run();
        } else {
            System.exit(0);
        }
    }
}

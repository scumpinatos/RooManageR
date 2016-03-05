package interfaces;

import javax.swing.JOptionPane;

public class ICallbackGeneral implements ICallback<Object> {

    public ICallbackGeneral() {
    }
    
    public void result(Object obj) {
        if (obj != null) {
            JOptionPane.showMessageDialog(null, "Operazione non riuscita");
        }
    }
}

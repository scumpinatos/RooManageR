
package cache;

import entities.AnagraficaStanza;

public class AnagraficaStanzaTemp {

    private static AnagraficaStanzaTemp istanza;
    private static AnagraficaStanza anagraficaStanza;

    public static AnagraficaStanzaTemp getInstance() {
        if (istanza == null) {
            istanza = new AnagraficaStanzaTemp();
        }

        return istanza;
    }
    
    public void setAnagraficaStanzaTemp(AnagraficaStanza input) {
        this.anagraficaStanza = input;
    }
    
    public AnagraficaStanza getAnagraficaStanzaTemp() {
        return anagraficaStanza;
    }
}

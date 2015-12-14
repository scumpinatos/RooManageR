package cache.singular;

import entities.Visita;

public class VisitaTemp {

    private static Visita istanza;

    public static Visita getIstanza() {
        if(istanza == null)
            istanza = new Visita();
        return istanza;
    }

    public static void setIstanza(Visita istanza) {
        VisitaTemp.istanza = istanza;
    }

    
}

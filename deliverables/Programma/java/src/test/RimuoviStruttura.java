/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entities.Struttura;
import interfaces.ICallback;
import web_services.StrutturaManager;

/**
 * @author emanuelegargiulo
 * @author giandomenicoizzo  
 */
public class RimuoviStruttura {
    
    public static void main(String[] args) {
        
        System.out.println("STRUTTURA SELEZIONATA\n"
                + "Nome: Hotel Luna\n"
                + "Codice fiscale: CODICEFISCALE1\n"
                + "Descrizione: Descrizione Hotel Luna\n"
                + "Indirizzo: Indirizzo Hotel Luna\n"
                + "Agibile: 1\n"
                + "Numero stanze: 0");
        
        Struttura struttura = new Struttura();
        struttura.setNome("Hotel Luna");
        struttura.setDescrizione("Descrizione Hotel Luna");
        struttura.setIndirizzo("Indirizzo Hotel Luna");
        struttura.setAgibile(1);
        struttura.setCodiceFiscaleAnagrafica("CODICEFISCALE1");
        struttura.setnStanze(0);
        
        StrutturaManager manager = new StrutturaManager();
        manager.deleteStruttura(struttura, new ICallback<Struttura>() {
            @Override
            public void result(Struttura obj) {
                
                if (obj == null) {
                    System.out.println("STRUTTURA RIMOSSA CORRETTAMENTE.\n"
                            + "-----------------------------------");
                    
                } else {
                    System.out.println("ERRORE OPERAZIONE.\n"
                            + "-----------------------------------");
                }
            }
        });
    }
}

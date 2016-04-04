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
public class InserisciCaricaStruttura {
    
    public static void main(String[] args) {
        
        System.out.println("CREAZIONE STRUTTURA\n"
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
        manager.createStruttura(struttura, new ICallback<Struttura>() {
            @Override
            public void result(Struttura obj) {
                
                if (obj == null) {
                    System.out.println("STRUTTURA AGGIUNTA CORRETTAMENTE.\n"
                            + "-----------------------------------");

                    manager.readStruttura(struttura, new ICallback<Struttura>() {
                        @Override
                        public void result(Struttura obj) {

                            if (obj != null) {
                                System.out.println("STRUTTURA TROVATA NEL DATABASE.");
                                System.out.println(obj.getCodiceFiscaleAnagrafica() + "\n" +
                                        obj.getNome() + "\n" + 
                                        obj.getDescrizione()+ "\n" +
                                        obj.getIndirizzo() + "\n" +
                                        obj.getAgibile()+ "\n" +
                                        obj.getnStanze());
                            } else {
                                System.out.println("STRUTTURA NON TROVATA NEL DATABASE.\n"
                                        + "-----------------------------------");
                            }
                        }
                    });
                    
                } else {
                    System.out.println("ERRORE OPERAZIONE.\n"
                            + "-----------------------------------");
                }
            }
        });
    }
}

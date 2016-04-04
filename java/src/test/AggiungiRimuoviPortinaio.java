/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entities.AnagraficaMansione;
import interfaces.ICallback;
import web_services.AnagraficaMansioneManager;

/**
 * @author emanuelegargiulo
 * @author giandomenicoizzo  
 */
public class AggiungiRimuoviPortinaio {
    
    public static void main(String[] args) {
        
        System.out.println("CREAZIONE MANSIONE\n"
                + "Codice fiscale: CODICEFISCALE2\n"
                + "Codice fiscale proprietario: CODICEFISCALE1\n"
                + "Nome struttura: Hotel Luna\n"
                + "Password: 123stella\n"
                + "Tipo mansione: 1\n");
        
        AnagraficaMansione mansione = new AnagraficaMansione();
        mansione.setCodiceFiscaleAnagrafica("CODICEFISCALE2");
        mansione.setCodiceFiscaleProprietario("CODICEFISCALE1");
        mansione.setNomeStruttura("Hotel Luna");
        mansione.setPassword("123stella");
        mansione.setTipoMansione(1);
        
        AnagraficaMansioneManager manager = new AnagraficaMansioneManager();
        manager.addAnagraficaMansione(mansione, new ICallback<AnagraficaMansione>() {
            @Override
            public void result(AnagraficaMansione obj) {
                
                if(obj == null) {
                    System.out.println("MANSIONE AGGIUNTA CORRETTAMENTE\n"
                            + "------------------------------\n");
                    
                    manager.readAnagraficaMansione(mansione, new ICallback<AnagraficaMansione>() {
                        @Override
                        public void result(AnagraficaMansione obj) {
                            
                            if(obj != null) {
                                System.out.println("MANSIONE PRESENTE NEL DATABASE");
                                System.out.println(obj.getCodiceFiscaleAnagrafica() + "\n" +
                                        obj.getCodiceFiscaleProprietario() + "\n" +
                                        obj.getNomeStruttura() + "\n" +
                                        obj.getPassword() + "\n" +
                                        obj.getTipoMansione() + 
                                        "\n-----------------------");
                                
                                manager.deleteAnagraficaMansione(obj, new ICallback<AnagraficaMansione>() {
                                    @Override
                                    public void result(AnagraficaMansione obj) {
                                        if(obj == null) {
                                            System.out.println("MANSIONE RIMOSSA CORRETTAMENTE");
                                        } else {
                                            System.out.println("ERRORE OPERAZIONE RIMOZIONE MANSIONE");
                                        }
                                    }
                                });
                                
                            } else {
                                System.out.println("MANSIONE NON PRESENTE NEL DATABASE");
                            }
                        }
                    });
                } else {
                    System.out.println("ERRORE OPERAZIONE AGGIUNGI MANSIONE");
                }
            }
        });
    }
}

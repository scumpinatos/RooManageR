/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entities.Anagrafica;
import interfaces.ICallback;
import web_services.AnagraficaManager;

/**
 * @author emanuelegargiulo
 * @author giandomenicoizzo  
 */
public class InserisciCaricaAnagrafica {

    public static void main(String[] args) {

        System.out.println("CREAZIONE ANAGRAFICA\n"
                + "Codice fiscale: CODICEFISCALE\n"
                + "Nome: Mario\n"
                + "Cognome: Rossi\n"
                + "Data di nascita: 20/10/1890\n"
                + "Indirizzo: Piazza Napoleone 20\n"
                + "Nazionalita': ITA\n"
                + "Numero documento: 123456\n"
                + "Tipo documento: 1\n"
                + "Telefono: 0123456789\n"
                + "Cellulare: 3333333333\n"
                + "Email: prova@prova.it");

        Anagrafica anagrafica = new Anagrafica();
        anagrafica.setCodiceFiscale("CODICEFISCALE");
        anagrafica.setNome("Mario");
        anagrafica.setCognome("Rossi");
        anagrafica.setDataNascita("20/10/1890");
        anagrafica.setIndirizzo("Piazza Napoleone 20");
        anagrafica.setNazionalita("ITA");
        anagrafica.setNumeroDocumento("123456");
        anagrafica.setTipoDocumento(1);
        anagrafica.setTelefono("0123456789");
        anagrafica.setCellulare("3333333333");
        anagrafica.setEmail("prova@prova.it");

        AnagraficaManager manager = new AnagraficaManager();
        manager.addAnagrafica(anagrafica, new ICallback<Anagrafica>() {
            @Override
            public void result(Anagrafica obj) {

                if (obj == null) {
                    System.out.println("ANAGRAFICA AGGIUNTA CORRETTAMENTE.\n"
                            + "-----------------------------------");

                    manager.readAnagrafica("CODICEFISCALE", new ICallback<Anagrafica>() {
                        @Override
                        public void result(Anagrafica obj) {

                            if (obj != null) {
                                System.out.println("ANAGRAFICA TROVATA NEL DATABASE.");
                                System.out.println(obj.getCodiceFiscale() + "\n" +
                                        obj.getNome() + "\n" + 
                                        obj.getCognome() + "\n" +
                                        obj.getDataNascita() + "\n" + 
                                        obj.getIndirizzo() + "\n" +
                                        obj.getNazionalita() + "\n" +
                                        obj.getNumeroDocumento() + "\n" +
                                        obj.getTipoDocumento() + "\n" +
                                        obj.getTelefono() + "\n" +
                                        obj.getCellulare() + "\n" +
                                        obj.getEmail());
                            } else {
                                System.out.println("ANAGRAFICA NON TROVATA NEL DATABASE.\n"
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

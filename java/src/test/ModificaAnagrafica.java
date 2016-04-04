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
public class ModificaAnagrafica {
    
    public static void main(String[] args) {

        System.out.println("ANAGRAFICA SELEZIONATA\n"
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
        
        System.out.println("MODIFICHE APPORTATE\n"
                + "Nuovo Nome: Giuseppe\n"
                + "Nuovo Cognome: Bianchi\n"
                + "Nuova Data di nascita: 22/10/1890\n"
                + "Nuovo Indirizzo: Piazza Garibaldi 20\n"
                + "Nuovo Numero documento: 78912\n"
                + "Nuovo Tipo documento: 2\n");
        

        Anagrafica anagrafica = new Anagrafica();
        anagrafica.setCodiceFiscale("CODICEFISCALE");
        anagrafica.setNome("Giuseppe");
        anagrafica.setCognome("Bianchi");
        anagrafica.setDataNascita("22/10/1890");
        anagrafica.setIndirizzo("Piazza Garibaldi 20");
        anagrafica.setNazionalita("ITA");
        anagrafica.setNumeroDocumento("78912");
        anagrafica.setTipoDocumento(2);
        anagrafica.setTelefono("0123456789");
        anagrafica.setCellulare("3333333333");
        anagrafica.setEmail("prova@prova.it");

        AnagraficaManager manager = new AnagraficaManager();
        manager.updateAnagrafica(anagrafica, new ICallback<Anagrafica>() {
            @Override
            public void result(Anagrafica obj) {

                if (obj == null) {
                    System.out.println("ANAGRAFICA MODIFICATA CORRETTAMENTE.\n"
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entities.Anagrafica;

/**
 * @author emanuelegargiulo
 * @author giandomenicoizzo  
 */
public class EntityAnagraficaTest {
    public static void main(String[] args) {
        Anagrafica anagrafica = new Anagrafica(); 
        anagrafica.setNome("Simona Maria");
        anagrafica.setCognome("Cagnazzo");
        anagrafica.setCellulare("3403333333");
        anagrafica.setDataNascita("19/10/1990");
        anagrafica.setEmail("em@il.it");
        anagrafica.setNazionalita("ITA");
        anagrafica.setCodiceFiscale("CF0001");
        anagrafica.setTipoDocumento(1);
        anagrafica.setTelefono("911");
        anagrafica.setIndirizzo("Via Del Campo");
      
           System.out.println("CREAZIONE ANAGRAFICA:\n"+ 
       "Nome: Simona Maria\n" + 
       "Cognome: Cagnazzo\n" +
       "Cellulare: 3403333333\n"+
       "Codice Fiscale: CF0001\n"+
       "Data di Nascita: 19/10/1990\n"+ 
       "Email: em@il.it\n"+
       "Nazionalità: ITA\n" + 
       "Tipo Documento: 1\n" + 
       "Telefono: 911\n" + 
       "Indirizzo: Via del Campo\n\n");
             
        System.out.println(anagrafica.getNome()+ "\n" +
                anagrafica.getCognome() + "\n"+ 
                anagrafica.getCellulare() + "\n" + 
                anagrafica.getCodiceFiscale() + "\n" + 
                anagrafica.getDataNascita() + "\n" +
                anagrafica.getEmail() + "\n" + 
                anagrafica.getNazionalita() + "\n" +
                anagrafica.getTipoDocumento() + "\n" + 
                anagrafica.getTelefono() + "\n" +                 
                anagrafica.getIndirizzo());     
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entities.AnagraficaStanza;


/**
 * @author emanuelegargiulo
 * @author giandomenicoizzo  
 */
public class EntityAnagraficaStanzaTest {
      public static void main(String[] args) {
          AnagraficaStanza astanza = new AnagraficaStanza();
          astanza.setCodiceFiscaleAnagrafica("CFI001");
          astanza.setCodiceFiscaleProprietario("CFI002");
          astanza.setCosto(50);
          astanza.setIngresso("20/10/2014");
          astanza.setNomeStruttura("Hotel Luna");
          astanza.setNumeroStanza("2B");
          astanza.setTipo(1); // Stanza Singola
          astanza.setUscita("22/10/2014");
         
             System.out.println("CREAZIONE ANAGRAFICA Stanza: \n"+ 
       "Codice Fiscale Anagrafica: CF001\n" + 
       "Codice Fiscale Proprietario: CF002\n" +
       "Costo: 50\n" + 
       "Ingresso: 20/10/2014\n" + 
       "Nome Struttura: Hotel Luna\n"+
       "Numero Stanza: 2B\n"+
       "Tipo Stanza: 1\n"+ 
       "Data Uscita: 22/10/2014\n\n");
       
          
          System.out.println(astanza.getCodiceFiscaleAnagrafica() + "\n" + 
                  astanza.getCodiceFiscaleProprietario() + "\n" + 
                  astanza.getCosto() + "\n" + 
                  astanza.getIngresso() + "\n" + 
                  astanza.getNomeStruttura() + "\n"+ 
                  astanza.getNumeroStanza() + "\n" +
                  astanza.getTipo() + "\n" +
                  astanza.getUscita()+ "\n");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entities.Stanza;

/**
 * @author emanuelegargiulo
 * @author giandomenicoizzo  
 */
public class EntityStanzaTest {
     public static void main(String[] args) {
          Stanza stanza = new Stanza(); 
          stanza.setAgibile(1);
          stanza.setCodiceFiscaleProprietario("CF001");
          stanza.setDescrizione("Bella Stanza");
          stanza.setMq(20);
          stanza.setNumero("2B");
          stanza.setPermanenza(1);
          stanza.setVisita(1);
          stanza.setTipo(1);
          stanza.setNomeStruttura("Hotel Luna");
          
             System.out.println("CREAZIONE STANZA:\n"+ 
       "Stato di Agibilità: 1\n" + 
       "Codice Fiscale Proprietario: CF001\n" +
       "Descrizione: Bella stanza\n"+
       "MQ: 20\n"+
       "Numero: 2B\n"+ 
       "Permanenza: 1\n"+
       "Visita: 1\n" + 
       "Tipo : 1\n" + 
       "Nome Struttura: Hotel Luna\n\n");
        
          System.out.println(stanza.getAgibile() + "\n" + 
                  stanza.getCodiceFiscaleProprietario() + "\n" + 
                  stanza.getDescrizione()+ "\n" + 
                  stanza.getMq() + "\n" + 
                  stanza.getNumero() + "\n" + 
                  stanza.getPermanenza() + "\n" + 
                  stanza.getVisita() + "\n" + 
                  stanza.getTipo() + "\n" + 
                  stanza.getNomeStruttura());
          
          
     }         
}

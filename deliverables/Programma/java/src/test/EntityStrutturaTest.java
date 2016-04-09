/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entities.Struttura;

/**
 * @author emanuelegargiulo
 * @author giandomenicoizzo  
 */
public class EntityStrutturaTest {
     public static void main(String[] args) {
     Struttura struttura = new Struttura(); 
         struttura.setAgibile(1);
         struttura.setCodiceFiscaleAnagrafica("CF001");
         struttura.setDescrizione("Bella struttura");
         struttura.setIndirizzo("Via Del Campo");
         struttura.setnStanze(15);
         struttura.setNome("Hotel Luna");
         
                     System.out.println("CREAZIONE STRUTTURA:\n"+ 
       "Stato di Agibilità: 1\n" + 
       "Codice Fiscale Proprietario: CF001\n" +
       "Descrizione: Bella struttura\n"+
       "Indirizzo: Via del Campo\n"+
       "Numero di Stanze: 15\n" + 
       "Nome Struttura: Hotel Luna\n\n");
         
         System.out.println(struttura.getAgibile() + "\n" + 
                 struttura.getCodiceFiscaleAnagrafica() + "\n" + 
                 struttura.getDescrizione() + "\n" + 
                 struttura.getIndirizzo() + "\n" + 
                 struttura.getnStanze() + "\n" + 
                 struttura.getNome());
          
     }         
}

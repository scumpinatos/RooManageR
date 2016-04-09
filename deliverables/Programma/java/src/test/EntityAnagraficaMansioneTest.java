/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entities.AnagraficaMansione;

/**
 * 
 * @author emanuelegargiulo
 * @author giandomenicoizzo  
 */
public class EntityAnagraficaMansioneTest {
    public static void main(String[] args) {
        AnagraficaMansione amans = new AnagraficaMansione(); 
        amans.setCodiceFiscaleAnagrafica("CF0001");
        amans.setCodiceFiscaleProprietario("CF002");
        amans.setNomeStruttura("Hotel Luna");
        amans.setPassword("123stella");
        amans.setTipoMansione(1);
        
       System.out.println("CREAZIONE ANAGRAFICA MANSIONE: \n"+ 
       "Codice Fiscale Anagrafica: CF0001\n" + 
       "Codice Fiscale Proprietario: CF002\n" +
       "Nome Struttura: Hotel Luna\n"+
       "Password: 123stella\n"+
       "Tipo Mansione: 1\n\n");
       
       
        
       System.out.println(amans.getCodiceFiscaleAnagrafica() + "\n" + 
               amans.getCodiceFiscaleProprietario() + "\n" + 
               amans.getNomeStruttura() + "\n" + 
               amans.getPassword() + "\n" + 
               amans.getTipoMansione());
    }
}

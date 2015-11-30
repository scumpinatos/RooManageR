/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web_services;

import com.fasterxml.jackson.databind.ObjectMapper;
import constants.ServerCodes;
import exceptions.HttpException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author giandomenico
 */
public class StrutturaManager extends HttpConnection {
    
    public void getStanzeByStruttura(int idStruttura) {
        
        Runnable runnable = new Runnable() {
            
            @Override
            public void run() {
                try {
                    String response = getResponse(String.format("opCode=%s&idStruttura=%s",ServerCodes.STANZE_STR, idStruttura));
                    ObjectMapper mapper = new ObjectMapper();
                } catch (MalformedURLException ex) {
                    Logger.getLogger(StrutturaManager.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(StrutturaManager.class.getName()).log(Level.SEVERE, null, ex);
                } catch (HttpException ex) {
                    Logger.getLogger(StrutturaManager.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        };
        
        new Thread(runnable).start();
    }
}

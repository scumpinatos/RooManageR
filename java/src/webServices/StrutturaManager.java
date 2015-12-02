/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webServices;

import com.fasterxml.jackson.databind.ObjectMapper;
import constants.ServerCodes;
import entities.utils.ListaStanze;
import exceptions.HttpException;
import interfaces.ICallback;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author giandomenico
 */
public class StrutturaManager {

    public void getStanzeByStruttura(int idStruttura, ICallback<ListaStanze> callback) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    String response = HttpConnection.getResponse(String.format("opCode=%s&idStruttura=%s", ServerCodes.STANZE_STR, idStruttura));
                    if (callback != null) {
                        callback.onResult(new ObjectMapper().readValue(response, ListaStanze.class));
                    }
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

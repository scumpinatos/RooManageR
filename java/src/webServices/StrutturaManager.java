<<<<<<< HEAD:java/src/web_services/StrutturaManager.java

package web_services;

import com.fasterxml.jackson.databind.ObjectMapper;
import constants.ServerCodes;
import cache.ListaStanze;
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webServices;

import com.fasterxml.jackson.databind.ObjectMapper;
import constants.ServerCodes;
import entities.utils.ListaStanze;
>>>>>>> 37908266b704aa9c78522cbbea77e26ab2e38d16:java/src/webServices/StrutturaManager.java
import exceptions.HttpException;
import interfaces.ICallback;
import java.io.IOException;
import java.net.MalformedURLException;

<<<<<<< HEAD:java/src/web_services/StrutturaManager.java

public class StrutturaManager extends HttpConnection {
    
    public StrutturaManager() {
        
    }

    public void getStanzeByStruttura(int idStruttura) {
=======
/**
 *
 * @author giandomenico
 */
public class StrutturaManager {

    public void getStanzeByStruttura(int idStruttura, ICallback<ListaStanze> callback) {
>>>>>>> 37908266b704aa9c78522cbbea77e26ab2e38d16:java/src/webServices/StrutturaManager.java

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
<<<<<<< HEAD:java/src/web_services/StrutturaManager.java
                    String response = getResponse(String.format("opCode=%s&idStruttura=%s", ServerCodes.STANZE_STR, idStruttura));
                    ListaStanze.setIstanza(new ObjectMapper().readValue(response, ListaStanze.class));
=======
                    String response = HttpConnection.getResponse(String.format("opCode=%s&idStruttura=%s", ServerCodes.STANZE_STR, idStruttura));
                    if (callback != null) {
                        callback.onResult(new ObjectMapper().readValue(response, ListaStanze.class));
                    }
>>>>>>> 37908266b704aa9c78522cbbea77e26ab2e38d16:java/src/webServices/StrutturaManager.java
                } catch (MalformedURLException ex) {
                    System.out.println("MalformerdURLException in class " + this.getClass().getName());
                } catch (IOException ex) {
                    System.out.println("IOException in class " + this.getClass().getName());
                } catch (HttpException ex) {
                    System.out.println("HttpException in class " + this.getClass().getName());
                }
            }
        };

<<<<<<< HEAD:java/src/web_services/StrutturaManager.java
        Thread thread = new Thread(runnable);
        thread.start();
        while(thread.getState() != Thread.State.TERMINATED) { }
=======
        new Thread(runnable).start();
>>>>>>> 37908266b704aa9c78522cbbea77e26ab2e38d16:java/src/webServices/StrutturaManager.java
    }
}

package gef.roomanager.activities.utils;

import android.content.Context;
import android.net.ConnectivityManager;

import java.net.InetAddress;

/**
 * Created by ScumpinatoS on 14/10/2015.
 */
public class Utils {

    /**
     * Questo metodo ritorna l'IP di google.com (usato per vedere se ho connettività con l'esterno)
     *
     * @return
     */
    public boolean isInternetAvailable() {
        try {
            InetAddress ipAddr = InetAddress.getByName("http://www.google.it");
            return !ipAddr.equals("");
        } catch (Exception e) {
            return false;
        }
    }

    private boolean isNetworkConnected(Context mContext) {
        ConnectivityManager cm = (ConnectivityManager) mContext.getSystemService(Context.CONNECTIVITY_SERVICE);

        return cm.getActiveNetworkInfo() != null && cm.getActiveNetworkInfo().isConnected();
    }

}

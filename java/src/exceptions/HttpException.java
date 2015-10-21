package exceptions;

/**
 *
 * @author ScumpinatoS
 */
public class HttpException extends Exception {

    private int statusCode;
    
    public HttpException(int statusCode) {
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }
    
}

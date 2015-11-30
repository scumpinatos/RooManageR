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

    public HttpException(int statusCode, String message) {
        super(message);
        this.statusCode = statusCode;
    }
    
}

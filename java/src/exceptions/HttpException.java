package exceptions;

/**
 * Eccezione relativa alla connessione HTTP
 * @author emanuelegargiulo
 */
public class HttpException extends Exception {

    private int statusCode;
    
    /**
     *
     * @param statusCode
     */
    public HttpException(int statusCode) {
        this.statusCode = statusCode;
    }

    /**
     *
     * @return
     */
    public int getStatusCode() {
        return statusCode;
    }

    /**
     *
     * @param statusCode
     * @param message
     */
    public HttpException(int statusCode, String message) {
        super(message);
        this.statusCode = statusCode;
    }
    
    
}

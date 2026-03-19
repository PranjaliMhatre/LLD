package exception;

public class BoardNotValidException extends RuntimeException{
    public BoardNotValidException() {
        super();
    }

    public BoardNotValidException(String message) {
        super(message);
    }

    public BoardNotValidException(String message, Throwable cause) {
        super(message, cause);
    }

    public BoardNotValidException(Throwable cause) {
        super(cause);
    }

    protected BoardNotValidException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

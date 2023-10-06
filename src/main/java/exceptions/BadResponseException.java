package exceptions;

public class BadResponseException extends Exception {
    public BadResponseException () { }

    public BadResponseException(String message)
    {
        super(message);
    }
}

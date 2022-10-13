package sk.stuba.asos.exceptions;

public class CustomException extends RuntimeException{

    private int statusCode;

    public CustomException(String message, int statusCode) {
        super(message);
        this.statusCode = statusCode;
    }
}

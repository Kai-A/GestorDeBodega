package bsn.exception;

public class CedulaInvalidaException extends Exception{

    private String message;

    public CedulaInvalidaException(String message){
        this.message=message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

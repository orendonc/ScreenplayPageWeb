package co.com.google.certificacion.authentication.exceptions;

public class AuthenticationException extends AssertionError{

    public static final String THE_AUTHENTICATION_WAS_FAILED="The authentication was failed";
    public AuthenticationException(String message){
        super(message);
    }
    public AuthenticationException(String message,Throwable cause){
        super(message,cause);
    }
}

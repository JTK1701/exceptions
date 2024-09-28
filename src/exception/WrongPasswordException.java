package exception;

public class WrongPasswordException extends RuntimeException {
    public WrongPasswordException(String password) {
        super("Wrong password - " + password);
    }
}

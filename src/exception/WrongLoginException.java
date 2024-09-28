
package exception;

public class WrongLoginException extends RuntimeException {
    public WrongLoginException(String login) {
        super("Wrong login - " + login);
    }
}

import exception.WrongLoginException;
import exception.WrongPasswordException;

public class Main {

    public static void main(String[] args) {
        try {
            ud("JK_jhk1", "GhrT675_9", "GhrT675_");
        } catch (WrongLoginException wl) {
            System.out.println(wl.getMessage());
        } catch (WrongPasswordException wp) {
            System.out.println(wp.getMessage());
        }
    }

    private static void ud(String login, String password, String confirmPassword) {
        if (!login.matches("([a-zA-Z\\d_]*){1,20}")) {
            throw new WrongLoginException(login);
        }
        if (!password.matches("([a-zA-Z\\d_]*){1,20}")) {
            throw new WrongPasswordException(password);
        }
        if (!confirmPassword.equals(password)) {
            throw new WrongLoginException(confirmPassword);
        }
    }

}

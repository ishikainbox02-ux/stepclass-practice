import java.util.Scanner;

public class LoginSimulator {

    static void simulateLogin(String correctCode, String[] attempts) {

        boolean granted = false;

        for (int i = 0; i < attempts.length; i++) {

            if (attempts[i].equals(correctCode)) {
                System.out.println("Access granted on attempt " + (i + 1));
                granted = true;
                break;
            }
        }

        if (!granted) {
            System.out.println("Access denied — all attempts used");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctCode = "1234";

        String[] attempts = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter attempt " + (i + 1) + ": ");
            attempts[i] = sc.next();
        }

        simulateLogin(correctCode, attempts);
    }
}
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Login login = new Login();

        System.out.println("\n=== Register your account ===");

        login.registerUser(input);

        System.out.println("\n=== Login to the chat app ===");

        login.loginUser(input);
    }
}
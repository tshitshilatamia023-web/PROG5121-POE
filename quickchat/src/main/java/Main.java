import java.util.Scanner;

public class Main {


    //programs entry point
    public static void main(String[] args) {

        //scanner for taking input
        Scanner input = new Scanner(System.in);
        Login login = new Login();

        //calls registration logic
        System.out.println("\n=== Register your account ===");

        login.registerUser(input);

        //calls login logic
        System.out.println("\n=== Login to the chat app ===");

        login.loginUser(input);
    }
}
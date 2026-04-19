import java.util.Scanner;

public class Login {

    private String username;
    private String password;
    private String cellPhoneNumber;
    private String firstName;
    private String lastName;

    private String loguser;
    private String logpass;

    public boolean checkUserName(String username) {
        if(username.contains("_") && username.length() <= 5){
            return true;
        }
        return false;
    }

    public boolean checkPasswordComplexity(String password) {

        boolean hasUpperCase = false;
        boolean hasNumber = false;
        boolean hasSpecialCharacters = false;

        if (password.length() >= 8) {
            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);

                if (Character.isUpperCase(ch)) {
                    hasUpperCase = true;
                } else if (Character.isDigit(ch)) {
                    hasNumber = true;
                } else if (!Character.isLetterOrDigit(ch)) {
                    hasSpecialCharacters = true;
                }
            }
        }

        return hasUpperCase && hasNumber && hasSpecialCharacters;
    }

    public boolean checkCellPhoneNumber(String phone) {

        if (phone.length() == 12 && phone.contains("+27")){
            return true;
        }
        return false;
    }

    public void registerUser(Scanner input) {

        System.out.print("Enter first name: ");
        firstName = input.nextLine();

        System.out.print("Enter last name: ");
        lastName = input.nextLine();

        boolean correctUsername = false;
        while (!correctUsername) {

            System.out.print("Enter username: ");
            username = input.nextLine();

             if (checkUserName(username)) {
                 System.out.println("Username successfully captured");
                correctUsername = true;
             } else {
                 System.out.println("Username is not correctly formatted, please ensure username contains an underscore and is no more than 5 characters in length.");
             }
        }

        boolean correctPassword = false;
        while (!correctPassword) {

            System.out.print("Enter password: ");
            password = input.nextLine();

            if (checkPasswordComplexity(password)) {
                System.out.println("Password successfully captured");
                correctPassword = true;
            } else {
                System.out.println("Password is not correctly formatted, please ensure that the password contains at least eight characters, a capital letter, a number and a special character");
            }
        }

        boolean correctPhone = false;
        while (!correctPhone) {

            System.out.print("Enter Cellphone number: ");
            cellPhoneNumber = input.nextLine();

            if (checkCellPhoneNumber(cellPhoneNumber)) {
                System.out.println("Cellphone number successfully captured.");
                correctPhone = true;
            } else {
                System.out.println("Cellphone number incorrectly formatted or does not contain international code.");
            }
        }

        System.out.println("This user is successfully registered.");
    }

    public void loginUser(Scanner input) {

        System.out.print("Enter Registered username: ");
        loguser = input.nextLine();

        System.out.print("Enter Registered password: ");
        logpass = input.nextLine();

        System.out.println(returnLoginStatus());
    }

    public String returnLoginStatus() {

        if (loguser.equals(username) && logpass.equals(password)) {
            return "Welcome " + firstName + ", " + lastName + " it is great to see you again.";
        } else {
            return "Username or password is incorrect please try again.";
        }
    }
}
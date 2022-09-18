import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Password");
        String storedPassword = "admin";
        String givenPassword = scanner.next();
        System.out.println(storedPassword);
        System.out.println(givenPassword);
        givenPassword.equals(storedPassword);
        if(givenPassword.equals(storedPassword)){
            System.out.println("Password Correct");
        }else{
            System.out.println("Password Incorrect");
        }
    }
}

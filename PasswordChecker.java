import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        int length = password.length();
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        String specialCharacters = "!@#$%^&*";

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (Character.isUpperCase(c)) {
                hasUpper = true;
            } else if (Character.isLowerCase(c)) {
                hasLower = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (specialCharacters.indexOf(c) >= 0) {
                hasSpecial = true;
            }
        }

        int score = 0;
        if (length >= 8) score++;
        if (hasUpper) score++;
        if (hasLower) score++;
        if (hasDigit) score++;
        if (hasSpecial) score++;

        System.out.println("\nPassword Analysis");
        System.out.println("Length: " + length);
        System.out.println("Has uppercase letter: " + hasUpper);
        System.out.println("Has lowercase letter: " + hasLower);
        System.out.println("Has number: " + hasDigit);
        System.out.println("Has special character: " + hasSpecial);

        if (score <= 2) {
            System.out.println("\nPassword Strength: Weak");
        } else if (score <= 4) {
            System.out.println("\nPassword Strength: Medium");
        } else {
            System.out.println("\nPassword Strength: Strong");
        }

        sc.close();
    }
}

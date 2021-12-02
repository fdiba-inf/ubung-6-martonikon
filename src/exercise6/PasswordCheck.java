package exercise6;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int passLength;
        int digitCount = 0;
        boolean passValid = true;
        do {
            passValid = true;
            String password = input.next();
            passLength = password.length();
            for (int i = 0; i < passLength; i++) {
                if (!Character.isLetterOrDigit(password.charAt(i))) {
                    passValid = false;
                    break;
                } else if (Character.isDigit(password.charAt(i))) {
                    digitCount++;
                }
            }
        } while (!passValid || digitCount < 2 || passLength < 8);
        System.out.println("Password valid!");
    }
}
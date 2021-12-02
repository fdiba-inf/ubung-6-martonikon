package exercise6;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        String temp = Integer.toString(number);
        int[] newGuess = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++)
        {
          newGuess[i] = temp.charAt(i) - '0';
        }

        boolean flag = true;
        for(int i = 0; i < newGuess.length; i++) {
          if(newGuess[i] != newGuess[newGuess.length - i - 1]) {
            flag = false;
          }
        }

        System.out.println("Palindrome: " + String.valueOf(flag));
    }
}
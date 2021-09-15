package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int tries = 0;
        while (tries <= 3) {
            System.out.println("Enter your guess");
            int userGuess = input.nextInt();
            int targetNumber = random.nextInt(20);
            if (userGuess == targetNumber) {
                System.out.println("Correct");
            }
            if (userGuess != targetNumber) {
                System.out.println("Incorrect");
                tries++;
            }
            if (tries == 4) {
                System.out.println("The correct number was " + targetNumber);
            }
        }
    }
}

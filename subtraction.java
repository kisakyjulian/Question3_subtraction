/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.subtraction_main;

/**
 *
 * @author Admin
 */
 import java.util.Scanner;
import java.util.Random;
public class subtraction {
  
    public static void main(String[] args) {
        // Create a Random object to generate random numbers
        Random random = new Random();
        
        // Generate two single-digit integers
        int number1 = random.nextInt(30); // Generates a number between 0 and 29
        int number2 = random.nextInt(30); // Generates a number between 0 and 29
        
        // Swap numbers if number1 is less than number2
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        // Prompt the student with the question
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is " + number1 + " - " + number2 + "?");
        int answer = scanner.nextInt();
        
        // Check the student's answer and display whether it is correct
        if (answer == (number1 - number2)) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong. The correct answer is " + (number1 - number2));
        }
        // Close the scanner
        scanner.close();
    }
}



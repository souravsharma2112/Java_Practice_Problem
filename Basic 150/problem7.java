// 7. Write a Java program that takes a number as input and prints its multiplication table up to 10

import java.util.Scanner;

public class problem7 {
    public static void main(String[] args) {
        Scanner takingInput = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int value = takingInput.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(value + " X " + i + " = " + value * i);
        }
    }
}

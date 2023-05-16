// 12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

import java.util.Scanner;

public class problem12 {
    public static void main(String[] args) {
        Scanner takingInput = new Scanner(System.in);
        System.out.print("Enter the First Number :");
        int a = takingInput.nextInt();
        System.out.print("Enter the Second Number :");
        int b = takingInput.nextInt();
        System.out.print("Enter the Third Number :");
        int c = takingInput.nextInt();
        int sum = a + b + c;
        int avg = sum / 2;
        System.out.println("Sum : " + sum);
        System.out.println("Average : " + avg);
    }
}

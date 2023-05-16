// 6. Write a Java program to print the sum multiply subtract divide and remainder if two number 

import java.util.*;

public class problem6 {
    public static void main(String[] args) {
        Scanner takingInput = new Scanner(System.in);
        System.out.print("Enter the first Number : ");
        int a = takingInput.nextInt();
        System.out.print("Enter the second Number : ");
        int b = takingInput.nextInt();
        int sum = a + b;
        int subtract = a - b;
        int product = a * b;
        int divide = a / b;
        int remainder = a % b;
        System.out.println("Sum :" + sum);
        System.out.println("Subtract :" + subtract);
        System.out.println("Product :" + product);
        System.out.println("Divide :" + divide);
        System.out.println("Remainder :" + remainder);
    }
}
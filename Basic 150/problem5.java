// 5. Write a Java progranm takes two numbers as input and display the product of two number.

import java.util.*;

public class problem5 {
    public static void main(String[] args) {
        Scanner takingInput = new Scanner(System.in);
        System.out.print("Enter the first Number : ");
        int a = takingInput.nextInt();
        System.out.print("Enter the second Number : ");
        int b = takingInput.nextInt();
        int product = a * b;
        System.out.println("Product :" + product);
    }
}

package Practis;

import java.util.Scanner;

public class SumCalculating {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number ");
        int a = scan.nextInt();
        System.out.println("Enter second number ");
        int b = scan.nextInt();

        System.out.println("Sum is " + (a + b));
    }
}

package Practis;

import java.util.Scanner;

public class AdvancedCalculator {
    public static void main(String[] args) {
        System.out.println("Make your choise");
        System.out.println("If you want Add (+), press 1");
        System.out.println("If you want Subtract  (-), press 2");
        System.out.println("If you want Multiply  (*), press 3");
        System.out.println("If you want Divide (/), press 4");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        System.out.println("Enter first number");
        int firstNumber = sc.nextInt();
        System.out.println("Enter second number");
        int secondNumber = sc.nextInt();

        switch (choice){
            case 1 :
                System.out.println("Result is " + (firstNumber + secondNumber));
                break;
            case 2 :
                System.out.println("Result is " + (firstNumber - secondNumber));
                break;
            case 3 :
                System.out.println("Result is " + (firstNumber * secondNumber));
                break;
            case 4:
                if (secondNumber <= 0){
                    System.out.println("You can't divide by 0");
                } else {
                    System.out.println("Result is " + (firstNumber / secondNumber));
                }
                break;
            default:
                System.out.println("Invalid choice!");
        }

    }
}

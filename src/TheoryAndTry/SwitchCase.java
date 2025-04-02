package TheoryAndTry;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age!");
        int age = sc.nextInt();
        switch (age){
            case 0 :
                System.out.println("Tou born!");
                break;
            case 7 :
                System.out.println("You go to school");
                break;
            case 18 :
                System.out.println("You finish school!");
                break;
            case 65:
                System.out.println("You are senior!");
                break;
            default:
                System.out.println("Error");
        }
    }
}

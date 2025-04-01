package Practis;

import java.util.Scanner;

public class SayHelloAndName {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please, enter your name ");
        String string1  = scanner1.nextLine();
        System.out.println("Hello " + string1);
    }
}

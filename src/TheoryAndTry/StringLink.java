package TheoryAndTry;

import java.util.Scanner;

public class StringLink {
    public static void main(String[] args) {
        int x = 5;
        String s = "Hello,";
        String s2 = " my name is ";

        Scanner sc = new Scanner(System.in);
        String s3 = sc.nextLine();

        System.out.println(s + s2 + s3);

        String s4 = "jkfddfjkhdfhjdfghjlhjdfgklgldfhj";
        int a = s4.length();
        System.out.println(a);

        String s5 = "FDSDFGSFDGSDdfgfdgfGDFDFGDGFdfdffdgDFGFGDDFG";
        String s6 = s5.toLowerCase();
        System.out.println(s6);
    }
}

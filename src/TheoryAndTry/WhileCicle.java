package TheoryAndTry;

import java.util.Scanner;

public class WhileCicle {
    public static void main(String[] args) {

//        int i = 0;
//        while (i < 5){
//            System.out.println("Number is " + i);
//            i++;
//        }
//        System.out.println(i);

//        Scanner sc = new Scanner(System.in);
//        int sum = 0;
//        while (sc.hasNextInt()){
//            int x = sc.nextInt();
//            sum = sum + x;
//            if (!(sc.hasNextInt())){
//                System.out.print("You enter isn't number, sum is ");
//            }
//        }
//        System.out.println(sum);


        Scanner cs = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        while (cs.hasNextInt()){
            int x = cs.nextInt();
            if (x > max){
                max = x;
            }
        }
        System.out.println(max);

    }
}

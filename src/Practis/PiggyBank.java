package Practis;

import java.util.Scanner;

public class PiggyBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int piggyBank = 0;
        int coin1 = 0, coin2 = 0, coin5 = 0, coin10 = 0;
        System.out.println("Введите монету (1, 2, 5, 10) или 0 для остановки");
        boolean isExit = true;


        while (isExit) {
            int dropCoin = sc.nextInt();
            if (dropCoin == 0) {
                break;
            }
            if (dropCoin == 1) {
                piggyBank += 1;
                coin1++;
            } else if (dropCoin == 2) {
                piggyBank += 2;
                coin2++;
            } else if (dropCoin == 5) {
                piggyBank += 5;
                coin5++;
            } else if (dropCoin == 10) {
                piggyBank += 10;
                coin10++;
            }
        }
        System.out.println("Монет по 1 руб: " + coin1);
        System.out.println("Монет по 2 руб: " + coin2);
        System.out.println("Монет по 5 руб: " + coin5);
        System.out.println("Монет по 10 руб: " + coin10);
        System.out.println("Общая сумма: " + piggyBank + " руб.");


    }
}

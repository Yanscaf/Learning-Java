package Practis;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 10_000;
        System.out.println("Доступный баланс " + balance);
        System.out.println("Введите сумму для снятия со счета: ");
        int amount = sc.nextInt();

        if (amount > balance || amount % 100 !=0){
            System.out.println("Невозможно выдать сумму");
        }

        int remaining = amount;
        int count500 = 0, count200 = 0, count100 = 0;

        while (remaining>=500){
            remaining-= 500;
            count500++;
        }

        while (remaining>=200){
            remaining-= 200;
            count200++;
        }

        while (remaining>=100){
            remaining-= 100;
            count100++;
        }

        if (remaining == 0){
            balance -= amount;
            System.out.println("Выдано:");
            System.out.println("500 руб: " + count500);
            System.out.println("200 руб: " + count200);
            System.out.println("100 руб: " + count100);
            System.out.println("Остаток: " + balance + " руб.");
        } else {
            System.out.println("Невозможно выдать сумму");
        }

    }
}

package Practis;

import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int attempt = 0;
        int truPassword = 123455;
        boolean access = true;
        System.out.println("У Вас есть 3 попытки");

        while (access){
            if (sc.nextInt() != truPassword){
                attempt++;
                System.out.println("Колличество попыток " + attempt);
                if (attempt >= 3){
                    access = false;
                    System.out.println("Доступ запрещён");
                }
            } else {
                System.out.println("Доступ разрешён");
                break;
            }
        }

    }
}

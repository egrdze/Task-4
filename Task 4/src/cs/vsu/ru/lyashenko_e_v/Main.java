package cs.vsu.ru.lyashenko_e_v;

import java.util.Locale;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        System.out.print("Введите число: ");
        int a = enterANubmber();
        int b = enterANubmber();
        leonardoSearchNumber(a, b);
    }

    public static int enterANubmber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void leonardoSearchNumber(int a1, int b1) {
        int s1 = 0;
        int s2 = 0;
        int z = 0;
        int i = 2;
        int[] count_n = new int[a1 + 1];
        count_n[0] = count_n[1] = 1;
        if (a1>=1) {
            s1 = s1 + 2;
        }
        if (b1>=1) {
            s2 = s2 + 2;
        }
        while ((a1>=z)||(b1>=z)) {
            count_n[i] = count_n[i - 1] + count_n[i - 2] + 1;
            z = count_n[i];
            if (a1>=z) {
                s1 = s1 + 1;
            }
            if (b1>=z) {
                s2 = s2 + 1;
            }
            i = i + 1;
        }
        System.out.println("Числа, большие или равные а: все числа, кроме первых " + s1);
        System.out.println("Числа, меньше или равные b: " + s2);
    }
}

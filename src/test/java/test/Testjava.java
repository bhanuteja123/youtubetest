package test;

import java.util.Scanner;

/**
 * Created by bhanu_000 on 26-05-2017.
 */
public class Testjava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int number;
        int avg;
        int count = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a number:");
            number = sc.nextInt();
            total = total + number;
        }
        avg = total / 10;
        System.out.println(avg);
        System.out.println("args = [" + args + "]");

    }
}

package com.sda.algorytmy;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int wynik = 0;
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            wynik = wynik + a;

        }
        System.out.println(wynik);
    }

}

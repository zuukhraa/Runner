package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        System.out.println("Старт");
        long r;
        r = (long)(100 + Math.random()*10001);
        ThreadR thread = new ThreadR();

        thread.submit(() -> {
                    System.out.println("Точка 1");
        });
        thread.submit(() -> {
            System.out.println("Точка 2");
        });
        thread.submit(() -> {
            System.out.println("Точка 3");
        });
        thread.submit(() -> {
            System.out.println("Точка 4");
        });
        thread.submit(() -> {
            System.out.println("Точка 5");
        });
        System.out.println("Финиш");
    }
}


package com.programming.solve_any_pattern_problem;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        /*
         1 2 3 4 5
         1 2 3 4
         1 2 3
         1 2
         1
         */
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            printThePattern(n);
        }
    }

    private static void printThePattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

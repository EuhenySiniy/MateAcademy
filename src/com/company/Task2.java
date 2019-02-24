package com.company;

import java.util.Scanner;

public class Task2 {
    private int middle;

    public void start() {
        Task2 go = new Task2();
        go.enterStarsNumber();
        go.top();
        go.bottom();
    }

    public void enterStarsNumber () {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number of stars - ");
        middle = in.nextInt();
    }

    public void top() {
        for (int top1 = 1; top1 < middle; top1++) {
            for (int top2 = middle; top2 > top1; top2--) {
                System.out.print(" ");
            }
            for (int top2 = 1; top2 < 2 * top1; top2++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void bottom() {
        for (int bottom1 = middle; bottom1 >= 1; bottom1--) {
            for (int bottom2 = middle; bottom2 > bottom1; bottom2--) {
                System.out.print(" ");
            }
            for (int bottom2 = 1; bottom2 < bottom1 * 2; bottom2++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

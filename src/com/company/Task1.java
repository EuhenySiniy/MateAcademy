package com.company;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    private int b1;
    private int b2;
    private int res1;
    private int res2;

    public void start() {
        Task1 go = new Task1();
        go.bet();
        go.exodus();
        System.out.println(go.check());
    }

    public void bet() {
        Scanner in = new Scanner(System.in);
        System.out.print("enter result 1st commands: ");
        b1 = in.nextInt();
        System.out.print("enter result 2nd commands: ");
        b2 = in.nextInt();
        System.out.println("your forecast - " + b1 + ":" + b2);
    }

    public void exodus() {
        Random random = new Random();
        res1 = random.nextInt(4);
        res2 = random.nextInt(4);
        System.out.println("match result - " + res1 + ":" + res2);
    }

    public int check() {
        String check = (b1 == res1 && b2 == res2) ? "2" : ((b1 > b2 && res1 > res2) || (b1 < b2 && res1 < res2) ? "1" : "0");
        return Integer.parseInt(check);
    }
}

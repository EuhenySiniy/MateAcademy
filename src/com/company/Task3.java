package com.company;

public class Task3 {

    public void start() {
        Task3 go = new Task3();
        System.out.println("Square number - " + go.square(10));
        System.out.println("Cube number - " + go.cube(3));
        System.out.println("Number in degree - " + go.power(4, 2));
    }

    public int square(int a) {
        return a * a;

    }

    public int cube(int a) {
        return a * a * a;
    }

    public int power(int num, int pow) {
        int res = 1;
        if (pow < 0) {
            System.out.println("negative degree?");
        } else {
            for (int i = 1; i <= pow; i++) {
                res = res * num;
            }
        }
        return res;
    }
}

package com.company;

public class Task4 {

    public void start() {
        Task4 go = new Task4();
        System.out.print("Фибоначчи - " + go.fibonacci(5));
        System.out.println();
        System.out.println("Факториал - " + go.factorial(6));
    }

    public int fibonacci(int num) {
        return (num == 0 || num == 1) ? num : (fibonacci(num - 1) + fibonacci(num - 2));
    }

    public int factorial(int num) {
        return (num == 1 || num == 0) ? 1 : factorial(num - 1) * num;
    }
}

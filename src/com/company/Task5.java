package com.company;

public class Task5 {

    public void start() {
        bubbleSort(new int[1000000]);
        shellSort(new int[1000000]);
        insertionSort(new int[1000000]);
        quickSort(new int[1000000]);
        shakeSort(new int[1000000]);
    }

    public static void bubbleSort(int arr[]) {
        long st, en, res;
        st = System.nanoTime();
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];

            for (int j = i - 1; j >= 0; j--) {
                int left = arr[j];

                if (num < left) {
                    arr[j + 1] = left;
                    arr[j] = num;
                } else {
                    break;
                }
            }
        }
        en = System.nanoTime();
        res = en - st;
        System.out.println("Пузырьковая сортировка, нс - " + res);
    }

    public static void shellSort(int arr[]) {
        long st, en, res;
        st = System.nanoTime();
        int a = arr.length / 2;
        while (a > 0) {
            for (int i = 0; i < arr.length - a; i++) {
                int j = i;
                while ((j >= 0) && (arr[j] > arr[j + a])) {
                    int temp = arr[j];
                    arr[j] = arr[j + a];
                    arr[j + a] = temp;
                    j--;
                }
            }
            a = a / 2;
        }
        en = System.nanoTime();
        res = en - st;
        System.out.println("Метод Шелла, нс - " + res);
    }

    public static void insertionSort(int arr[]) {
        long st, en, res;
        st = System.nanoTime();
        int j, temp;
        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];
            for (j = i - 1; j >= 0 && arr[j] > temp; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = temp;
        }
        en = System.nanoTime();
        res = en - st;
        System.out.println("Метод вставки, нс - " + res);
    }

    public static void quickSort(int arr[]) {
        long st, en, res;
        st = System.nanoTime();
        int index = 0, min = 0;
        for (int i = 0; i < arr.length; i++) {
            min = arr[i];
            index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    index = j;
                    min = arr[j];
                }
            }
            if (arr[i] != arr[index]) {
                arr[index] = arr[i];
                arr[i] = min;
            }
        }
        en = System.nanoTime();
        res = en - st;
        System.out.println("Метод выборки, нс - " + res);
    }

    public static void shakeSort(int arr[]) {
        long st, en, res;
        st = System.nanoTime();
        int left = 1, right = arr.length - 1;
        do {
            for (int i = right; i >= left; i--) {
                if (arr[i - 1] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                }
            }
            left++;
            for (int i = left; i <= right; i++) {
                if (arr[i - 1] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                }
            }
            right--;
        } while (left <= right);
        en = System.nanoTime();
        res = en - st;
        System.out.println("Метой Шейкера, нс - " + res);
    }
}

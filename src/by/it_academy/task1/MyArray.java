package by.it_academy.task1;

import java.util.Scanner;

public class MyArray {
    String strArray;

    public int[] inputArray(int n) {
        int[] array = new int[n];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public String outputArray(int[] array) {
        strArray = null;
        for (int i = 0; i < array.length; i++) {

            if (strArray == null) strArray = array[i] + " | ";
            else strArray = strArray + array[i] + " | ";
        }
        return strArray;
    }

    public int[] sortArray(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }
}
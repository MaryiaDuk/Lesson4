package by.it_academy.task1;

public class Main {
    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        System.out.println("Введите элементы массива: ");
        int[] array = myArray.inputArray(10);
        System.out.println("Массив:");
        System.out.println(myArray.outputArray(array));
        int[] sortArray = myArray.sortArray(array);
        System.out.println("Отсортированный массив:");
        System.out.println(myArray.outputArray(sortArray));
    }
}
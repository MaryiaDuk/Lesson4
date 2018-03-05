package by.it_academy.task2;

public class Main {
    public static void main(String[] args) {
        Pages pages = new Pages();
        System.out.println("Введите количество новостей:");
        int countN = pages.getNewsCount();
        int countP = pages.countPages(countN);
        System.out.println("Количество новостей: " + countN);
        System.out.println("Количество страниц: " + countP);
    }
}
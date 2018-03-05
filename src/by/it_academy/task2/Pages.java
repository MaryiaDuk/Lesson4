package by.it_academy.task2;

import java.util.Scanner;

public class Pages {
    int pages;
    int newsCount;
    Scanner scanner = new Scanner(System.in);

    public int countPages(int newsCount) {
        pages = newsCount / 10;
        if (newsCount % 10 != 0) pages = pages + 1;
        return pages;
    }

    public int getNewsCount() {
        newsCount = scanner.nextInt();
        return newsCount;
    }
}
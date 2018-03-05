package by.it_academy.task3;

import java.util.Scanner;

public class InputInf {
    private String Search;
    private String type;
    private String secondNameSearch;
    private int ageSearch;

    public boolean getSearch() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Начать поиск? Введите: 'Y' или 'N'?");
        do {
            Search = scan.nextLine();
        } while (Search.equals("Y") & Search.equals("N"));
        if (Search.equals("Y")) return true;
        return false;
    }

    public boolean getType() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите способ поиска:");
        System.out.println("1-по фамилии, 2- по возрасту. Введите: 1 или 2 ?");
        do {
            type = scan.nextLine();
        } while (type.equals("1") & type.equals("2"));
        if (type.equals("1")) return true;
        else return false;
    }

    public String getSecondNameSearch() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите Фамилию");
        secondNameSearch = scan.nextLine();
        return secondNameSearch;
    }

    public int getAgeSearch() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите возраст");
        ageSearch = scan.nextInt();
        return ageSearch;
    }
}
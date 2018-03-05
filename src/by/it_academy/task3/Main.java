package by.it_academy.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Patient[] search = new Patient[3];
        PatientSearch patientSearch = new PatientSearch();
        InputInf inputInformation = new InputInf();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Фамилия Имя. Диагноз. Возрост. Состояние здоровья(true/false)");
        System.out.println("Пациент 1: ");
        Patient patientOne = new Patient(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextInt(), scanner.nextBoolean());
        scanner.nextLine();
        System.out.println("Пациент 2: ");
        Patient patientTwo = new Patient(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextInt(), scanner.nextBoolean());
        scanner.nextLine();
        System.out.println("Пациент 3: ");
        Patient patientThree = new Patient(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextInt(), scanner.nextBoolean());
        System.out.println(patientOne);
        if (inputInformation.getSearch()) {
            if (inputInformation.getType()) {
                search[0] = patientOne;
                search[1] = patientTwo;
                search[2] = patientThree;
                patientSearch.searchName(search, inputInformation.getSecondNameSearch());
            } else {
                search[0] = patientOne;
                search[1] = patientTwo;
                search[2] = patientThree;
                patientSearch.searchAge(search, inputInformation.getAgeSearch());
            }
        } else System.out.println("Поиск отменен");
    }
}


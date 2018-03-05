package by.it_academy.task3;

public class Patient {
    String firstName;
    String secondName;
    String diagnosis;
    int age;
    boolean health;

    Patient(String secondName, String firstName, String diagnosis, int age, boolean health) {
        this.secondName = secondName;
        this.firstName = firstName;
        this.diagnosis = diagnosis;
        this.age = age;
        this.health = health;
    }

    public void getInformation() {
        System.out.println("Фамилия пациента: " + secondName);
        System.out.println("Имя пациента: " + firstName);
        System.out.println("Диагноз: " + diagnosis);
        System.out.println("Возрост: " + age);
        if (health) System.out.println("Состояние: здоров");
        else System.out.println("Состояние: болен");
    }

    public String getName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }
}

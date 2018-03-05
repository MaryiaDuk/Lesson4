package by.it_academy.task3;

public class PatientSearch {
    public void searchName(Patient[] search, String name) {
        for (int x = 0; x < search.length; x++) {
            if (search[x].getName().equals(name)) {
                search[x].getInformation();
            }
        }
    }

    public void searchAge(Patient[] search, int age) {
        for (int i = 0; i < search.length; i++) {
            if (search[i].getAge() == age) {
                search[i].getInformation();
            }
        }
    }
}

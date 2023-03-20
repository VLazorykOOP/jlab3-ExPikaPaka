package Task1;

import java.util.List;

public class HeadOfDepartment extends Person {
    String department;
    int workExperience;
    List<Teacher> teachers;

    public HeadOfDepartment(String name, String surname, String birthDate, String address, String phone, String email, String department, int workExperience, List<Teacher> teachers) {
        super(name, surname, birthDate, address, phone, email);
        this.department = department;
        this.workExperience = workExperience;
        this.teachers = teachers;
    }

    public void show() {
        super.show();
        System.out.println("Кафедра: " + department);
        System.out.println("Стаж роботи: " + workExperience);
        System.out.println("Подопічні: \n" + "=====================\n");
        for (Person teacher : teachers) {
            teacher.show();
            System.out.println();
        }
        System.out.println("=====================");

    }
}
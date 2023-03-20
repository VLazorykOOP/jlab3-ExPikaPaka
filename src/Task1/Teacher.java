package Task1;

import java.util.List;

public class Teacher extends Person {
    String department;
    int workExperience;
    List<String> disciplines;

    public Teacher(String name, String surname, String birthDate, String address, String phone, String email, String department, int workExperience, List<String> disciplines) {
        super(name, surname, birthDate, address, phone, email);
        this.department = department;
        this.workExperience = workExperience;
        this.disciplines = disciplines;
    }

    public void show() {
        super.show();
        System.out.println("Кафедра: " + department);
        System.out.println("Стаж роботи: " + workExperience);
        System.out.println("Список дисциплін: " + disciplines);
    }
}

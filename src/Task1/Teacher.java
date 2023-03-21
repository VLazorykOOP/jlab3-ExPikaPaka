package Task1;

import java.util.List;

public class Teacher extends Person {
    protected String department;
    protected int workExperience;
    protected List<String> disciplines;

    public Teacher(String name, String surname, String birthDate, String address, String phone, String email, String department, int workExperience, List<String> disciplines) {
        super(name, surname, birthDate, address, phone, email);
        this.department = department;
        this.workExperience = workExperience;
        this.disciplines = disciplines;
    }

    String getDepartment() {
        return department;
    }
    int getWorkExperience() {
        return workExperience;
    }
    List<String> getDisciplines() {
        return disciplines;
    }
    public void show() {
        super.show();
        System.out.println("Кафедра: " + department);
        System.out.println("Стаж роботи: " + workExperience);
        System.out.println("Список дисциплін: " + disciplines);
    }
}

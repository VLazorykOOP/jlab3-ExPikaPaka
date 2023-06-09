package Task1;

public class Student extends Person {
    protected String group;
    protected String recordBookNumber;
    double averageGrade;

    public Student(String name, String surname, String birthDate, String address, String phone, String email, String group, String recordBookNumber, double averageGrade) {
        super(name, surname, birthDate, address, phone, email);
        this.group = group;
        this.recordBookNumber = recordBookNumber;
        this.averageGrade = averageGrade;
    }

    String getGroup() {
        return group;
    }
    String getRecordBookNumber() {
        return recordBookNumber;
    }
    double getAverageGrade() {
        return averageGrade;
    }
    public void show() {
        super.show();
        System.out.println("Група: " + group);
        System.out.println("Номер залікової книжки: " + recordBookNumber);
        System.out.println("Середній бал: " + averageGrade);
    }
}
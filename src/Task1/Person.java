package Task1;

public class Person {
    String name;
    String surname;
    String birthDate;
    String address;
    String phone;
    String email;

    public Person(String name, String surname, String birthDate, String address, String phone, String email) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public void show() {
        System.out.println("Ім'я: " + name);
        System.out.println("Прізвище: " + surname);
        System.out.println("Дата народження: " + birthDate);
        System.out.println("Адреса: " + address);
        System.out.println("Телефон: " + phone);
        System.out.println("Електронна пошта: " + email);
    }
}

package Task1;

public class Person {
    protected String name;
    protected String surname;
    protected String birthDate;
    protected String address;
    protected String phone;
    protected String email;

    public Person(String name, String surname, String birthDate, String address, String phone, String email) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    String getName() {
        return name;
    }
    String getSurname() {
        return surname;
    }
    String getBirthDate() {
        return birthDate;
    }
    String getAddress() {
        return address;
    }
    String getPhone() {
        return phone;
    }
    String getEmail() {
        return email;
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

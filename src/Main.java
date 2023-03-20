import Task1.*;
import Task2.*;
import Task2.Date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class Main {

    public static void Task1Test() {
        ArrayList<String> TeDisciplines = new ArrayList<>();
        TeDisciplines.add("Math");
        TeDisciplines.add("Physics");


        List<Teacher> teachers = new ArrayList<>();
        Person[] people = new Person[5];
        people[0] = new Student("StName", "StSurname", "20.20.20", "StAddress", "000001", "StEmail@email.c", "StGroup", "1", 9);
        people[1] = new Teacher("Te1Name", "Te1Surname", "31.31.31", "Te1Address", "0000021", "Te1Email@email.c", "Te1Department", 1, TeDisciplines);
        people[2] = new Teacher("Te2Name", "Te2Surname", "32.32.32", "Te2Address", "0000022", "Te2Email@email.c", "Te2Department", 2, TeDisciplines);
        teachers.add((Teacher) people[1]);
        teachers.add((Teacher) people[2]);
        people[3] = new HeadOfDepartment("HDName", "HDSurname", "40.40.40", "HDAddress", "000003", "HDEmail@email.c", "HDDepartment", 4, teachers);
        people[4] = new Person("PeName", "PeSurname", "50.50.50", "PeAddress", "000004", "PeEmail@email.c");

        for (Person person : people) {
            person.show();
            System.out.println();
        }
    }

    public static void Task2Test() {
        Task2.Triad[] triads = new Task2.Triad[2];

        triads[0] = new Task2.Date(LocalDate.now());
        triads[1] = new Task2.Time(LocalTime.now());

        for (Triad triad : triads) {
            System.out.println(triad);
            triad.increment();
            System.out.println(triad);
            System.out.println();
        }
    }
    public static void Task3Test() {
        ArrayList<Task3.Triad> triads = new ArrayList<>();


        Task3.Triad date = new Task3.Date(LocalDate.now());
        triads.add(date);

        Task3.Triad time = new Task3.Time(LocalTime.now());
        triads.add(time);

        Task3.Triad date2 = new Task3.Date(LocalDate.now());
        Task3.Triad time2 = new Task3.Time(LocalTime.now());

        System.out.println("date: " + date);
        System.out.println("date2: " + date2);
        System.out.println("time: " + time);
        System.out.println("time2: " + time2);

        System.out.println("date.equals(date2): " + date.equals(date2)); // true
        System.out.println("time.equals(time2): " + time.equals(time2)); // true


        for (Task3.Triad triad : triads) {
            System.out.println("\n");
            triad.printValue();
            System.out.println();
            triad.increment();
            System.out.println();
            triad.printValue();
        }

        System.out.println("\n\ndate.equals(date2): " + date.equals(date2)); // true
        System.out.println("time.equals(time2): " + time.equals(time2)); // true
    }

    public static void main(String[] args) {
        System.out.println(" Lab 3");
	    // write your code here

        Scanner cin = new Scanner(System.in);
        String choice = " ";

        while (!choice.equals("4")) {
            choice = cin.next();

            if(choice.equals("1")) {
                Task1Test();
            }

            if(choice.equals("2")) {
                Task2Test();
            }

            if(choice.equals("3")) {
                Task3Test();
            }
        }
    }
}

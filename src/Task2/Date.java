package Task2;

import java.time.LocalDate;

public class Date extends Triad {
    public Date(LocalDate date) {
        super(date.getDayOfMonth(), date.getMonthValue(), date.getYear());
    }

    int getValue1() {
        return value1;
    }
    int getValue2() {
        return value2;
    }
    int getValue3() {
        return value3;
    }

    public void increment() {
        LocalDate date = LocalDate.of(value3, value2, value1);
        date = date.plusDays(1);

        value1 = date.getDayOfMonth();
        value2 = date.getMonthValue();
        value3 = date.getYear();
    }



    public void printValue() {
        System.out.printf("%02d/%02d/%04d", this.value1, this.value2, this.value3);
    }

    public String toString() {
        return String.format("Date: %02d/%02d/%04d", this.value1, this.value2, this.value3);
    }

    public boolean equals(Date obj) {
        if (obj == this) {
            return true;
        }
        return this.value1 == obj.value1 && this.value2 == obj.value2 && this.value3 == obj.value3;
    }
}


package Task3;

import java.time.LocalDate;

public class Date implements Triad {
    protected int value1;
    protected int value2;
    protected int value3;

    public Date(LocalDate date) {
        value1 = date.getDayOfMonth();
        value2 = date.getMonthValue();
        value3 = date.getYear();
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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Date other)) {
            return false;
        }
        return this.value1 == other.value1 && this.value2 == other.value2 && this.value3 == other.value3;
    }
}


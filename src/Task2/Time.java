package Task2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Time extends Triad {
    public Time(LocalTime time) {
        super(time.getHour(), time.getMinute(), time.getSecond());
    }

    public void increment() {
        LocalTime time = LocalTime.of(value1, value2, value3);
        time = time.plusSeconds(1);

        value1 = time.getHour();
        value2 = time.getMinute();
        value3 = time.getSecond();
    }

    public void printValue() {
        System.out.printf("%02d:%02d:%02d", this.value1, this.value2, this.value3);
    }

    public String toString() {
        return String.format("Time: %02d:%02d:%02d", this.value1, this.value2, this.value3);
    }

    public boolean equals(Time obj) {
        if (obj == this) {
            return true;
        }

        return this.value1 == obj.value1 && this.value2 == obj.value2 && this.value3 == obj.value3;
    }
}

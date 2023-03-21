package Task3;

import java.time.LocalTime;

public class Time implements Triad {
    protected int value1;
    protected int value2;
    protected int value3;

    public Time(LocalTime time) {
        value1 = time.getHour();
        value2 = time.getMinute();
        value3 = time.getSecond();
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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Time other)) {
            return false;
        }
        return this.value1 == other.value1 && this.value2 == other.value2 && this.value3 == other.value3;
    }
}

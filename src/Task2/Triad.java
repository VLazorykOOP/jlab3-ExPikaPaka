package Task2;

public abstract class Triad {
    protected int value1;
    protected int value2;
    protected int value3;

    public Triad(int v1, int v2, int v3) {
        this.value1 = v1;
        this.value2 = v2;
        this.value3 = v3;
    }

    public abstract void increment();

    public abstract void printValue();
}


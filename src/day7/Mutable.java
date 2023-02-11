package day7;

public class Mutable {
    private int a, b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public Mutable(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

package decorator.after;

public class Pine implements XmasTree {
    @Override
    public String toString() { return "pine"; }
    public double getPrice() { return 100.0; }
}

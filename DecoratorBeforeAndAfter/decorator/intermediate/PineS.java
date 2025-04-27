package decorator.intermediate;

public class PineS implements XmasTree {
    @Override
    public String toString() { return "pine with a star"; }
    public double getPrice() { return 100.0 + 30.0; }
}
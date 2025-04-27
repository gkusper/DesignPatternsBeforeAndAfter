package decorator.intermediate;

public class PineGS implements XmasTree {
    @Override
    public String toString() { return "pine with a globe with a star"; }
    public double getPrice() { return 100.0 + 20.0 + 30.0; }
}

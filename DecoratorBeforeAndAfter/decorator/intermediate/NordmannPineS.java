package decorator.intermediate;

public class NordmannPineS implements XmasTree {
    @Override
    public String toString() { return "nordmann pine with a star"; }
    public double getPrice() { return 130.0 + 30.0; }
}

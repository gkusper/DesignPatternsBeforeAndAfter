package decorator.intermediate;

public class NordmannPineGS implements XmasTree {
    @Override
    public String toString() { return "nordmann pine with a globe with a star"; }
    public double getPrice() { return 130.0 + 20.0 + 30.0; }
}

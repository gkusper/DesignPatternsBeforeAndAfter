package decorator.after;

public abstract class Decorator implements XmasTree {
    private XmasTree comp;
    public Decorator(XmasTree comp) { this.comp = comp; }
    @Override
    public String toString() { return comp.toString() + decorToString(); }
    public abstract String decorToString();
    public double getPrice() { return comp.getPrice() + decorGetPrice(); }
    public abstract double decorGetPrice();
}
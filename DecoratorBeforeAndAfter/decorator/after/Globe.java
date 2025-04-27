package decorator.after;

public class Globe extends Decorator {
    public Globe(XmasTree comp) { super(comp); }
    @Override
    public String decorToString() { return " with a glob"; }
    @Override
    public double decorGetPrice() { return 20.0; }
}
package decorator.after;

public class Globe extends Decorator {
    public Globe(XmasTree comp) { super(comp); }
    @Override
    public String decorToString() { return " with a globe"; }
    @Override
    public double decorGetPrice() { return 20.0; }
}

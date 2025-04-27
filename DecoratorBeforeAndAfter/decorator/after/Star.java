package decorator.after;

public class Star extends Decorator {
    public Star(XmasTree comp) { super(comp); }
    @Override
    public String decorToString() { return " with a star"; }
    @Override
    public double decorGetPrice() { return 30.0; }
}
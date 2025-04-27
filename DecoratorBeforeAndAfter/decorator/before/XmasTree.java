package decorator.before;

public class XmasTree {
    String tree;
    boolean globe, star;
    public XmasTree(String t) {
        assert(t.equals("pine") || t.equals("nordmann pine"));
        this.tree = t;
    }
    public void addGlobe() { globe = true; }
    public void addStar() { star = true; }
    @Override
    public String toString() {
        return tree + (globe ? " with a globe" : "") + (star ? " with a star" : "");
    }
    public double getPrice() {
        double price = 0.0;
        if (tree.equals("nordmann pine")) { price += 130.0; }
        else if (tree.equals("pine")) { price += 100.0; }
        if (globe) { price += 20; }
        if (star) { price += 30; }
        return price;
    }
}
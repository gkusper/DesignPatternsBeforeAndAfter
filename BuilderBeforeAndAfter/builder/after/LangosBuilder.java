package builder.after;

public class LangosBuilder implements FoodBuilder {
    Food f = new Food();
    public LangosBuilder() {
        f.setType("langos");
        f.setBase("sour cream");
    }
    public FoodBuilder addBase(String base) {
        if (base.equals("sour cream") || base.equals("ketchup")) {
            f.setBase(base);
        }
        return this;
    }
    public FoodBuilder addTopping(String top) {
        if (top.equals("cheese") || top.equals("salt")) {
            f.setTopping(top+",");
        }
        return this;
    }
    public Food build() { return f; }
}

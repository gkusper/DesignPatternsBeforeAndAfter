package builder.after;

public class PizzaBuilder implements FoodBuilder {
    Food f = new Food();
    public PizzaBuilder() {
        f.setType("pizza");
        f.setBase("tomato sauce");
    }
    public FoodBuilder addBase(String base) {
        if (base.equals("sour cream") || base.equals("tomato sauce")) {
            f.setBase(base);
        }
        return this;
    }
    public FoodBuilder addTopping(String top) {
        if (top.equals("ham") || top.equals("corn") || top.equals("cheese")) {
            f.setTopping(top+",");
        }
        return this;
    }
    public Food build() { return f; }
}
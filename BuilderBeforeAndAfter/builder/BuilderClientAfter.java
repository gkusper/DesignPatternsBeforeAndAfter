package builder;
import builder.after.*;

public class BuilderClientAfter {
    public static void main(String[] args) {
        FoodBuilder fb = new PizzaBuilder();
        fb.addBase("tomato sauce").addTopping("ham").addTopping("corn");
        Food f = fb.build();
        System.out.println(f);
    }
}

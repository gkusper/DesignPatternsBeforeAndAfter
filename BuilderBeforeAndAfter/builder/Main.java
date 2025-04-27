package builder;
import builder.before.Food;
import builder.after.*;
public class Main {
    public static void main(String[] args) {
        builder.before.Food f1 = new builder.before.Food();
        f1.setType("pizza");
        f1.setBase("tomato sauce");
        f1.setTopping("ham");
        f1.setTopping("corn");
        System.out.println(f1);
        System.out.println("Hello, World!");
        FoodBuilder fb = new PizzaBuilder();
        fb.addBase("tomato sauce").addTopping("ham").addTopping("corn");
        builder.after.Food f2 = fb.build();
        System.out.println(f2);
    }
}
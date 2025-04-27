package builder;
import builder.before.Food;

public class BuilderClientBefore {
    public static void main(String[] args) {
        Food f = new Food();
        f.setType("pizza");
        f.setBase("tomato sauce");
        f.setTopping("ham");
        f.setTopping("corn");
        System.out.println(f);
    }
}

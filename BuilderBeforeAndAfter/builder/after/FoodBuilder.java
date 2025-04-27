package builder.after;

public interface FoodBuilder {
    FoodBuilder addBase(String base);
    FoodBuilder addTopping(String top);
    Food build();
}

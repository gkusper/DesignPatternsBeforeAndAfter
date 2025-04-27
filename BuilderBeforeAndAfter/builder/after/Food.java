package builder.after;

public class Food {
    String type, base, topping = "";
    public void setType(String type) { this.type = type; }
    public void setBase(String base) { this.base = base; }
    public void setTopping(String top) { this.topping += top; }
    @Override
    public String toString() {
        return "type: " + type + ", base: " + base + ", topping: " + topping;
    }
}

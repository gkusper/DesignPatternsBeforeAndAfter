package builder.before;

public class Food {
    String type, base, topping = "";
    public void setType(String type) {
        this.type = type;
        if (type.equals("langos")) { base = "sour cream"; }
        else if (type.equals("pizza")) { base = "tomato sauce"; }
    }
    public void setBase(String base) {
        if (type.equals("langos")) {
            if (base.equals("sour cream") || base.equals("ketchup")) {
                this.base = base;
            }
        }
        else if (type.equals("pizza")) {
            if (base.equals("sour cream") || base.equals("tomato sauce")) {
                this.base = base;
            }
        }
    }
    public void setTopping(String top) {
        if (type.equals("langos")) {
            if (top.equals("cheese") || top.equals("salt")) {
                this.topping += top+",";
            }
        }
        else if (type.equals("pizza")) {
            if (top.equals("ham") || top.equals("corn") || top.equals("cheese")) {
                this.topping += top+",";
            }
        }
    }
    @Override
    public String toString() {
        return "type: " + type + ", base: " + base + ", topping: " + topping;
    }
}

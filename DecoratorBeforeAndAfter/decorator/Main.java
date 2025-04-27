package decorator;
import decorator.before.*;
import decorator.intermediate.*;
import decorator.after.*;

public class Main {
    public static void main(String[] args) {
        decorator.before.XmasTree xtree1 = new decorator.before.XmasTree("pine");
        xtree1.addStar();
        xtree1.addGlobe();
        System.out.println(xtree1.toString());
        System.out.println("price:"+xtree1.getPrice());
        decorator.intermediate.XmasTree xtree2 = new PineGS();
        System.out.println(xtree2.toString());
        System.out.println("price:"+xtree2.getPrice());
        decorator.after.XmasTree xtree3 =
                new Globe(new Star(new decorator.after.Pine()));
        System.out.println(xtree2.toString());
        System.out.println("price:"+xtree2.getPrice());
    }
}
package bridge.after;

import java.util.Scanner;

public abstract class Pay {
    double amout;
    public void setPayInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Amount?");
        amout = sc.nextDouble();
        setPayInfoImp();
    }
    protected abstract void setPayInfoImp();
    public void printPayInfo() {
        System.out.println("Payed amount: " + amout);
        printPayedByInfo();
    }
    protected abstract void printPayedByInfo();
}
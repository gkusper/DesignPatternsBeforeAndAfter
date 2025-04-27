package bridge.after;

import java.util.Scanner;

public class PayByCash extends Pay{
    String currency;
    @Override
    protected void setPayInfoImp() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Currency?(USD,...)");
        currency = sc.next();
    }
    @Override
    protected void printPayedByInfo() {
        System.out.println(" in currency: " + currency);
    }
}

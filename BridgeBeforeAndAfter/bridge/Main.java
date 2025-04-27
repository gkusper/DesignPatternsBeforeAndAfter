package bridge;
import bridge.before.Purchase;
import bridge.after.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        bridge.before.Purchase p1 = new bridge.before.Purchase();
        p1.printBill();
        bridge.after.Purchase p2;
        bridge.after.Pay payMethod;
        Scanner sc = new Scanner(System.in);
        System.out.println("Is it a company?");
        boolean isCompany = sc.nextBoolean();
        System.out.println("Pay by cash?");
        boolean payByCash = sc.nextBoolean();
        if (payByCash) { payMethod = new PayByCash(); }
        else { payMethod = new PayByBankcard(); }
        if (isCompany) { p2 = new CompanyPurchase(payMethod); }
        else { p2 = new PersonalPurchase(payMethod); }
        p2.printBill();
    }
}
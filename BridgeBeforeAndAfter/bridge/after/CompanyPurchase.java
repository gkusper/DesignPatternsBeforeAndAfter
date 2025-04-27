package bridge.after;
import java.util.Scanner;

public class CompanyPurchase extends Purchase {
    public CompanyPurchase(Pay pay){ super(pay); }
    String companyName, taxNumber;
    @Override
    protected void setPurchaseInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Company name?");
        companyName = sc.next();
        System.out.println("Tax number?");
        taxNumber = sc.next();
    }
    @Override
    protected void printBillImp() {
        System.out.println("Company name: " + companyName);
        System.out.println("Tax numbeber: " + taxNumber);
    }
}

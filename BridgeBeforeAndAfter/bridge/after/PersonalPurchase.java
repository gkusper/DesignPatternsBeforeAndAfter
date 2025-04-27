package bridge.after;
import java.util.Scanner;

public class PersonalPurchase extends Purchase {
    public PersonalPurchase(Pay pay){ super(pay); }
    String nameFirst, nameLast;
    @Override
    protected void setPurchaseInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("First name?");
        nameFirst = sc.next();
        System.out.println("Last number?");
        nameLast = sc.next();
    }
    @Override
    protected void printBillImp() {
        System.out.println("First name: " + nameFirst);
        System.out.println("Last name: " + nameLast);
    }
}

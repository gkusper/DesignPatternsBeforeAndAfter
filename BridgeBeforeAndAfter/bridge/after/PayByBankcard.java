package bridge.after;

import java.util.Scanner;

public class PayByBankcard extends Pay {
    String bankcardNumber;
    @Override
    protected void setPayInfoImp() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bankcard number?");
        bankcardNumber = sc.next();
    }
    @Override
    protected void printPayedByInfo() {
        System.out.println(" by bankcard: " + bankcardNumber);
    }
}

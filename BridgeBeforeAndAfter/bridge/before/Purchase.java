package bridge.before;
import java.util.Scanner;

public class Purchase {
    private boolean isCompany;
    private boolean payByCash;
    Scanner sc = new Scanner(System.in);
    public Purchase() {
        setIsCompany();
        setPayByCash();
        setPurchaseInfo();
        setPayInfo();
    }
    private void setIsCompany() {
        System.out.println("Is it a company?");
        isCompany = sc.nextBoolean();
    }
    private void setPayByCash() {
        System.out.println("Pay by cash?");
        payByCash = sc.nextBoolean();
    }
    String companyName, taxNumber, nameFirst, nameLast;
    private void setPurchaseInfo() {
        if (isCompany == true) {
            System.out.println("Company name?");
            companyName = sc.next();
            System.out.println("Tax number?");
            taxNumber = sc.next();
        }
        else {
            System.out.println("First name?");
            nameFirst = sc.next();
            System.out.println("Last number?");
            nameLast = sc.next();
        }
    }
    double amout;
    String currency, bankcardNumber;
    private void setPayInfo() {
        System.out.println("Amount?");
        amout = sc.nextDouble();
        if (payByCash == true) {
            System.out.println("Currency?(USD,...)");
            currency = sc.next();
        }
        else {
            System.out.println("Bankcard number?");
            bankcardNumber = sc.next();
        }
    }
    public void printBill() {
        System.out.println("Your bill:");
        if (isCompany == true) {
            System.out.println("Company name: " + companyName);
            System.out.println("Tax numbeber: " + taxNumber);
        }
        else {
            System.out.println("First name: " + nameFirst);
            System.out.println("Last name: " + nameLast);
        }
        printPayInfo();
    }
    private void printPayInfo() {
        System.out.println("Payed amount: " + amout);
        if (payByCash == true) {
            System.out.println(" in currency: " + currency);
        }
        else {
            System.out.println(" by bankcard: " + bankcardNumber);
        }
    }
}

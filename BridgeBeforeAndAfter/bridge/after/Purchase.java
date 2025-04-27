package bridge.after;

public abstract class Purchase {
    private Pay pay;
    public Purchase(Pay pay){
        this.pay=pay;
        setPurchaseInfo();
        pay.setPayInfo();
    }
    protected abstract void setPurchaseInfo();
    public void printBill() {
        printBillImp();
        pay.printPayInfo();
    }
    protected abstract void printBillImp();
}

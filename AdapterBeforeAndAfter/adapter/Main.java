package adapter;

public class Main {
    public static void main(String[] args) {
        AdapteeV1 v1 = new AdapteeV1();
        AdapteeV2 v2 = new AdapteeV2();
        adapter.before.AdapterClient adapter1 = new adapter.before.AdapterClient(1,v1,v2);
        System.out.println(adapter1.getAnswer("Bronson"));
        adapter1 = new adapter.before.AdapterClient(2,v1,v2);
        System.out.println(adapter1.getAnswer("Bronson"));
        adapter.after.AdapterClient adapter2 = new adapter.after.AdapterClient(1,v1,v2);
        System.out.println(adapter2.getAnswer("Bronson"));
        adapter2 = new adapter.after.AdapterClient(2,v1,v2);
        System.out.println(adapter2.getAnswer("Bronson"));
    }
}
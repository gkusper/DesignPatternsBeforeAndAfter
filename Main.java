public class Main {
    public static void main(String[] args) {
        AdapteeV1 v1 = new AdapteeV1();
        AdapteeV2 v2 = new AdapteeV2();
        AdapterClientBefore adapter1 = new AdapterClientBefore(1,v1,v2);
        System.out.println(adapter1.getAnswer("Bronson"));
        adapter1 = new AdapterClientBefore(2,v1,v2);
        System.out.println(adapter1.getAnswer("Bronson"));
        AdapterClientAfter adapter2 = new AdapterClientAfter(1,v1,v2);
        System.out.println(adapter2.getAnswer("Bronson"));
        adapter2 = new AdapterClientAfter(2,v1,v2);
        System.out.println(adapter2.getAnswer("Bronson"));
    }
}
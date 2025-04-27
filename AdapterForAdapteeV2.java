public class AdapterForAdapteeV2 implements Adapter {
    AdapteeV2 adaptee;
    public AdapterForAdapteeV2(AdapteeV2 adaptee) { this.adaptee = adaptee; }
    public String getAnswer(String question) {
        return adaptee.myAnswer(question, null, null, null);
    }
    public String getAnswer(String question, int year) {
        return adaptee.myAnswer(question, String.valueOf(year), null, null);
    }
}
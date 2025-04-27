public class AdapterForAdapteeV1 implements Adapter {
    AdapteeV1 adaptee;
    public AdapterForAdapteeV1(AdapteeV1 adaptee) { this.adaptee = adaptee; }
    public String getAnswer(String question) {
        return adaptee.answerEngine(question);
    }
    public String getAnswer(String question, int year) {
        return adaptee.answerEngine(question, year);
    }
}
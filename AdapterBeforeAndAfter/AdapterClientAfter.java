public class AdapterClientAfter {
    Adapter adapt;
    public AdapterClientAfter(int ver, AdapteeV1 v1, AdapteeV2 v2) {
        if (ver == 1) { adapt = new AdapterForAdapteeV1(v1); }
        else if (ver == 2) { adapt = new AdapterForAdapteeV2(v2); }
        else throw new RuntimeException("Unsupported adapter version");
    }
    public String getAnswer(String question) {
        return adapt.getAnswer(question);
    }
    public String getAnswer(String question, int year) {
        return adapt.getAnswer(question, year);
    }
}
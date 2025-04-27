package adapter.after;
import adapter.AdapteeV1;
import adapter.AdapteeV2;

public class AdapterClient {
    Adapter adapt;
    public AdapterClient(int ver, AdapteeV1 v1, AdapteeV2 v2) {
        assert(ver == 1 || ver == 2);
        if (ver == 1) { adapt = new AdapterForAdapteeV1(v1); }
        else if (ver == 2) { adapt = new AdapterForAdapteeV2(v2); }
    }
    public String getAnswer(String question) {
        return adapt.getAnswer(question);
    }
    public String getAnswer(String question, int year) {
        return adapt.getAnswer(question, year);
    }
}
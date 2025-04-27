public class AdapterClientBefore {
    int ver;
    AdapteeV1 v1;
    AdapteeV2 v2;
    public AdapterClientBefore(int ver, AdapteeV1 v1, AdapteeV2 v2) {
        this.ver = ver;
        this.v1 = v1;
        this.v2 = v2;
    }
    public String getAnswer(String question) {
        String answer = "I don't know";
        if (ver == 1) { answer = v1.answerEngine(question); }
        else if(ver == 2) { answer = v2.myAnswer(question, null, null, null); }
        return answer;
    }
    public String getAnswer(String question, int year) {
        String answer = "I don't know";
        if (ver == 1) { answer = v1.answerEngine(question, year); }
        else if(ver == 2) {
            answer = v2.myAnswer(question, String.valueOf(year), null, null);
        }
        return answer;
    }
}
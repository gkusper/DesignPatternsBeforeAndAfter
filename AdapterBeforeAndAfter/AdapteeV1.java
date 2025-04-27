public class AdapteeV1 {
    private String[] actors = {"Charles Bronson:1921","Ryan Reynolds:1976"};
    public String answerEngine(String question) {
        for(String actor : actors) {
            if (actor.contains(question)) { return actor; }
        }
        return "I don't know!";
    }
    public String answerEngine(String question, int year) {
        String yearStr = String.valueOf(year);
        for(String actor : actors) {
            if (actor.contains(question) || actor.contains(yearStr)) {
                return actor;
            }
        }
        return "I don't know!";
    }
}
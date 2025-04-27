public class AdapteeV2 {
    private String[] actors = {"Charles Bronson:1921:2003:actor",
            "Ryan Reynolds:1976:null:actor"};
    public String myAnswer(String question, String birthYear,
                           String deathYear, String jobb) {
        for(String actor : actors) {
            String[] data = actor.split(":");
            if(data[0].contains(question) ||
                    (birthYear!=null && data[1].equals(birthYear)) ||
                    (deathYear!=null && data[2].equals(deathYear)) ||
                    (jobb!=null && data[3].equals(jobb))) {
                return actor;
            }
        }
        return "I don't know!";
    }
}
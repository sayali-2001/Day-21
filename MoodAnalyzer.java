package bridgelabz;

public class MoodAnalyzer {
    public String moodAnalyse(String message) {
        if (message.contains("sad")) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }

    public static void main(String[] args) {
        MoodAnalyzer mood = new MoodAnalyzer();
        System.out.println(mood.moodAnalyse(" Sad Mood"));
        System.out.println(mood.moodAnalyse(" Any Mood"));
    }



}

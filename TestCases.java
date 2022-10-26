package bridgelabz;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

public class TestCases {
    MoodAnalyzer mood = new MoodAnalyzer();
    @Test
    public void methodShouldReturnTrueWhenMoodSad() {
        String actual = mood.moodAnalyse(" Sad mood");
        String expected = "SAD";
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void methodShouldReturnHappyWhenMoodAny(){
        String actual = mood.moodAnalyse(" Any Mood");
        String expected = "HAPPY";
        Assertions.assertEquals(expected,actual);


    }

}

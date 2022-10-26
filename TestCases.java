package bridgelabz;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

public class TestCases {

          @Test
           public void methodShouldReturnHappyWhenNullPointerEncounter() {
              MoodAnalyzer mood = new MoodAnalyzer();
              String actual = mood.moodAnalyse();
              String expected = "HAPPY";
              Assertions.assertEquals(expected, actual);
           }
}

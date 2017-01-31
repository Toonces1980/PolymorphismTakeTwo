package tony;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;


/**
 * Created by anthonypajerowski on 1/31/17.
 */
public class GoldfishTest {
    Goldfish fishy;

    @Before
    public void setup() {
        fishy = new Goldfish();
    }

    @Test
    public void speakTest() {
        String expected = "glub glub glub";
        String actual = fishy.speak();
        assertEquals(expected,actual);

    }

}

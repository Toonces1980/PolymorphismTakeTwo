package pajerowski.tony;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Created by anthonypajerowski on 1/31/17.
 */
public class CatTest {
    Cat cat;

    @Before
    public void setup() {
        cat = new Cat();
    }

    @Test
    public void speakTest() {
        String expected = "ooh Meow!";
        String actual = cat.speak();
        assertEquals(expected,actual);

    }

}

package pajerowski.tony;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Created by anthonypajerowski on 1/31/17.
 */
public class DogTest {
    Dog dog;

    @Before
    public void setup() {
        dog = new Dog();
    }

    @Test
    public void speakTest() {
        String expected = "bark bark bark bark bark";
        String actual = dog.speak();
        assertEquals(expected,actual);

    }

}

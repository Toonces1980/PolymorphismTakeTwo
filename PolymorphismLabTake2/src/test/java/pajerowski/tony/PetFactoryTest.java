package pajerowski.tony;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Created by anthonypajerowski on 1/31/17.
 */
public class PetFactoryTest {
    PetFactory factory;

    @Before
    public void setup() {
        factory = new PetFactory();
    }

    @Test
    public void getNumberOfPetsTest(){
        Integer expected = 5;
        Integer actual = factory.getNumberOfPets();
        assertEquals(expected,actual);
    }

//    @Test
//    public void petMakerTest() {
//        String expected = "woofer";
//        factory.petMaker("Dog", "woofer");
//        String actual =
//        assertEquals(expected,actual);
//
//
//    }

}

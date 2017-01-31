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

    @Test
    public void getTypeOfPetDogTest(){
        String expected = "Dog";
        String actual = factory.getTypeOfPet();
        assertEquals(expected,actual);
    }

    @Test
    public void getTypeOfPetCatTest(){
        String expected = "Cat";
        String actual = factory.getTypeOfPet();
        assertEquals(expected,actual);
    }

    @Test
    public void getTypeOfPetGoldfishTest(){
        String expected = "Goldfish";
        String actual = factory.getTypeOfPet();
        assertEquals(expected,actual);
    }

    @Test
    public void getNameOfPetTest(){
        String expected = "Fluffy";
        String actual = factory.getNameOfPet();
        assertEquals(expected,actual);
    }

    @Test
    public void addPetToListTest() {
        Integer expected = 1;
        factory.addPetToList(new Dog());
        Integer actual = factory.listOfPets.size();
        assertEquals(expected,actual);
    }

    @Test
    public void petMakerTest() {
        Pet expected = new Dog();
        Pet actual = factory.petMaker("Dog", "woofer");
        assertEquals(expected,actual);


    }

}

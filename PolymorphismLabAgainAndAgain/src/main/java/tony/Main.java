package tony;

/**
 * Created by anthonypajerowski on 1/31/17.
 */
public class Main {

    static PetFactory factory = new PetFactory();

    public static void main(String[] args) {

        factory.petMaker();
        for ( int i = 0; i < factory.listOfPets.size(); i++) {
            System.out.println(factory.listOfPets.get(i));
        }

    }
}
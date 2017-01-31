package pajerowski.tony;

/**
 * Created by anthonypajerowski on 1/31/17.
 */
public class Main {

    static PetFactory factory = new PetFactory();

    public static void main(String[] args) {

        factory.petMaker();
        for ( Pet pet : factory.listOfPets) {
            System.out.println(pet.getName());
            System.out.println(pet.getClass());
        }
    }
}
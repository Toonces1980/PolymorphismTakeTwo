package tony;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by anthonypajerowski on 1/31/17.
 */
public class PetFactory {

    Display display = new Display();

    public Scanner sc = new Scanner(System.in);

    private String petType;

    private String petName;

    private int numberOfPets;

    protected List<Pet> listOfPets = new ArrayList<>();

    public int getNumberOfPets() {return numberOfPets; }

    public void setNumberOfPets(int numberOfPets) {
        this.numberOfPets = numberOfPets;
    }

    private void addPetToList(Pet petToAdd) {
        listOfPets.add(petToAdd);
    }

    public void petMaker() {
        display.promptNumberOfPets();
        setNumberOfPets(sc.nextInt());
        Pet pet = null;
        for ( int i = 0; i < getNumberOfPets(); i++) {
            display.promptNameOfPet();
            petName = sc.next();
            display.promptTypeOfPet();
            petType = sc.next();
            switch (petType.toLowerCase()){
                case "dog":
                    pet = new Dog();
                    break;
                case "cat":
                    pet = new Cat();
                    break;
                case "goldfish":
                    pet = new Goldfish();
                    break;
                default:
                    break;
            }
            pet.setName(pet.name);
            pet.setPetType(pet.petType);
            addPetToList(pet);
        }
    }
}
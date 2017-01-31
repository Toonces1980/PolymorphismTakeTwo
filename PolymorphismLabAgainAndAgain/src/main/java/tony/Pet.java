package tony;

/**
 * Created by anthonypajerowski on 1/31/17.
 */
public abstract class Pet {

    protected String name;
    protected String petType;

    public abstract String speak();

    public void setName(String name){
        this.name = name;
    }
    public void setPetType(String type){
        this.petType = type;
    }

    public String getPetType() {
        return petType;
    }

    public String getName() {
        return name;
    }

}

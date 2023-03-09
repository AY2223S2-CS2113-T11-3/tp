package seedu.pettracker.data;

public class Pet {
    private String petName;
    private String petType;
    private String age;
    private String weight;

    public Pet(String petName) {
        this.petName = petName;
        petType = "";
        age = "";
        weight = "";
    }

    public String getPetName() {
        return petName;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    /**
     * List out a custom formatted string of Pet containing the pet name and details
     * when using the list pet command.
     *
     * @return Pet name and details in a custom formatted string.
     */
    @Override
    public String toString() {
        return getPetName() + "\nType: " +  getPetType() + "\nAge: " + getAge() + "\nWeight: " + getWeight();
    }
}

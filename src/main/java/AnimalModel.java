import java.util.Objects;

/**
 * Do not change anything in this class.
 */
public class AnimalModel {

    public String name;
    public String species;
    public int age;

    public AnimalModel(){

    }
    public AnimalModel(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "AnimalModel{" +
                "name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnimalModel that = (AnimalModel) o;
        return age == that.age && Objects.equals(name, that.name) && Objects.equals(species, that.species);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, species, age);
    }
}

public class Application {
    /**
     * Main method for manually testing your lab code.
     * Changes made here will not affect test results.
     * @param args
     */
    public static void main(String[] args) {
        Lab lab = new Lab();
        String json = "{ \"name\":\"whiskers\", \"species\":\"cat\", \"age\":4 }";
        System.out.println("Attempting deserialization. Here are the deserialized values of the above JSON: ");
        AnimalModel animalModel = lab.deserializeJSON(json);
        System.out.println(animalModel.getName());
        System.out.println(animalModel.getSpecies());
        System.out.println(animalModel.getAge());
    }
}

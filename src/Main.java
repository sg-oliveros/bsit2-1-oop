public class Main {
    public static void main(String[] args) {
        PetService service = new PetService();

        // Part 1: Method Overloading
        System.out.println("Basic Checkup: $" + service.calculateFee());
        System.out.println("Checkup with Vaccination: $" + service.calculateFee(true));
        System.out.println("Full Service : $" + service.calculateFee(true, true));
        System.out.println("Emergency Service: $" + service.calculateFee("emergency"));

        // Part 2: Runtime Polymorphism
        System.out.println("\nWelcome to the Pet Clinic!");
        System.out.println("=================================");
        Pet dog = new Dog("Buddy", 3);
        Pet cat = new Cat("Whiskers", 2);
        Pet bird = new Bird("Tweety", 1);

        dog.displayInfo();
        cat.displayInfo();
        bird.displayInfo();

        // Part 3: Interface-Based Polymorphism
        System.out.println("\nTraining Session Started!");
        System.out.println("=================================");
        trainPet((Trainable) dog);
        trainPet((Trainable) bird);
    }

    // Accepts any object that implements Trainable
    public static void trainPet(Trainable pet) {
        pet.performTrick();
    }
}
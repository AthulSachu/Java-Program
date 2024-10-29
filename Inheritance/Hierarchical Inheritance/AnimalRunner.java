public class AnimalRunner {
    public static void main(String[] args) {
        Mammal mammal = new Mammal();
        mammal.name = "Elephant";
        mammal.age = 10;
        mammal.habitat = "Rainforest";
        mammal.weight = 6000.0;
        mammal.averageLifespan = 60;
        mammal.dietType = "Herbivore";

        System.out.println("Mammal Details:");
        System.out.println("Name: " + mammal.name);
        System.out.println("Age: " + mammal.age);
        System.out.println("Habitat: " + mammal.habitat);
        System.out.println("Weight: " + mammal.weight + " kg");
        System.out.println("Average Lifespan: " + mammal.averageLifespan + " years");
        System.out.println("Diet Type: " + mammal.dietType);
        
        mammal.eat();
        mammal.canCommunicate();

        Bird bird = new Bird();
        bird.name = "Sparrow";
        bird.age = 2;
        bird.habitat = "Urban Areas";
        bird.featherColor = "Brown";
        bird.beakLength = 1.5;
        bird.migrates = true;


        System.out.println("\nBirds");
        System.out.println("Name: " + bird.name);
        System.out.println("Age: " + bird.age);
        System.out.println("Habitat: " + bird.habitat);
        System.out.println("Feather Color: " + bird.featherColor);
        System.out.println("Beak Length: " + bird.beakLength + " cm");
        System.out.println("Migrates: " + (bird.migrates ? "Yes" : "No"));
        
        bird.eat();
        bird.sing();

        Fish fish = new Fish();
        fish.name = "Goldfish";
        fish.age = 1;
        fish.habitat = "Freshwater";
        fish.species = "Carassius";
        fish.isCarnivore = false;

        System.out.println("\nFish Details:");
        System.out.println("Name: " + fish.name);
        System.out.println("Age: " + fish.age);
        System.out.println("Habitat: " + fish.habitat);
        System.out.println("Species: " + fish.species);
        System.out.println("Carnivore: " + (fish.isCarnivore ? "Yes" : "No"));
        
        fish.eat();
        fish.swimFast();
    }
}

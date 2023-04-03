import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int x;
            System.out.print("");
            x = scn.nextInt();
            Dog dog = new Dog("Buddy", 3);
            DogFood dogFood = new DogFood("Pedigree", x,"", x);

            System.out.println(dog.getName() + " is " + dog.getAge() + " years old.");
            System.out.println("The brand of dog food is " + dogFood.getBrand() + " and there are " + dogFood.getQuantity() + " spoons.");

            dog.setFood(dogFood.getBrand());
            dog.eat();

            System.out.println(dog.getName() + " has " + dog.getFood() + "left.");
        }
    }
}

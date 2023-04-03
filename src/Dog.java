public class Dog {
    private String name;
    private int age;
    private String food;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        this.food = "";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void eat() {
        if (food.isEmpty()) {
            System.out.println(name + " has no food to eat.");
        } else {
            System.out.println(name + " is eating " + food + ".");
            food = "";
        }
    }
}
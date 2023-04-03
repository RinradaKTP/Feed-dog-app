import java.util.jar.Attributes.Name;

public class DogFood {
    private static String Name;
    private String brand;
    private int quantity;
    public String name;
    public int age;

    public DogFood(String brand, int quantity,String name,int age) {
        this.brand = brand;
        this.quantity = quantity;
        this.name = name;
        this.age = age;
    }
    public void setBrand(String brand){
         this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }
    public void setQuantity(int quantity){
         this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name){
        this.name = name;
    }
    public  String getName(){
        return Name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    
}


// public class Bag {
//     String name;
//     int age;
//     public Bag(){
//         System.out.println("Bag constructor called");
//     }
// }
public class Bag{
    int age;
    double height;
    String color;
    boolean isUp;
    public Bag(){
        System.out.println("Bag constructor called");
    }
    public void display(){
        System.out.println("Color: " + color + ", Age: " + age + ", Height: " + height + ", Up: " + isUp);
    }
}
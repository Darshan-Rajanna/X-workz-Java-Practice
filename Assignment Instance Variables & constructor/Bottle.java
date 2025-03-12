// public class Bottle {
//     String name;
//     int age;
//     public Bottle(){
//         System.out.println("Bottle constructor called");
//     }
// }

public class Bottle{
    int age;
    double height;
    String color;
    boolean isUp;
    public Bottle(){
        System.out.println("Bottle constructor called");
    }
    public void display(){
        System.out.println("Color: " + color + ", Age: " + age + ", Height: " + height + ", Up: " + isUp);
    }
}
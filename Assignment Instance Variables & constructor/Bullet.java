// public class Bullet {
//     String name;
//     int age;
//     public Bullet(){
//         System.out.println("Bullet constructor called");
//     }    
// }

public class Bullet{
    int age;
    double height;
    String color;
    boolean isUp;
    public Bullet(){
        System.out.println("Bullet constructor called");
    }
    public void display(){
        System.out.println("Color: " + color + ", Age: " + age + ", Height: " + height + ", Up: " + isUp);
    }
}
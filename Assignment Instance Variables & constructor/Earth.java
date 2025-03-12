// public class Earth {
//     String name;
//     int age;
//     public Earth(){
//         System.out.println("Earth constructor called");
//     }
// }
public class Earth{
    int age;
    double height;
    String color;
    boolean isUp;
    public Earth(){
        System.out.println("Earth constructor called");
    }
    public void display(){
        System.out.println("Color: " + color + ", Age: " + age + ", Height: " + height + ", Up: " + isUp);
    }
}
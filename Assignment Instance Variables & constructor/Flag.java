// public class Flag {
//     String name;
//     int age;
//     public Flag(){
//         System.out.println("Flag constructor called");
//     }
// }
public class Flag{
    int age;
    double height;
    String color;
    boolean isUp;
    public Flag(){
        System.out.println("Flag constructor called");
    }
    public void display(){
        System.out.println("Color: " + color + ", Age: " + age + ", Height: " + height + ", Up: " + isUp);
    }
    
}
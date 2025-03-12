// public class Lamp {
//     String name;
//     int age;
//     public Lamp(){
//         System.out.println("Lamp constructor called");
//     }
// }

public class Lamp{
    int age;
    double mass;
    String name;
    boolean isOn;
    public Lamp(){
        System.out.println("Lamp constructor called");
    }
    public void display(){
        System.out.println("Name: " + name + ", Age: " + age + ", Mass: " + mass + ", On: " + isOn);
    }

}
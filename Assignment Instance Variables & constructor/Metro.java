// public class Metro {
//     String name;
//     int age;
//     public Metro(){
//         System.out.println("Metro constructor called");
//     }
// }
public class Metro {
    int age;
    double mass;
    String name;
    Boolean isRunning;

    public Metro() {
        System.out.println("Metro constructor called");
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Mass: " + mass + ", Running: " + isRunning);
    }
}
// public class PowerBank {
//     String name;
//     int age;
//     public PowerBank(){
//         System.out.println("PowerBank constructor called");
//     }
// }

class PowerBank {
    int life;
    double energy;
    String name;
    Boolean visible;
    public PowerBank() {
        System.out.println("PowerBank object created!");
    }
    public void display(){
        System.out.println("PowerBank - Life: " + life + ", Energy: " + energy + ", Name: " + name + ", Visible: " + visible);
    }
}
// class Star{
//     String name;
//     int age;
//     public Star(){
//         System.out.println("Star constructor called");
//     }
// }

class Star {
    int age;
    double mass;
    String type;
    boolean visible;

    // Constructor
    Star() {
        System.out.println("Star object created!");
    }

    void display() {
        System.out.println("Star - Age: " + age + ", Mass: " + mass + ", Type: " + type + ", Visible: " + visible);
    }
}
// public class Industry {
//     String name;
//     int age;
//     public Industry(){
//         System.out.println("Industry constructor called");
//     }
// }
public class Industry{
    int age;
    double salary;
    String name;
    boolean isEmployed;
    public Industry(){
        System.out.println("Industry constructor called");
    }
    public void display(){
        System.out.println("Name: " + name + ", Age: " + age + ", Salary: " + salary + ", Employed: " + isEmployed);
    }
}
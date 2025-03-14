public class ThirdDay {
    public static void main(String[] args) {

    //prgrm to declare all primitive values

    int age = 22;   
    float height = 5.5f;
    char grade = 'A';
    boolean isStudent = true;
    String name = "Darshan R";
    byte b = 127;
    short s = 32767;
    long l = 9223372036854775807L;
    double d = 123456789.123456789;
    
    //init the variables and print it

    System.out.println("Variables in Java demo program primary initialization: ");
    System.out.println("Age: " + age);
    System.out.println("Height: " + height);
    System.out.println("Grade: " + grade);
    System.out.println("Is Student: " + isStudent);
    System.out.println("Name: " + name);
    System.out.println("Byte: " + b);
    System.out.println("Short: " + s);
    System.out.println("Long: " + l);
    System.out.println("Double: " + d);
    
    //re inint and then print it

    System.out.println("Variables in Java demo program re initialization: ");
    age = 23;
    height = 5.6f;
    grade = 'B';
    isStudent = false;
    name = "Darshan Rajanna";
    b = 126;
    s = 32766;
    l = 9223372036854775806L;
    d = 123456789.123456788;
    
    System.out.println("Age: " + age);
    System.out.println("Height: " + height);
    System.out.println("Grade: " + grade);
    System.out.println("Is Student: " + isStudent);
    System.out.println("Name: " + name);
    System.out.println("Byte: " + b);
    System.out.println("Short: " + s);
    System.out.println("Long: " + l);
    System.out.println("Double: " + d);
    
    }
}
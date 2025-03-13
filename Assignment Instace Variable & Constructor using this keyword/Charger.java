public class Charger {
    String name;
    String brand;
    int type;
    public Charger(String name, String brand, int type) {
        this.name = name;
        this.brand = brand;
        this.type = type;
    }
    public void display() {
        System.out.println("Charger Name: "+name);
        System.out.println("Location: "+brand);
        System.out.println("Type: "+type);
    }
}

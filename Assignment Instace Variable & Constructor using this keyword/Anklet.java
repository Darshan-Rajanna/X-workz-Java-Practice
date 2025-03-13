public class Anklet {
    String name;
    String color;
    int cost;
    public Anklet(String name, String color, int cost) {
        this.name = name;
        this.color = color;
        this.cost = cost;
    }
    public void display() {
        System.out.println("Anklet Name: "+name);
        System.out.println("Color: "+color);
        System.out.println("Cost: "+cost);
    }
}

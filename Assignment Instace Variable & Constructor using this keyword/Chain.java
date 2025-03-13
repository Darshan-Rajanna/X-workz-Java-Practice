public class Chain {
    String name;
    String color;
    int cost;
    public Chain(String name, String color, int cost) {
        this.name = name;
        this.color = color;
        this.cost = cost;
    }
    public void display() {
        System.out.println("Chain Name: "+name);
        System.out.println("Color: "+color);
        System.out.println("Cost: "+cost);
    }
}

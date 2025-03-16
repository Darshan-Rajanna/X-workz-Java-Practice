public class Egg {
    String type, color, source;
    double weight;
    int quantity;
    boolean isOrganic;

    public Egg() {
        this("Unknown", "White", "Farm", 50.0, 12, false);
        System.out.println("Egg: Default constructor called");
    }

    public Egg(String type) {
        this();
        System.out.println("Egg: Type constructor called");
        this.type = type;
    }

    public Egg(String type, String color) {
        this(type);
        System.out.println("Egg: Type & Color constructor called");
        this.color = color;
    }

    public Egg(String type, String color, String source) {
        this(type, color);
        System.out.println("Egg: Type, Color & Source constructor called");
        this.source = source;
    }

    public Egg(String type, String color, String source, double weight) {
        this(type, color, source);
        System.out.println("Egg: Type, Color, Source & Weight constructor called");
        this.weight = weight;
    }

    public Egg(String type, String color, String source, double weight, int quantity) {
        this(type, color, source, weight);
        System.out.println("Egg: Type, Color, Source, Weight & Quantity constructor called");
        this.quantity = quantity;
    }

    public Egg(String type, String color, String source, double weight, int quantity, boolean isOrganic) {
        System.out.println("Egg: All properties initialized constructor called");
        this.type = type;
        this.color = color;
        this.source = source;
        this.weight = weight;
        this.quantity = quantity;
        this.isOrganic = isOrganic;
    }

    public void display() {
        System.out.println("Egg Details: Type = " + type + ", Color = " + color + ", Source = " + source +
            ", Weight = " + weight + "g, Quantity = " + quantity + ", Organic = " + isOrganic);
    }
}

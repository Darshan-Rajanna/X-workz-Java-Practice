public class Tomato {
    String variety, color, origin;
    double weight, price;
    boolean isOrganic;

    public Tomato() {
        this("Cherry", "Red", "Local", 0.1, 10.0, true);
        System.out.println("Tomato: Default constructor called");
    }

    public Tomato(String variety) {
        this();
        System.out.println("Tomato: Variety constructor called");
        this.variety = variety;
    }

    public Tomato(String variety, String color) {
        this(variety);
        System.out.println("Tomato: Variety & Color constructor called");
        this.color = color;
    }

    public Tomato(String variety, String color, String origin) {
        this(variety, color);
        System.out.println("Tomato: Variety, Color & Origin constructor called");
        this.origin = origin;
    }

    public Tomato(String variety, String color, String origin, double weight) {
        this(variety, color, origin);
        System.out.println("Tomato: Variety, Color, Origin & Weight constructor called");
        this.weight = weight;
    }

    public Tomato(String variety, String color, String origin, double weight, double price) {
        this(variety, color, origin, weight);
        System.out.println("Tomato: Variety, Color, Origin, Weight & Price constructor called");
        this.price = price;
    }

    public Tomato(String variety, String color, String origin, double weight, double price, boolean isOrganic) {
        System.out.println("Tomato: All properties initialized constructor called");
        this.variety = variety;
        this.color = color;
        this.origin = origin;
        this.weight = weight;
        this.price = price;
        this.isOrganic = isOrganic;
    }

    public void display() {
        System.out.println("Tomato Details: Variety = " + variety + ", Color = " + color + ", Origin = " + origin +
            ", Weight = " + weight + " kg, Price = $" + price + ", Organic = " + isOrganic);
    }
}

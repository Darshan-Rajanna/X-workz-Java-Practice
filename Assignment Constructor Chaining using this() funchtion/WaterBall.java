public class WaterBall {
    String material, color, size;
    double weight, price;
    boolean isReusable;

    public WaterBall() {
        this("Plastic", "Blue", "Medium", 0.2, 15.0, true);
        System.out.println("WaterBall: Default constructor called");
    }

    public WaterBall(String material) {
        this();
        System.out.println("WaterBall: Material constructor called");
        this.material = material;
    }

    public WaterBall(String material, String color) {
        this(material);
        System.out.println("WaterBall: Material & Color constructor called");
        this.color = color;
    }

    public WaterBall(String material, String color, String size) {
        this(material, color);
        System.out.println("WaterBall: Material, Color & Size constructor called");
        this.size = size;
    }

    public WaterBall(String material, String color, String size, double weight) {
        this(material, color, size);
        System.out.println("WaterBall: Material, Color, Size & Weight constructor called");
        this.weight = weight;
    }

    public WaterBall(String material, String color, String size, double weight, double price) {
        this(material, color, size, weight);
        System.out.println("WaterBall: Material, Color, Size, Weight & Price constructor called");
        this.price = price;
    }

    public WaterBall(String material, String color, String size, double weight, double price, boolean isReusable) {
        System.out.println("WaterBall: All properties initialized constructor called");
        this.material = material;
        this.color = color;
        this.size = size;
        this.weight = weight;
        this.price = price;
        this.isReusable = isReusable;
    }

    public void display() {
        System.out.println("WaterBall Details: Material = " + material + ", Color = " + color + ", Size = " + size +
            ", Weight = " + weight + " kg, Price = $" + price + ", Reusable = " + isReusable);
    }
}

public class Balloon {
    String brand, color, material, type;
    int size;
    double price;

    public Balloon() {
        this("NoBrand", "Red", "Rubber", "Helium", 10, 50.0);
        System.out.println("Balloon: Default constructor called");
    }

    public Balloon(String brand) {
        this();
        System.out.println("Balloon: Brand constructor called");
        this.brand = brand;
    }

    public Balloon(String brand, String color) {
        this(brand);
        System.out.println("Balloon: Brand & Color constructor called");
        this.color = color;
    }

    public Balloon(String brand, String color, String material) {
        this(brand, color);
        System.out.println("Balloon: Brand, Color & Material constructor called");
        this.material = material;
    }

    public Balloon(String brand, String color, String material, String type) {
        this(brand, color, material);
        System.out.println("Balloon: Brand, Color, Material & Type constructor called");
        this.type = type;
    }

    public Balloon(String brand, String color, String material, String type, int size) {
        this(brand, color, material, type);
        System.out.println("Balloon: Brand, Color, Material, Type & Size constructor called");
        this.size = size;
    }

    public Balloon(String brand, String color, String material, String type, int size, double price) {
        System.out.println("Balloon: All properties initialized constructor called");
        this.brand = brand;
        this.color = color;
        this.material = material;
        this.type = type;
        this.size = size;
        this.price = price;
    }

    public void display() {
        System.out.println("Balloon Details: Brand = " + brand + ", Color = " + color + 
            ", Material = " + material + ", Type = " + type + ", Size = " + size + "cm, Price = $" + price);
    }
}

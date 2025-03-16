public class Bucket {
    String material, color, brand;
    int capacity;
    boolean hasHandle;
    double price;

    public Bucket() {
        this("Plastic", "Blue", "Generic", 10, true, 150.0);
        System.out.println("Bucket: Default constructor called");
    }

    public Bucket(String material) {
        this();
        System.out.println("Bucket: Material constructor called");
        this.material = material;
    }

    public Bucket(String material, String color) {
        this(material);
        System.out.println("Bucket: Material & Color constructor called");
        this.color = color;
    }

    public Bucket(String material, String color, String brand) {
        this(material, color);
        System.out.println("Bucket: Material, Color & Brand constructor called");
        this.brand = brand;
    }

    public Bucket(String material, String color, String brand, int capacity) {
        this(material, color, brand);
        System.out.println("Bucket: Material, Color, Brand & Capacity constructor called");
        this.capacity = capacity;
    }

    public Bucket(String material, String color, String brand, int capacity, boolean hasHandle) {
        this(material, color, brand, capacity);
        System.out.println("Bucket: Material, Color, Brand, Capacity & HasHandle constructor called");
        this.hasHandle = hasHandle;
    }

    public Bucket(String material, String color, String brand, int capacity, boolean hasHandle, double price) {
        System.out.println("Bucket: All properties initialized constructor called");
        this.material = material;
        this.color = color;
        this.brand = brand;
        this.capacity = capacity;
        this.hasHandle = hasHandle;
        this.price = price;
    }

    public void display() {
        System.out.println("Bucket Details: Material = " + material + ", Color = " + color + 
            ", Brand = " + brand + ", Capacity = " + capacity + "L, Has Handle = " + hasHandle + ", Price = $" + price);
    }
}

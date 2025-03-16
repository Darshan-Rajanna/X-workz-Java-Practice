public class Pichkari {
    String brand, color, capacity;
    int size;
    double price;
    boolean isAutomatic;

    public Pichkari() {
        this("NoBrand",30,100.0,false, "Blue", "1 Liter");
        System.out.println("Pichkari: Default constructor called");
    }

    public Pichkari(String brand) {
        this();
        System.out.println("Pichkari: Brand constructor called");
        this.brand = brand;
    }

    public Pichkari(String brand, int size) {
        this(brand);
        System.out.println("Pichkari: Brand & Size constructor called");
        this.size = size;
    }

    public Pichkari(String brand, int size, double price) {
        this(brand, size);
        System.out.println("Pichkari: Brand, Size & Price constructor called");
        this.price = price;
    }

    public Pichkari(String brand, int size, double price, boolean isAutomatic) {
        this(brand, size, price);
        System.out.println("Pichkari: Brand, Size, Price & IsAutomatic constructor called");
        this.isAutomatic = isAutomatic;
    }

    public Pichkari(String brand, int size, double price, boolean isAutomatic, String color) {
        this(brand, size, price, isAutomatic);
        System.out.println("Pichkari: Brand, Size, Price, IsAutomatic & Color constructor called");
        this.color = color;
    }

    public Pichkari(String brand, int size, double price, boolean isAutomatic, String color, String capacity) {
        System.out.println("Pichkari: All properties initialized constructor called");
        this.brand = brand;
        this.size = size;
        this.price = price;
        this.isAutomatic = isAutomatic;
        this.color = color;
        this.capacity = capacity;
    }

    public void display() {
        System.out.println("Pichkari Details: Brand = " + brand + ", Size = " + size + "cm, Price = $" + price +
            ", Automatic = " + isAutomatic + ", Color = " + color + ", Capacity = " + capacity);
    }
}


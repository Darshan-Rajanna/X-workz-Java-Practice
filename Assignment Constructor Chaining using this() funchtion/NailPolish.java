public class NailPolish {
    String brand, color, finish, type;
    double price;
    int volume;

    public NailPolish() {
        this("Generic", "Red", "Glossy", "Liquid", 199.0, 15);
        System.out.println("NailPolish: Default constructor called");
    }

    public NailPolish(String brand) {
        this();
        System.out.println("NailPolish: Brand constructor called");
        this.brand = brand;
    }

    public NailPolish(String brand, String color) {
        this(brand);
        System.out.println("NailPolish: Brand & Color constructor called");
        this.color = color;
    }

    public NailPolish(String brand, String color, String finish) {
        this(brand, color);
        System.out.println("NailPolish: Brand, Color & Finish constructor called");
        this.finish = finish;
    }

    public NailPolish(String brand, String color, String finish, String type) {
        this(brand, color, finish);
        System.out.println("NailPolish: Brand, Color, Finish & Type constructor called");
        this.type = type;
    }

    public NailPolish(String brand, String color, String finish, String type, double price) {
        this(brand, color, finish, type);
        System.out.println("NailPolish: Brand, Color, Finish, Type & Price constructor called");
        this.price = price;
    }

    public NailPolish(String brand, String color, String finish, String type, double price, int volume) {
        System.out.println("NailPolish: All properties initialized constructor called");
        this.brand = brand;
        this.color = color;
        this.finish = finish;
        this.type = type;
        this.price = price;
        this.volume = volume;
    }

    public void display() {
        System.out.println("NailPolish Details: Brand = " + brand + ", Color = " + color + ", Finish = " + finish +
            ", Type = " + type + ", Price = $" + price + ", Volume = " + volume + "ml");
    }
}

public class Color {
    String name, type, shade;
    int code;
    boolean isWaterSoluble;
    double price;

    public Color() {
        this("Unknown", "Primary", "Light", 0, false, 0.0);
        System.out.println("Color: Default constructor called");
    }

    public Color(String name) {
        this();
        System.out.println("Color: Name constructor called");
        this.name = name;
    }

    public Color(String name, String type) {
        this(name);
        System.out.println("Color: Name & Type constructor called");
        this.type = type;
    }

    public Color(String name, String type, String shade) {
        this(name, type);
        System.out.println("Color: Name, Type & Shade constructor called");
        this.shade = shade;
    }

    public Color(String name, String type, String shade, int code) {
        this(name, type, shade);
        System.out.println("Color: Name, Type, Shade & Code constructor called");
        this.code = code;
    }

    public Color(String name, String type, String shade, int code, boolean isWaterSoluble) {
        this(name, type, shade, code);
        System.out.println("Color: Name, Type, Shade, Code & IsWaterSoluble constructor called");
        this.isWaterSoluble = isWaterSoluble;
    }

    public Color(String name, String type, String shade, int code, boolean isWaterSoluble, double price) {
        System.out.println("Color: All properties initialized constructor called");
        this.name = name;
        this.type = type;
        this.shade = shade;
        this.code = code;
        this.isWaterSoluble = isWaterSoluble;
        this.price = price;
    }

    public void display() {
        System.out.println("Color Details: Name = " + name + ", Type = " + type + ", Shade = " + shade +
            ", Code = " + code + ", Water Soluble = " + isWaterSoluble + ", Price = $" + price);
    }
}

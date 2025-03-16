public class Gun {
    String model, type, manufacturer;
    double caliber;
    int magazineCapacity;
    boolean isAutomatic;

    public Gun() {
        this("Unknown", "Pistol", "Generic", 9.0, 10, false);
        System.out.println("Gun: Default constructor called");
    }

    public Gun(String model) {
        this();
        System.out.println("Gun: Model constructor called");
        this.model = model;
    }

    public Gun(String model, String type) {
        this(model);
        System.out.println("Gun: Model & Type constructor called");
        this.type = type;
    }

    public Gun(String model, String type, String manufacturer) {
        this(model, type);
        System.out.println("Gun: Model, Type & Manufacturer constructor called");
        this.manufacturer = manufacturer;
    }

    public Gun(String model, String type, String manufacturer, double caliber) {
        this(model, type, manufacturer);
        System.out.println("Gun: Model, Type, Manufacturer & Caliber constructor called");
        this.caliber = caliber;
    }

    public Gun(String model, String type, String manufacturer, double caliber, int magazineCapacity) {
        this(model, type, manufacturer, caliber);
        System.out.println("Gun: Model, Type, Manufacturer, Caliber & Magazine Capacity constructor called");
        this.magazineCapacity = magazineCapacity;
    }

    public Gun(String model, String type, String manufacturer, double caliber, int magazineCapacity, boolean isAutomatic) {
        System.out.println("Gun: All properties initialized constructor called");
        this.model = model;
        this.type = type;
        this.manufacturer = manufacturer;
        this.caliber = caliber;
        this.magazineCapacity = magazineCapacity;
        this.isAutomatic = isAutomatic;
    }

    public void display() {
        System.out.println("Gun Details: Model = " + model + ", Type = " + type + ", Manufacturer = " + manufacturer +
            ", Caliber = " + caliber + "mm, Magazine Capacity = " + magazineCapacity + ", Automatic = " + isAutomatic);
    }
}

public class Water {
    String source, type, color, state;
    double pHLevel, temperature;

    public Water() {
        this("Natural Spring", "Freshwater", "Colorless", "Liquid", 7.0, 25.0);
        System.out.println("Water: Default constructor called");
    }

    public Water(String source) {
        this();
        System.out.println("Water: Source constructor called");
        this.source = source;
    }

    public Water(String source, String type) {
        this(source);
        System.out.println("Water: Source & Type constructor called");
        this.type = type;
    }

    public Water(String source, String type, String color) {
        this(source, type);
        System.out.println("Water: Source, Type & Color constructor called");
        this.color = color;
    }

    public Water(String source, String type, String color, String state) {
        this(source, type, color);
        System.out.println("Water: Source, Type, Color & State constructor called");
        this.state = state;
    }

    public Water(String source, String type, String color, String state, double pHLevel) {
        this(source, type, color, state);
        System.out.println("Water: Source, Type, Color, State & pH Level constructor called");
        this.pHLevel = pHLevel;
    }

    public Water(String source, String type, String color, String state, double pHLevel, double temperature) {
        System.out.println("Water: All properties initialized constructor called");
        this.source = source;
        this.type = type;
        this.color = color;
        this.state = state;
        this.pHLevel = pHLevel;
        this.temperature = temperature;
    }

    public void display() {
        System.out.println("Water Details: Source = " + source + ", Type = " + type + ", Color = " + color +
            ", State = " + state + ", pH Level = " + pHLevel + ", Temperature = " + temperature + "°C");
    }
}

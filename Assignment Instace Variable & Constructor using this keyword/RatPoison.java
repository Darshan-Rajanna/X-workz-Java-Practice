public class RatPoison {
    String name;
    String color;
    int type;
    public RatPoison(String name, String color, int type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }
    public void display() {
        System.out.println("RatPoison Name: "+name);
        System.out.println("Color: "+color);
        System.out.println("Type: "+type);
    }
}

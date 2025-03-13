public class Magnet {
    String name;
    String color;
    int type;
    public Magnet(String name, String color, int type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }
    public void display() {
        System.out.println("Magnet Name: "+name);
        System.out.println("Color: "+color);
        System.out.println("Type: "+type);
    }
}

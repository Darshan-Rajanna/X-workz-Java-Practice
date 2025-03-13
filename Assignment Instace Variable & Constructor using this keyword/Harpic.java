public class Harpic {
    String name;
    String color;
    int type;
    public Harpic(String name, String color, int type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }
    public void display() {
        System.out.println("Harpic Name: "+name);
        System.out.println("Color: "+color);
        System.out.println("Type: "+type);
    }
}

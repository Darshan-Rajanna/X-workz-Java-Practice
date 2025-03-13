public class Bar {
    String name;
    String location;
    int distance;
    public Bar(String name, String location, int distance) {
        this.name = name;
        this.location = location;
        this.distance = distance;
    }
    public void display() {
        System.out.println("Bar Name: "+name);
        System.out.println("Location: "+location);
        System.out.println("Distance: "+distance);
    }
}

public class Whattsapp {
    String name;
    String media;
    int type;
    public Whattsapp(String name, String media, int type) {
        this.name = name;
        this.media = media;
        this.type = type;
        System.out.println("Whattsapp Constructor Created");
    }
    public void display() {
        System.out.println("Whattsapp user Name: "+name);
        System.out.println("media shared: "+media);
        System.out.println("Type: "+type);
    }
}

public class Chat {
    String name;
    String media;
    int type;
    public Chat(String name, String media, int type) {
        this.name = name;
        this.media = media;
        this.type = type;
        System.out.println("Chat Constructor Created");
}
    public void display() {
        System.out.println("Chat Name: "+name);
        System.out.println("Location: "+media);
        System.out.println("Type: "+type);
    }
}
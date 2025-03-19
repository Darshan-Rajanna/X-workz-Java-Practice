public class Shop {
    void ads(Display display) {
        if (display != null) {
            display.run();
            System.out.println("display is not null");
        } else {
            System.out.println("Display object is null, cannot show ads");
        }
    }

    static class Display {
        void run() {
            System.out.println("Ad is being displayed infront of Shop");
        }
    }
}

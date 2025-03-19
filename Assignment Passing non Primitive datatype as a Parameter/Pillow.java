


class Pillow {
    void relax(Bedroom bedroom) {
        if (bedroom != null) {
            bedroom.comfort();
            System.out.println("Bedroom is not null");
        } else {
            System.out.println("Bedroom object is null, cannot relax");
        }
    }
    static class Bedroom {
        void comfort() {
            System.out.println("Pillow provides comfort while sleeping");
        }
    }
}
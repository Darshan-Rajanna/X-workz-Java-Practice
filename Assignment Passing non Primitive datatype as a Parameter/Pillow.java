


class Pillow {
    void relax(Bedroom bedroom) {
        if (bedroom != null) {
            bedroom.comfort();
        } else {
            System.out.println("Pillow object is null, cannot relax");
        }
    }
    static class Bedroom {
        void comfort() {
            System.out.println("Pillow provides comfort while sleeping");
        }
    }
}
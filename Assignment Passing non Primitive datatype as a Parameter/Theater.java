
class Theater {
    void show(Poster poster) {
        if (poster != null) {
            poster.showInfo();
        } else {
            System.out.println("Poster object is null, cannot show information");
        }
    }
    static class Poster {
        void showInfo() {
            System.out.println("Showing poster information");
        }
    }
    
}
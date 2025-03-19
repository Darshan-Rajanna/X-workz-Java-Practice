

class Space {
    void works(Astronaut astronaut) {
        if (astronaut != null) {
            astronaut.showorg();
        } else {
            System.out.println("Astronaut object is null, cannot show organization");
        }
    }
    static class Astronaut {
        void showorg() {
            System.out.println("Astronaut works for an organization");
        }
    }
}

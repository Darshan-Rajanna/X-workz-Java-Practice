

class Rocket {
    void launchesfrom(Isro isro) {
        if (isro != null) {
            isro.mission();
            System.out.println("ISRO is not null");
        } else {
            System.out.println("ISRO object is null, cannot launch mission");
        }
    }
    static class Isro {
        void mission() {
            System.out.println("ISRO launches Rocket missions");
        }
    }
}
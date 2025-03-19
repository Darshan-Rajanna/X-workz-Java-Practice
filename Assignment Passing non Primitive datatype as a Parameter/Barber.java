
class Barber {
    void service(Saloon saloon) {
        if (saloon != null) {
            saloon.cutHair();
            System.out.println("Saloon is not null");
        } else {
            System.out.println("Saloon object is null, cannot provide service");
        }
    }
    static class Saloon {
        void cutHair() {
            System.out.println("Barber is cutting hair");
        }
    }
    
}
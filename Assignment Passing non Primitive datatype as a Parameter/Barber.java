
class Barber {
    void service(Saloon saloon) {
        if (saloon != null) {
            saloon.cutHair();
        } else {
            System.out.println("Barber object is null, cannot provide service");
        }
    }
    static class Saloon {
        void cutHair() {
            System.out.println("Barber is cutting hair");
        }
    }
    
}
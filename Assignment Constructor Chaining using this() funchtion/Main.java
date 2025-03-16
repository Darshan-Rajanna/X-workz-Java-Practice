public class Main {
    public static void main(String[] args) {
        Balloon balloon1 = new Balloon();
        Balloon balloon2 = new Balloon("PartyPro", "Green", "Latex", "Air-filled", 15, 70.0);

        Holi holi1 = new Holi();
        Holi holi2 = new Holi("Holi", "India", "Water Splashing", "Red", 3, 1000.0);

        Pichkari pichkari1 = new Pichkari();
        Pichkari pichkari2 = new Pichkari("SuperSoaker", 35, 150.0, true, "Yellow", "2 Liters");

        // Creating instances for all 11 objects
        Color color1 = new Color();
        Egg egg1 = new Egg();
        Bucket bucket1 = new Bucket();
        Tomato tomato1 = new Tomato();
        WaterBall waterBall1 = new WaterBall();
        Gun gun1 = new Gun();
        NailPolish nailPolish1 = new NailPolish();
        Water water1 = new Water();

        // Displaying details
        balloon1.display();
        balloon2.display();
        holi1.display();
        holi2.display();
        pichkari1.display();
        pichkari2.display();
        color1.display();
        egg1.display();
        bucket1.display();
        tomato1.display();
        waterBall1.display();
        gun1.display();
        nailPolish1.display();
        water1.display();
    }
}

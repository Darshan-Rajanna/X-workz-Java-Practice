public class Main {
    public static void main(String[] args) {
        // Creating 7 instances of each class and calling display()
        
        // Pichkari Instances
        Pichkari p1 = new Pichkari();
        Pichkari p2 = new Pichkari("SuperSoaker");
        Pichkari p3 = new Pichkari("SuperSoaker", 40);
        Pichkari p4 = new Pichkari("SuperSoaker", 40, 150.0);
        Pichkari p5 = new Pichkari("SuperSoaker", 40, 150.0, true);
        Pichkari p6 = new Pichkari("SuperSoaker", 40, 150.0, true, "Red");
        Pichkari p7 = new Pichkari("SuperSoaker", 40, 150.0, true, "Red", "2 Liters");

        p1.display();
        p2.display();
        p3.display();
        p4.display();
        p5.display();
        p6.display();
        p7.display();

        // Color Instances
        Color c1 = new Color();
        Color c2 = new Color("Red");
        Color c3 = new Color("Red", "Organic");
        Color c4 = new Color("Red", "Organic", "Powder");
        Color c5 = new Color("Red", "Organic", "Powder", 5);
        Color c6 = new Color("Red", "Organic", "Powder", 5, true);
        Color c7 = new Color("Red", "Organic", "Powder", 5,true, 250.0);

        c1.display();
        c2.display();
        c3.display();
        c4.display();
        c5.display();
        c6.display();
        c7.display();

        // Egg Instances
        Egg e1 = new Egg();
        Egg e2 = new Egg("Chicken");
        Egg e3 = new Egg("Chicken", "Brown");
        Egg e4 = new Egg("Chicken", "Brown", "Large");
        Egg e5 = new Egg("Chicken", "Brown", "Large", 50.0);
        Egg e6 = new Egg("Chicken", "Brown", "Large", 50.0, 5);
        Egg e7 = new Egg("Chicken", "Brown", "Large", 50.0, 5, false);

        e1.display();
        e2.display();
        e3.display();
        e4.display();
        e5.display();
        e6.display();
        e7.display();

        // Bucket Instances
        Bucket b1 = new Bucket();
        Bucket b2 = new Bucket("Plastic");
        Bucket b3 = new Bucket("Plastic", "Blue");
        Bucket b4 = new Bucket("Plastic", "Blue", "Round");
        Bucket b5 = new Bucket("Plastic", "Blue","Round", 10);
        Bucket b6 = new Bucket("Plastic", "Blue", "Round",10, true);
        Bucket b7 = new Bucket("Plastic", "Blue", "Round", 10, true, 150.0 );

        b1.display();
        b2.display();
        b3.display();
        b4.display();
        b5.display();
        b6.display();
        b7.display();

        // Gun Instances
        Gun g1 = new Gun();
        Gun g2 = new Gun("Nerf");
        Gun g3 = new Gun("Nerf", "Toy Gun");
        Gun g4 = new Gun("Nerf", "Toy Gun", "Blue");
        Gun g5 = new Gun("Nerf", "Toy Gun", "Blue", 35.0);
        Gun g6 = new Gun("Nerf", "Toy Gun", "Blue",35.0, 120);
        Gun g7 = new Gun("Nerf", "Toy Gun", "Blue", 500.0, 120, true);

        g1.display();
        g2.display();
        g3.display();
        g4.display();
        g5.display();
        g6.display();
        g7.display();

        // NailPolish Instances
        NailPolish n1 = new NailPolish();
        NailPolish n2 = new NailPolish("Lakme");
        NailPolish n3 = new NailPolish("Lakme", "Red");
        NailPolish n4 = new NailPolish("Lakme", "Red", "Glossy");
        NailPolish n5 = new NailPolish("Lakme", "Red", "Glossy","Powder", 5.0);
        NailPolish n6 = new NailPolish("Lakme", "Red", "Glossy","Powder", 5.0);
        NailPolish n7 = new NailPolish("Lakme", "Red", "Glossy","Powder", 5.0, 200);

        n1.display();
        n2.display();
        n3.display();
        n4.display();
        n5.display();
        n6.display();
        n7.display();

        // Tomato Instances
        Tomato t1 = new Tomato();
        Tomato t2 = new Tomato("Cherry Tomato");
        Tomato t3 = new Tomato("Cherry Tomato", "Red");
        Tomato t4 = new Tomato("Cherry Tomato", "Red", "Small");
        Tomato t5 = new Tomato("Cherry Tomato", "Red", "Small", 100.0);
        Tomato t6 = new Tomato("Cherry Tomato", "Red", "Small", 10.0,100.0);
        Tomato t7 = new Tomato("Cherry Tomato", "Red", "Small", 10.0, 100.0, true);

        t1.display();
        t2.display();
        t3.display();
        t4.display();
        t5.display();
        t6.display();
        t7.display();

        // Water Instances
        Water w1 = new Water();
        Water w2 = new Water("River");
        Water w3 = new Water("River", "Saltwater");
        Water w4 = new Water("River", "Saltwater", "Blue");
        Water w5 = new Water("River", "Saltwater", "Blue", "Liquid");
        Water w6 = new Water("River", "Saltwater", "Blue", "Liquid", 8.0);
        Water w7 = new Water("River", "Saltwater", "Blue", "Liquid", 8.0, 22.5);

        w1.display();
        w2.display();
        w3.display();
        w4.display();
        w5.display();
        w6.display();
        w7.display();

        // WaterBall Instances
        WaterBall wb1 = new WaterBall();
        WaterBall wb2 = new WaterBall("Rubber");
        WaterBall wb3 = new WaterBall("Rubber", "Red");
        WaterBall wb4 = new WaterBall("Rubber", "Red", "Small");
        WaterBall wb5 = new WaterBall("Rubber", "Red", "Small", 0.3);
        WaterBall wb6 = new WaterBall("Rubber", "Red", "Small", 0.3, 20.0);
        WaterBall wb7 = new WaterBall("Rubber", "Red", "Small", 0.3, 20.0, false);

        wb1.display();
        wb2.display();
        wb3.display();
        wb4.display();
        wb5.display();
        wb6.display();
        wb7.display();

        Holi h1 = new Holi();
        Holi h2 = new Holi("Holi");
        Holi h3 = new Holi("Holi", "India");
        Holi h4 = new Holi("Holi", "India", "Color Throwing");
        Holi h5 = new Holi("Holi", "India", "Color Throwing", "Multicolor");
        Holi h6 = new Holi("Holi", "India", "Color Throwing", "Multicolor", 2);
        Holi h7 = new Holi("Holi", "India", "Color Throwing", "Multicolor", 2, 500.0);

        h1.display();   
        h2.display();
        h3.display();
        h4.display();
        h5.display();
        h6.display();
        h7.display();
    }
}

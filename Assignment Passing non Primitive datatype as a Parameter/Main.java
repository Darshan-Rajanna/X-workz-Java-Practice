public class Main {
    public static void main(String[] args) {


        Shop.Display display = new Shop.Display();
        Shop shop = new Shop();
        shop.ads(display);

        Barber.Saloon saloon = new Barber.Saloon();
        Barber barber = new Barber();
        barber.service(saloon);

        Camera.Studio studio = new Camera.Studio();
        Camera camera = new Camera();
        camera.shoot(studio);

        Dolo650.MedicineStore medicineStore = new Dolo650.MedicineStore();
        Dolo650 dolo = new Dolo650();
        dolo.sell(medicineStore);

        Mango.FruitBasket fruitBasket = new Mango.FruitBasket();
        Mango mango = new Mango();
        mango.check(fruitBasket);

        Pillow.Bedroom bedroom = new Pillow.Bedroom();
        Pillow pillow = new Pillow();
        pillow.relax(bedroom);

        RCB.Player player = new RCB.Player();
        RCB rcb = new RCB();
        rcb.namePlayer(player);

        Rocket.Isro isro = new Rocket.Isro();
        Rocket rocket = new Rocket();
        rocket.launchesfrom(isro);

        Space.Astronaut astronaut = new Space.Astronaut();
        Space space = new Space();
        space.works(astronaut);

        Theater.Poster poster = new Theater.Poster();
        Theater theater = new Theater();
        theater.show(poster);

    }
}


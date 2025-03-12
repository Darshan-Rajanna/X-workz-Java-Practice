public class Main {
    public static void main(String[] args) {

        Bag bag = new Bag();
        bag.color = "Black";
        bag.age = 5;
        bag.height = 3.5;
        bag.isUp = true;
        bag.display();
        
        Bottle bottle = new Bottle();
        bottle.color = "Red";
        bottle.age = 10;
        bottle.height = 5.5;
        bottle.isUp = true;
        bottle.display();
        
        Bullet bullet = new Bullet();
        bullet.color = "Green";
        bullet.age = 20;
        bullet.height = 2.5;
        bullet.isUp = false;
        bullet.display();
        

        Earth earth = new Earth();
        earth.color = "Yellow";
        earth.age = 40;
        earth.height = 15.5;
        earth.isUp = false;
        earth.display();
        
        Flag flag = new Flag();
        flag.color = "Blue";
        flag.age = 30;
        flag.height = 10.5;
        flag.isUp = true;
        flag.display();

        Industry ind = new Industry();
        ind.name = "White";
        ind.age = 50;
        ind.salary = 20.5;
        ind.isEmployed = false;
        ind.display();
        
        Lamp lamp = new Lamp();
        lamp.name = "Purple";
        lamp.age = 60;
        lamp.mass = 25.5;
        lamp.isOn = true;
        lamp.display();
        
        Metro metro = new Metro();
        metro.name = "Orange";
        metro.age = 70;
        metro.mass = 30.5;
        metro.isRunning = false;
        metro.display();

        PowerBank pb = new PowerBank();
        pb.name = "Pink";
        pb.life = 80;
        pb.energy = 25.5;
        pb.visible = true;
        pb.display();

        Star star = new Star();
        star.type = "Bright";
        star.age = 90;
        star.mass = 35.5;
        star.visible = false;
        star.display();
    }
}

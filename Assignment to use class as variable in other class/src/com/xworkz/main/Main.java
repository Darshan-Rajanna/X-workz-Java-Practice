//package com.xworkz.main;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//    String name= "Darshan";
//    static int birthYear=2003;

//    public void display(int birthYear){
//        int year=2025;
//        System.out.println("The local variable is : "+year);
//        System.out.println("age of the person is : "+(year-birthYear));
//    }
//
//    public static void main(String[] args) {
//        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.println("Hello and welcome!");
//        System.out.println("The static variable is : "+birthYear);
//        System.out.println("The local variable cannot be accesible from the outer class or block");
//        Main main1=new Main();
//        System.out.println("The instance variable here we are using 'this' keyword for referring the instance name"+main1.name);
//        main1.ageOfThePerson();
//    }
//
//    public void ageOfThePerson(){
//        System.out.println("The age of the person is : ");
//        display(2003);

//        String pali="MalayalZM";
//        char[] caracters=pali.toCharArray();
//        pali=pali.toLowerCase();
//
//        int n=pali.length();
//        for (int i=0; i<n/2;i++){
//            if(pali.charAt(i)!=pali.charAt(n-1-i)){
//                System.out.println("not a palindrome");
//                System.out.println("mismatched : "+pali.charAt(i)+" and "+pali.charAt(n-i-1));
//                break;
//            }
//        }
//        System.out.println("Palindrome");
//
//
//    }
//}
package com.xworkz.main;

import com.xworkz.entities.*;
import com.xworkz.handlers.*;

public class Main {
    public static void main(String[] args) {
        // JailHandler
        JailHandler jailHandler = new JailHandler(2);
        jailHandler.addJail(new Jail("Central Jail", "Bangalore", "Darshan", 300));
        jailHandler.addJail(new Jail("Tihar", "India", "Rajesh Kumar", 500));
        System.out.println("\nDisplaying Jails:");
        jailHandler.displayJails();

        // SatelliteHandler
        SatelliteHandler satelliteHandler = new SatelliteHandler(2);
        satelliteHandler.addSatellite(new Satellite(Satellite.Type.COMMUNICATION, 5000000, 2000, 500));
        satelliteHandler.addSatellite(new Satellite(Satellite.Type.SCIENTIFIC, 10000000, 1500, 700));
        System.out.println("\nDisplaying Satellites:");
        satelliteHandler.displaySatellites();

        // IdCardHandler
        IdCardHandler idCardHandler = new IdCardHandler(2);
        idCardHandler.addIdCard(new IdCard("Plastic", new String[]{"Red", "Blue"}, 15.0, "Govt"));
        idCardHandler.addIdCard(new IdCard("Metal", 20.0));
        System.out.println("\nDisplaying ID Cards:");
        idCardHandler.displayIdCards();

        // CameraHandler
        CameraHandler cameraHandler = new CameraHandler(2);
        cameraHandler.addCamera(new Camera("Canon", 50000.0, Camera.Type.DSLR, "WiFi"));
        cameraHandler.addCamera(new Camera("Sony", 75000.0, Camera.Type.MIRRORLESS, "Bluetooth"));
        System.out.println("\nDisplaying Cameras:");
        cameraHandler.displayCameras();

        // AlienHandler
        AlienHandler alienHandler = new AlienHandler(2);
        alienHandler.addAlien(new Alien("ISRO", "2024-03-15", "Tall green figure with glowing eyes"));
        alienHandler.addAlien(new Alien("Military Radar", "2023-11-10", "Unidentified fast-moving object"));
        System.out.println("\nDisplaying Aliens:");
        alienHandler.displayAllAliens();
    }
}

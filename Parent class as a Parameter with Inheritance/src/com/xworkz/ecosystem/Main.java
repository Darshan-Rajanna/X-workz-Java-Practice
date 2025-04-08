package com.xworkz.ecosystem;

import com.xworkz.ecosystem.animals.amphibians.Axolotl;
import com.xworkz.ecosystem.animals.amphibians.Newt;
import com.xworkz.ecosystem.animals.birds.Eagle;
import com.xworkz.ecosystem.animals.birds.Peacock;
import com.xworkz.ecosystem.animals.fish.Goldfish;
import com.xworkz.ecosystem.animals.fish.Shark;
import com.xworkz.ecosystem.animals.mammals.Bat;
import com.xworkz.ecosystem.animals.mammals.Dolphin;
import com.xworkz.ecosystem.animals.reptiles.Alligator;
import com.xworkz.ecosystem.animals.reptiles.Chameleon;
import com.xworkz.ecosystem.organisms.*;
import com.xworkz.ecosystem.animals.*;
import com.xworkz.ecosystem.fungi.*;
import com.xworkz.ecosystem.plants.*;
import com.xworkz.ecosystem.microbial.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("-------- Animal Types --------");
        testOrganism(new Amphibian("Frog", "Pond"));
        testOrganism(new Bird("Generic Bird", "Sky"));
        testOrganism(new Fish("Fish", "Ocean"));
        testOrganism(new Insect("Ant", "Garden"));
        testOrganism(new Mammal("Tiger", "Forest"));
        testOrganism(new Reptile("Lizard", "Rocky area"));

        System.out.println("\n-------- Fungi Types --------");
        testOrganism(new BreadMold("Bread Mould","Stale Bread"));
        testOrganism(new DeathCap("Death Cap", "Forest floor"));
        testOrganism(new Lichen("Lichen", "Rocks"));
        testOrganism(new Mold("Mold", "Moist areas"));
        testOrganism(new Mushroom("Mushroom", "Damp soil"));
        testOrganism(new OysterMushroom("Oyster Mushroom", "Decaying wood"));
        testOrganism(new PuffballMushroom("Puffball", "Woodland"));
        testOrganism(new Shiitake("Shiitake", "Hardwood"));
        testOrganism(new Truffle("Truffle", "Underground near trees"));
        testOrganism(new Yeast("Yeast", "Sugar-rich environment"));

        System.out.println("\n-------- Plant Types --------");
        testOrganism(new AquaticPlant("Lotus", "Pond"));
        testOrganism(new Tree("Oak Tree", "Forest"));
        testOrganism(new Grass("Bermuda Grass", "Lawns"));
        testOrganism(new Fern("Maidenhair Fern", "Moist, shady areas"));
        testOrganism(new Cactus("Saguaro", "Desert"));
        testOrganism(new FloweringPlant("Rose", "Garden"));

        System.out.println("\n-------- Microbial Types --------");
        testOrganism(new EscherichiaColi("E. coli", "Intestines"));
        testOrganism(new Lactobacillus("Lactobacillus", "Yogurt"));
        testOrganism(new Pseudomonas("Pseudomonas", "Soil and Water"));
        testOrganism(new Clostridium("Clostridium", "Anaerobic environments"));

        System.out.println("\n-------- Amphibian Types --------");
        System.out.println("\n-------- Axolotl --------");
        Axolotl axolotl=new Axolotl();
        axolotl.liveInWaterAndLand();
        axolotl.layEggsInWater();
        axolotl.coldBlooded();
        axolotl.moistSkin();
        axolotl.undergoMetamorphosis();

        System.out.println("\n-------- Newt --------");
        Newt newt=new Newt();
        newt.liveInWaterAndLand();
        newt.layEggsInWater();
        newt.coldBlooded();
        newt.moistSkin();
        newt.undergoMetamorphosis();

        System.out.println("\n-------- Bird Types --------");
        System.out.println("\n-------- Eagle --------");
        Eagle eagle=new Eagle();
        eagle.fly();
        eagle.buildNest();
        eagle.layEggs();
        eagle.migrate();
        eagle.sing();

        System.out.println("\n-------- Peacock --------");
        Peacock peacock=new Peacock();
        peacock.fly();
        peacock.buildNest();
        peacock.layEggs();
        peacock.migrate();
        peacock.sing();

        System.out.println("\n-------- Fish Types --------");
        System.out.println("\n-------- Gold Fish --------");
        Goldfish goldfish=new Goldfish();
        goldfish.layEggs();
        goldfish.hasFins();
        goldfish.breatheThroughGills();
        goldfish.swim();
        goldfish.liveInWater();

        System.out.println("\n-------- Shark --------");
        Shark shark=new Shark();
        shark.layEggs();
        shark.hasFins();
        shark.breatheThroughGills();
        shark.swim();
        shark.liveInWater();

        System.out.println("\n-------- Mammal Types --------");
        System.out.println("\n-------- Dolphin --------");
        Dolphin dolphin = new Dolphin("Dolphin", "Oceans and rivers");
        dolphin.giveBirth();
        dolphin.produceMilk();
        dolphin.regulateBodyTemperature();
        dolphin.haveHairOrFur();
        dolphin.breatheAir();

        System.out.println("\n-------- Bat --------");
        Bat bat = new Bat("Bat", "caves");
        bat.giveBirth();
        bat.produceMilk();
        bat.regulateBodyTemperature();
        bat.haveHairOrFur();
        bat.breatheAir();

        System.out.println("\n-------- Reptile Types --------");
        System.out.println("\n-------- Alligator --------");
        Alligator alligator = new Alligator();
        alligator.layEggs();
        alligator.coldBlooded();
        alligator.shedSkin();
        alligator.useCamouflage();
        alligator.crawl();

        System.out.println("\n-------- Chameleon --------");
        Chameleon chameleon = new Chameleon();
        chameleon.layEggs();
        chameleon.coldBlooded();
        chameleon.shedSkin();
        chameleon.useCamouflage();
        chameleon.crawl();

    }

    private static void testOrganism(Organism organism) {
        if (organism!=null) {
            System.out.println("\n--- Testing: " + organism.getClass().getSimpleName() + " ---");
            organism.grow();
            organism.reproduce();
            organism.obtainNutrition();
            organism.respondToStimuli();
            organism.respire();
        }
        else System.out.println("Organism is null");
    }
}

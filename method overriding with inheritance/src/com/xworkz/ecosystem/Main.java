package com.xworkz.ecosystem;

import com.xworkz.ecosystem.organisms.*;
import com.xworkz.ecosystem.animals.*;
import com.xworkz.ecosystem.fungi.*;
import com.xworkz.ecosystem.plants.*;

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
    }

    private static void testOrganism(Organism organism) {
        System.out.println("\n--- Testing: " + organism.getClass().getSimpleName() + " ---");
        organism.grow();
        organism.reproduce();
        organism.obtainNutrition();
        organism.respondToStimuli();
        organism.respire();
    }
}

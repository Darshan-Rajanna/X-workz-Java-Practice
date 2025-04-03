package com.xworkz.ecosystem;

import com.xworkz.ecosystem.animals.amphibians.*;
import com.xworkz.ecosystem.animals.fish.*;
import com.xworkz.ecosystem.animals.birds.*;
import com.xworkz.ecosystem.animals.insects.*;
import com.xworkz.ecosystem.animals.mammals.*;
import com.xworkz.ecosystem.animals.reptiles.*;
import com.xworkz.ecosystem.plants.aquatic.*;
import com.xworkz.ecosystem.plants.flowers.*;
import com.xworkz.ecosystem.plants.trees.*;
import com.xworkz.ecosystem.fungi.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Ecosystem Simulation ");

        // ** Amphibians **
        System.out.println("\n--- Amphibians ---");
        TreeFrog treeFrog = new TreeFrog();
        treeFrog.climbTrees();

        PoisonDartFrog poisonDartFrog = new PoisonDartFrog();
        poisonDartFrog.toxicSkin();

        Salamander salamander = new Salamander();
        salamander.regenerateLimbs();

        Newt newt = new Newt();
        newt.aquaticAndTerrestrial();

        Axolotl axolotl = new Axolotl();
        axolotl.regenerateBodyParts();

        // ** Fish **
        System.out.println("\n--- Fish ---");
        Goldfish goldfish = new Goldfish();
        goldfish.domesticatedPet();

        Shark shark = new Shark();
        shark.apexPredator();

        Clownfish clownfish = new Clownfish();
        clownfish.liveInSeaAnemones();

        Pufferfish pufferfish = new Pufferfish();
        pufferfish.inflateAsDefense();

        ElectricEel electricEel = new ElectricEel();
        electricEel.produceElectricShocks();

        // ** Birds **
        System.out.println("\n--- Birds ---");
        Macaw macaw = new Macaw();
        macaw.mimicSounds();

        Hawk hawk = new Hawk();
        hawk.huntingBehavior();

        Duck duck = new Duck();
        duck.swim();

        Swan swan = new Swan();
        swan.gracefulMovement();

        Peacock peacock = new Peacock();
        peacock.courtshipDisplay();

        BarnOwl barnOwl = new BarnOwl();
        barnOwl.silentFlight();

        // ** Insects **
        System.out.println("\n--- Insects ---");
        Butterfly butterfly = new Butterfly();
        butterfly.pollinateFlowers();

        HoneyBee honeyBee = new HoneyBee();
        honeyBee.collectNectar();

        Ladybug ladybug = new Ladybug();
        ladybug.eatAphids();

        Grasshopper grasshopper = new Grasshopper();
        grasshopper.jumpHigh();

        // ** Mammals **
        System.out.println("\n--- Mammals ---");
        Wolf wolf = new Wolf();
        wolf.howl();

        Rhinoceros rhino = new Rhinoceros();
        rhino.useHorn();

        Bear bear = new Bear();
        bear.hibernate();

        Giraffe giraffe = new Giraffe();
        giraffe.longNeck();

        Hippopotamus hippo = new Hippopotamus();
        hippo.stayUnderwater();

        Badger badger = new Badger();
        badger.burrow();

        // ** Reptiles **
        System.out.println("\n--- Reptiles ---");
        Gecko gecko = new Gecko();
        gecko.climbWalls();

        Iguana iguana = new Iguana();
        iguana.tailDefense();

        Cobra cobra = new Cobra();
        cobra.hoodDisplay();

        Alligator alligator = new Alligator();
        alligator.powerfulBite();

        Tortoise tortoise = new Tortoise();
        tortoise.longLifespan();

        MonitorLizard monitorLizard = new MonitorLizard();
        monitorLizard.activePredator();

        // ** Aquatic Plants **
        System.out.println("\n--- Aquatic Plants ---");
        WaterLily waterLily = new WaterLily();
        waterLily.floatOnWater();

        Duckweed duckweed = new Duckweed();
        duckweed.absorbNutrients();

        Hornwort hornwort = new Hornwort();
        hornwort.oxygenateWater();

        Seagrass seagrass = new Seagrass();
        seagrass.preventCoastalErosion();

        // ** Flowers **
        System.out.println("\n--- Flowers ---");
        Hibiscus hibiscus = new Hibiscus();
        hibiscus.attractPollinators();

        Daisy daisy = new Daisy();
        daisy.bloomInSunlight();

        Marigold marigold = new Marigold();
        marigold.pestRepellent();

        Jasmine jasmine = new Jasmine();
        jasmine.emitFragrance();

        Daffodil daffodil = new Daffodil();
        daffodil.attractPollinators();

        Lotus lotus = new Lotus();
        lotus.floatOnWater();

        // ** Trees **
        System.out.println("\n--- Trees ---");
        MapleTree mapleTree = new MapleTree();
        mapleTree.produceMapleSyrup();

        AppleTree appleTree = new AppleTree();
        appleTree.bearFruits();

        RedwoodTree redwoodTree = new RedwoodTree();
        redwoodTree.growTall();

        PalmTree palmTree = new PalmTree();
        palmTree.produceCoconuts();

        CherryBlossom cherryBlossom = new CherryBlossom();
        cherryBlossom.bloomSeasonally();

        BaobabTree baobabTree = new BaobabTree();
        baobabTree.storeWater();

        // ** Fungi **
        System.out.println("\n--- Fungi ---");
        Shiitake shiitake = new Shiitake();
        shiitake.usedInAsianCuisine();

        OysterMushroom oysterMushroom = new OysterMushroom();
        oysterMushroom.popularForCooking();

        BreadMold breadMold = new BreadMold();
        breadMold.decomposeBread();

        DeathCap deathCap = new DeathCap();
        deathCap.highlyPoisonous();

        PuffballMushroom puffballMushroom = new PuffballMushroom();
        puffballMushroom.releaseSpores();
    }
}

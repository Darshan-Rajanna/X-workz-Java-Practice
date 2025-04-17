package com.xworkz.ecosystem;
import com.xworkz.ecosystem.implementations.dual_interface.Darshan;
import com.xworkz.ecosystem.implementations.dual_interface.Female;
import com.xworkz.ecosystem.implementations.multiple_interface.Aryan;
import com.xworkz.ecosystem.implementations.single_interface.*;

public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion();
        System.out.println("Class Lion with single Interface implementation");
        lion.regulateBodyTemperature();
        lion.produceMilk();
        lion.giveBirth();

        Eagle eagle = new Eagle();
        System.out.println("Class Eagle with single Interface implementation");
        eagle.fly();
        eagle.buildNest();
        eagle.layEggs();

        Salmon salmon = new Salmon();
        System.out.println("Class Salmon with single Interface implementation");
        salmon.swim();
        salmon.breatheUnderwater();
        salmon.layEggsInWater();

        Oak oak = new Oak();
        System.out.println("Class Oak with single Interface implementation");
        oak.growTall();
        oak.produceOxygen();
        oak.provideShade();

        Rose rose = new Rose();
        System.out.println("Class Rose with single Interface implementation");
        rose.attractPollinators();
        rose.produceFlowers();
        rose.produceFruits();

        Tiger tiger = new Tiger();
        System.out.println("Class Tiger with single Interface implementation");
        tiger.giveBirth();
        tiger.produceMilk();
        tiger.regulateBodyTemperature();

        Sparrow sparrow = new Sparrow();
        System.out.println("Class Sparrow with single Interface implementation");
        sparrow.buildNest();
        sparrow.fly();
        sparrow.layEggs();

        Trout trout = new Trout();
        System.out.println("Class Trout with single Interface implementation");
        trout.breatheUnderwater();
        trout.layEggsInWater();
        trout.swim();

        Pine pine = new Pine();
        System.out.println("Class Pine with single Interface implementation");
        pine.growTall();
        pine.provideShade();
        pine.produceOxygen();

        Tulip tulip = new Tulip();
        System.out.println("Class Tulip with single Interface implementation");
        tulip.attractPollinators();
        tulip.produceFlowers();
        tulip.produceFruits();

        Elephant elephant = new Elephant();
        System.out.println("Class Elephant with single Interface implementation");
        elephant.giveBirth();
        elephant.produceMilk();
        elephant.regulateBodyTemperature();

        Parrot parrot = new Parrot();
        System.out.println("Class Parrot with single Interface implementation");
        parrot.buildNest();
        parrot.fly();
        parrot.layEggs();

        Shark shark = new Shark();
        System.out.println("Class Shark with single Interface implementation");
        shark.breatheUnderwater();
        shark.layEggsInWater();
        shark.swim();

        Maple maple = new Maple();
        System.out.println("Class Maple with single Interface implementation");
        maple.growTall();
        maple.provideShade();
        maple.produceOxygen();

        Lily lily = new Lily();
        System.out.println("Class Lily with single Interface implementation");
        lily.attractPollinators();
        lily.produceFlowers();
        lily.produceFruits();

        Giraffe giraffe = new Giraffe();
        System.out.println("Class Giraffe with single Interface implementation");
        giraffe.giveBirth();
        giraffe.produceMilk();
        giraffe.regulateBodyTemperature();

        Falcon falcon = new Falcon();
        System.out.println("Class Falcon with single Interface implementation");
        falcon.fly();
        falcon.layEggs();
        falcon.sing();

        Tuna tuna = new Tuna();
        System.out.println("Class Tuna with single Interface implementation");
        tuna.layEggs();
        tuna.swim();
        tuna.layEggsInWater();

        Birch birch = new Birch();
        System.out.println("Class Birch with single Interface implementation");
        birch.convertSunlightToEnergy();
        birch.photosynthesize();birch.produceOxygen();


        Daisy daisy = new Daisy();
        System.out.println("Class Daisy with single Interface implementation");
        daisy.grow();
        daisy.photosynthesize();
        daisy.produceOxygen();

        Wolf wolf = new Wolf();
        System.out.println("Class Wolf with single Interface implementation");
        wolf.giveBirth();
        wolf.produceMilk();wolf.regulateBodyTemperature();


        Owl owl = new Owl();
        System.out.println("Class Owl with single Interface implementation");
        owl.fly();
        owl.buildNest();
        owl.layEggs();

        Salmonid salmonid = new Salmonid();
        System.out.println("Class Salmonid with single Interface implementation");
        salmonid.swim();
        salmonid.layEggs();

        Darshan darshan = new Darshan();
        System.out.println("Class Darshan with Dual Interface Implementation");
        darshan.contributeToTerrestrialEcosystem();
        darshan.haveLandAdaptations();
        darshan.liveOnLand();
        darshan.produceMilk();
        darshan.giveBirth();

        Female female = new Female();
        System.out.println("Class Female with Dual Interface Implementation");
        female.competeForResources();
        female.defendTerritory();
        female.giveBirth();
        female.produceMilk();
        female.competeForResources();

        Aryan aryan=new Aryan();
        System.out.println("Class Aryan with Multiple/5 Interface Implementation");
        aryan.avoidDetection();
        aryan.beAtHigherTrophicLevel();
        aryan.blendWithEnvironment();
        aryan.contributeToTerrestrialEcosystem();
        aryan.consumeMeat();
        aryan.competeForResources();
        aryan.regulateBodyTemperature();
        aryan.defendTerritory();
        aryan.giveBirth();
        aryan.produceMilk();
        aryan.enhanceSurvival();
    }
}

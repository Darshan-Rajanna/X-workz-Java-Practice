package com.xworkz.ecosystem.implementations.multiple_interface;

import com.xworkz.ecosystem.interfaces.*;

public class Dinosaur implements Mammal, Predator, Prey, Aerial, Amphibian {

    @Override
    public void spendMostTimeFlying() {
        System.out.println("This dinosaur species is adapted to spend most of its time gliding or flying.");
    }

    @Override
    public void haveFlightAdaptations() {
        System.out.println("It has wings with membrane structures and hollow bones for flight.");
    }

    @Override
    public void contributeToAerialEcosystem() {
        System.out.println("As an aerial creature, it helps regulate insect populations from the sky.");
    }

    @Override
    public void liveInWaterAndLand() {
        System.out.println("It thrives both in swampy wetlands and on dry land.");
    }

    @Override
    public void undergoMetamorphosis() {
        System.out.println("This simulated species undergoes metamorphosis from aquatic juvenile to terrestrial adult.");
    }

    @Override
    public void produceMilk() {
        System.out.println("As a simulated mammal hybrid, it produces milk-like secretions to feed young.");
    }

    @Override
    public void regulateBodyTemperature() {
        System.out.println("It maintains a constant body temperature via internal thermoregulation.");
    }

    @Override
    public void hunt() {
        System.out.println("It stalks its prey using stealth and speed.");
    }

    @Override
    public void haveSharpSenses() {
        System.out.println("Its vision and smell are highly developed for detecting prey.");
    }

    @Override
    public void beAtTopOfFoodChain() {
        System.out.println("This predator has no natural enemies in its ecosystem.");
    }

    @Override
    public void evadePredators() {
        System.out.println("It uses camouflage and quick movement to escape larger predators during youth.");
    }

    @Override
    public void haveDefenseMechanisms() {
        System.out.println("Its tail and claws serve as defense tools against attackers.");
    }

    @Override
    public void reproduceQuickly() {
        System.out.println("It lays multiple eggs with short hatching cycles for rapid reproduction.");
    }

    // Default method overrides (if you add them in interfaces)
    @Override
    public void mammalInfo() {
        System.out.println("Overridden: This dinosaur exhibits mammal-like traits in simulation.");
    }

    @Override
    public void predatorInfo() {
        System.out.println("Overridden: Dinosaur acts as an apex predator.");
    }

    @Override
    public void preyInfo() {
        System.out.println("Overridden: Dinosaur can also be prey during juvenile stages.");
    }

    @Override
    public void aerialInfo() {
        System.out.println("Overridden: This dinosaur can glide and contribute to aerial ecosystems.");
    }

    @Override
    public void amphibianInfo() {
        System.out.println("Overridden: Dinosaur adapts to both land and aquatic environments.");
    }
}

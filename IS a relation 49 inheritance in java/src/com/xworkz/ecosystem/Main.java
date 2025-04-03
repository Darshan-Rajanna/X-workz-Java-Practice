package com.xworkz.ecosystem;

import com.xworkz.ecosystem.organisms.*;
import com.xworkz.ecosystem.animals.*;
import com.xworkz.ecosystem.animals.mammals.*;
import com.xworkz.ecosystem.animals.birds.*;
import com.xworkz.ecosystem.animals.reptiles.*;
import com.xworkz.ecosystem.plants.*;
import com.xworkz.ecosystem.plants.trees.*;
import com.xworkz.ecosystem.plants.flowers.*;
import com.xworkz.ecosystem.fungi.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n--- Ecosystem Simulation Start ---");
        // Testing Organisms
        Organism organism = new Organism("Generic Organism", "Earth", true, "Asexual", "Autotrophic");
        organism.grow();
        organism.reproduce();

        // Testing Animals
        Animal lion = new Lion("Lion", "Savanna");
        lion.sleep();
        lion.move();

        Animal eagle = new Eagle("Eagle", "Mountains");
        eagle.sleep();
        eagle.move();

        Animal snake = new Snake("Snake", "Jungle");
        snake.sleep();
        snake.move();

        // Testing Plants
        Plant oakTree = new OakTree("Oak Tree", "Forest");
        oakTree.photosynthesize();
        oakTree.absorbWaterAndNutrients();

        Plant rose = new Rose("Rose", "Gardens");
        rose.photosynthesize();
        rose.absorbWaterAndNutrients();

        // Testing Fungi
        Fungi mushroom = new Mushroom("Mushroom", "Forests");
        mushroom.decompose();
        mushroom.reproduce();

        // Specific Behaviors
        ((Lion) lion).roar();
        ((Eagle) eagle).huntPrey();
        ((Snake) snake).shedSkin();
        ((OakTree) oakTree).produceAcorns();
        ((Rose) rose).haveThorns();
        ((Mushroom) mushroom).produceEdibleFruitingBody();

        System.out.println("\n--- Ecosystem Simulation Complete ---");
    }
}

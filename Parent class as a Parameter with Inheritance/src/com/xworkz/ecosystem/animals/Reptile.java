package com.xworkz.ecosystem.animals;

import com.xworkz.ecosystem.organisms.Animal;

public class Reptile extends Animal {
    public Reptile(String name, String habitat) {
        super(name, habitat);
    }

    @Override
    public void move() {
        System.out.println(name + " crawls or slithers depending on the species.");
    }

    @Override
    public void grow() {
        System.out.println(name + " grows by molting or gradually increasing in size.");
    }

    @Override
    public void reproduce() {
        System.out.println(name + " reproduces by laying eggs on land.");
    }

    @Override
    public void obtainNutrition() {
        System.out.println(name + " feeds on insects, small animals, or plants.");
    }

    @Override
    public void respondToStimuli() {
        System.out.println(name + " reacts to heat, light, and vibrations.");
    }

    @Override
    public void respire() {
        System.out.println(name + " breathes through lungs.");
    }

    // Reptile-specific behaviors (remains protected, can be made public if needed)
    protected void crawl() {
        System.out.println(name + " is crawling on the ground.");
    }

    protected void layEggs() {
        System.out.println(name + " lays eggs for reproduction.");
    }

    protected void coldBlooded() {
        System.out.println(name + " is cold-blooded and depends on the environment for body heat.");
    }

    protected void shedSkin() {
        System.out.println(name + " sheds its skin periodically.");
    }

    protected void useCamouflage() {
        System.out.println(name + " uses camouflage to blend into its surroundings.");
    }
}

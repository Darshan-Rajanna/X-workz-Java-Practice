package com.xworkz.ecosystem.animals;

import com.xworkz.ecosystem.organisms.Animal;

public class Insect extends Animal {

    public Insect(String name, String habitat) {
        super(name, habitat);
    }

    // Overriding and making Animal's protected methods public
    @Override
    public void move() {
        System.out.println(name + " moves by crawling or flying depending on the species.");
    }

    @Override
    public void communicate() {
        System.out.println(name + " communicates using pheromones and sounds.");
    }

    @Override
    public void huntOrGraze() {
        System.out.println(name + " may graze on plants or hunt smaller insects.");
    }

    @Override
    public void sleep() {
        System.out.println(name + " enters a state of rest but doesn’t sleep like mammals.");
    }

    @Override
    public void defend() {
        System.out.println(name + " defends using camouflage, stingers, or chemical sprays.");
    }

    // Overriding Organism behaviors
    @Override
    public void grow() {
        System.out.println(name + " grows through various stages of metamorphosis.");
    }

    @Override
    public void reproduce() {
        System.out.println(name + " lays eggs to reproduce.");
    }

    @Override
    public void obtainNutrition() {
        System.out.println(name + " feeds on plants, decaying matter, or other small organisms.");
    }

    @Override
    public void respondToStimuli() {
        System.out.println(name + " responds to light, touch, and chemical signals.");
    }

    @Override
    public void respire() {
        System.out.println(name + " respires through tiny openings called spiracles.");
    }

    // Insect-specific protected methods
    protected void crawlOrFly() {
        System.out.println(name + " can either crawl or fly depending on the species.");
    }

    protected void exoskeleton() {
        System.out.println(name + " has a hard outer exoskeleton for protection.");
    }

    protected void metamorphosis() {
        System.out.println(name + " undergoes metamorphosis during its lifecycle.");
    }

    protected void hasAntennae() {
        System.out.println(name + " uses antennae to sense its surroundings.");
    }

    protected void layEggs() {
        System.out.println(name + " lays eggs for reproduction.");
    }
}

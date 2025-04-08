package com.xworkz.ecosystem.animals.reptiles;

import com.xworkz.ecosystem.animals.Reptile;

public class MonitorLizard extends Reptile {
    public MonitorLizard() {
        super("Monitor Lizard", "Forests, savannas, and wetlands");
    }

    @Override
    public void crawl() {
        System.out.println(name + " crawls using strong limbs and a low posture.");
    }

    @Override
    public void layEggs() {
        System.out.println(name + " lays eggs in nests and burrows.");
    }

    @Override
    public void coldBlooded() {
        System.out.println(name + " needs sun to warm up and become active.");
    }

    @Override
    public void shedSkin() {
        System.out.println(name + " sheds skin regularly as it grows.");
    }

    @Override
    public void useCamouflage() {
        System.out.println(name + " uses earth-toned skin to blend with terrain.");
    }
}
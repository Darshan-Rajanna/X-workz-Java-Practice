package com.xworkz.ecosystem.animals.reptiles;

import com.xworkz.ecosystem.animals.Reptile;

public class Gecko extends Reptile {
    public Gecko() {
        super("Gecko", "Forests, deserts, and human homes");
    }

    @Override
    public void crawl() {
        System.out.println(name + " crawls vertically using sticky toe pads.");
    }

    @Override
    public void layEggs() {
        System.out.println(name + " lays small eggs in hidden locations.");
    }

    @Override
    public void coldBlooded() {
        System.out.println(name + " needs external heat to stay active.");
    }

    @Override
    public void shedSkin() {
        System.out.println(name + " sheds skin and may eat it for nutrients.");
    }

    @Override
    public void useCamouflage() {
        System.out.println(name + " blends in with surroundings to hide from predators.");
    }
}

package com.xworkz.ecosystem.plants.trees;

import com.xworkz.ecosystem.plants.Tree;

public class BanyanTree extends Tree {
    public BanyanTree() {
        super("Banyan Tree", "Tropical and subtropical regions");
    }

    @Override
    public void growTall() {
        System.out.println(name + " grows tall with a wide canopy and spreading branches.");
    }

    @Override
    public void shedLeaves() {
        System.out.println(name + " sheds its leaves seasonally depending on the climate.");
    }

    @Override
    public void provideOxygen() {
        System.out.println(name + " releases abundant oxygen through photosynthesis.");
    }

    @Override
    public void produceFruitsOrSeeds() {
        System.out.println(name + " produces small red figs that contain seeds.");
    }

    @Override
    public void supportEcosystem() {
        System.out.println(name + " provides shelter and food to birds, insects, and mammals.");
    }

    public void growAerialRoots() {
        System.out.println(name + " grows aerial roots that develop into additional trunks.");
    }
}

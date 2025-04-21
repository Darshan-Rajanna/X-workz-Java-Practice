package com.xworkz.ecosystem.implementations.multiple_interface;

import com.xworkz.ecosystem.interfaces.LiveBearer;
import com.xworkz.ecosystem.interfaces.Tree;
import com.xworkz.ecosystem.interfaces.Parasite;
import com.xworkz.ecosystem.interfaces.Plant;
import com.xworkz.ecosystem.interfaces.WaterPurifier;

public class Rice implements LiveBearer, Plant, Tree, WaterPurifier, Parasite {

    @Override
    public void giveBirthToLiveYoung() {
        System.out.println("Rice typically reproduces by seeds, not live birth, but for simulation, emitting sprouted seeds.");
    }

    @Override
    public void provideInternalNourishment() {
        System.out.println("Rice plant provides nourishment to its growing grains through the vascular system.");
    }

    @Override
    public void haveLowerOffspringNumbers() {
        System.out.println("Rice is genetically modified here to have fewer but nutrient-rich grains.");
    }

    @Override
    public void dependOnHost() {
        System.out.println("As a parasitic simulation, this rice variant draws nutrients from neighboring plants.");
    }

    @Override
    public void harmHost() {
        System.out.println("This rice plant outcompetes its host by taking up root space and nutrients.");
    }

    @Override
    public void reproduceRapidly() {
        System.out.println("Rice reproduces rapidly through tillers and seed dispersal.");
    }

    @Override
    public void photosynthesize() {
        System.out.println("Rice plant uses sunlight to produce glucose through photosynthesis.");
    }

    @Override
    public void convertSunlightToEnergy() {
        System.out.println("Chlorophyll in rice leaves absorbs sunlight to synthesize food.");
    }

    @Override
    public void growTall() {
        System.out.println("Rice grows up to 3-4 feet in height depending on the variety and water availability.");
    }

    @Override
    public void produceOxygen() {
        System.out.println("Rice releases oxygen during photosynthesis, contributing to the atmosphere.");
    }

    @Override
    public void provideShade() {
        System.out.println("Rice fields provide shade to soil, helping retain moisture.");
    }

    @Override
    public void filterImpurities() {
        System.out.println("Rice paddies naturally filter suspended solids from standing water.");
    }

    @Override
    public void maintainWaterQuality() {
        System.out.println("Rice roots contribute to the bioremediation of water by uptaking nutrients and toxins.");
    }

    @Override
    public void supportAquaticLife() {
        System.out.println("Rice fields support fish, frogs, and microbial life within the aquatic ecosystem.");
    }
}

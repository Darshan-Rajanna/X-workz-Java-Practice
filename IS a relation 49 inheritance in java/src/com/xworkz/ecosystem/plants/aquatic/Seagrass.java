package com.xworkz.ecosystem.plants.aquatic;

import com.xworkz.ecosystem.plants.AquaticPlant;

public class Seagrass extends AquaticPlant {
    public Seagrass() {
        super("Seagrass", "Shallow marine environments");
    }

    public void provideMarineHabitat() {
        System.out.println(name + " serves as an essential habitat for marine creatures.");
    }

    public void preventCoastalErosion() {
        System.out.println(name + " stabilizes the seabed and reduces coastal erosion.");
    }
}

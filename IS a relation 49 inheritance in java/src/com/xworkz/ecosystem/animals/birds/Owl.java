package com.xworkz.ecosystem.animals.birds;

import com.xworkz.ecosystem.animals.Bird;

public class Owl extends Bird {
    public Owl(String name, String habitat) {
        super(name, habitat);
    }

    public void seeInDark() {
        System.out.println(name + " has excellent night vision for hunting in darkness.");
    }
}

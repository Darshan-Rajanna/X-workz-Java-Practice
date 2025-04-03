package com.xworkz.ecosystem.animals.reptiles;

import com.xworkz.ecosystem.animals.Reptile;

public class Snake extends Reptile {
    public Snake(String name, String habitat) {
        super(name, habitat);
    }

    public void venomousBite() {
        System.out.println(name + " can inject venom through its fangs.");
    }
}

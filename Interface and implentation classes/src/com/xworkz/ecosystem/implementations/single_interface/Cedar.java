package com.xworkz.ecosystem.implementations.single_interface;

import com.xworkz.ecosystem.interfaces.Plant;

public class Cedar implements Plant {
    public void photosynthesize() { System.out.println("Cedar tree uses sunlight to make food"); }
    public void grow() { System.out.println("Cedar grows into a large coniferous tree"); }
}

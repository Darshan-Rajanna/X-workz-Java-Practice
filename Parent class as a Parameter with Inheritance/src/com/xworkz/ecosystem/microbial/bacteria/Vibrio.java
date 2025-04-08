package com.xworkz.ecosystem.microbial.bacteria;
import com.xworkz.ecosystem.microbial.Bacteria;
import com.xworkz.ecosystem.organisms.Organism;

public class Vibrio extends Bacteria {
    public Vibrio(String name, String habitat) {
        super(name, habitat);
    }

    @Override
    public void formBiofilm() {
        System.out.println(name + " (Vibrio) forms comma-shaped biofilms in watery habitats.");
    }

    @Override
    public void formSpores() {
        System.out.println(name + " (Vibrio) rarely forms spores.");
    }

    @Override
    public void mutate() {
        System.out.println(name + " (Vibrio) adapts rapidly via genetic mutation.");
    }

    @Override
    public void developAntibioticResistance() {
        System.out.println(name + " (Vibrio) gains resistance via transduction.");
    }

    @Override
    public void engageInSymbiosis() {
        System.out.println(name + " (Vibrio) lives symbiotically in marine animals.");
    }

    public void organismInfo(Organism organism) {
        if (organism instanceof Vibrio) {
            System.out.println("This organism is an instance of Vibrio.");
            ((Vibrio) organism).formBiofilm();
        } else if (organism instanceof Bacteria) {
            ((Bacteria) organism).developAntibioticResistance();
        } else {
            organism.grow();
            organism.obtainNutrition();
        }
    }
}

package com.xworkz.projector;
import com.xworkz.projector.components.*;

public class Projector {
    Len lens;
    Lamp lamp;
    Port port;
    Wire wire;
    Board board;
    Button button;
    Panel panel;
    Remote remote;
    Screw screw;

    public Projector() {
        this.lens = new Len("Zoom", 50);
        this.lamp = new Lamp(150, "2000 hours");
        this.port = new Port("HDMI", 2);
        this.wire = new Wire("Copper", 3);
        this.board = new Board("X200", "Sony");
        this.button = new Button("Power");
        this.panel = new Panel("LCD", 1080);
        this.remote = new Remote("Sony", 10);
        this.screw = new Screw(5, "Steel");
    }

    public void displayProjectorInfo() {
        System.out.println("--- Projector Components Info ---");
        lens.displayInfo();
        lamp.displayInfo();
        port.displayInfo();
        wire.displayInfo();
        board.displayInfo();
        button.press();
        panel.displayInfo();
        remote.displayInfo();
        screw.displayInfo();
    }
}

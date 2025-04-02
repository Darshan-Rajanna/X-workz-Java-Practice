package com.xworkz.projector.components;

public class Button {
    String function;
    boolean isPressed;

    public Button(String function) {
        this.function = function;
        this.isPressed = false;
    }

    public void press() {
        isPressed = !isPressed;
        System.out.println("Button " + function + " is " + (isPressed ? "Pressed" : "Released"));
    }
}
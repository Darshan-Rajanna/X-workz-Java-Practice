package com.xworkz.handlers;

import com.xworkz.entities.Camera;

public class CameraHandler {

    private Camera[] cameras;
    private int count;

    // Constructor to initialize the Camera array
    public CameraHandler(int size) {
        cameras = new Camera[size];
        count = 0;
    }

    // Method to add a new Camera
    public void addCamera(Camera camera) {
        if (count < cameras.length) {
            cameras[count] = camera;
            count++;
        } else {
            System.out.println("Camera array is full. Cannot add more cameras.");
        }
    }

    // Method to display all cameras
    public void displayCameras() {
        if (count == 0) {
            System.out.println("No Cameras available.");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println(cameras[i].displayCamera());
        }
    }

    // Method to get a camera by index
    public Camera getCamera(int index) {
        if (index >= 0 && index < count) {
            return cameras[index];
        } else {
            System.out.println("Invalid index. Returning null.");
            return null;
        }
    }
}

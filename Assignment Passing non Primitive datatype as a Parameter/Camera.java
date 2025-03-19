class Camera {
    void shoot(Studio studio) {
        if (studio != null) {
            studio.capture();
        } else {
            System.out.println("Camera object is null, cannot take pictures");
        }
    }
    static class Studio {
        void capture() {
            System.out.println("Camera is capturing an image");
        }
    }
}
class Camera {
    void shoot(Studio studio) {
        if (studio != null) {
            studio.capture();
            System.out.println("Studio is not null");
        } else {
            System.out.println("Studio object is null, cannot take pictures");
        }
    }
    static class Studio {
        void capture() {
            System.out.println("Camera is capturing an image");
        }
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

/**
 *
 * @author hannu.korhonen
 */
interface Image {
    public void displayImage();
    public void showData();
}

// On System A
class RealImage implements Image {
    private final String filename;

    /**
     * Constructor
     * @param filename
     */
    public RealImage(String filename) {
        this.filename = filename;
        loadImageFromDisk();
    }

    /**
     * Loads the image from the disk
     */
    private void loadImageFromDisk() {
        System.out.println("Loading   " + filename);
    }

    /**
     * Displays the image
     */
    @Override
    public void displayImage() {
        System.out.println("Displaying " + filename);
    }
    
    @Override
    public void showData() {
        System.out.println("Filename: " + filename);
    }
}

// On System B
class ProxyImage implements Image {
    private final String filename;
    private RealImage image;
    
    /**
     * Constructor
     * @param filename
     */
    public ProxyImage(String filename) {
        this.filename = filename;
    }

    /**
     * Displays the image
     */
    @Override
    public void displayImage() {
        if (image == null) {
           image = new RealImage(filename);
        }
        image.displayImage();
    }
    
    @Override
    public void showData() {
        System.out.println("Filename: " + filename);
    }
}

class ProxyExample {
    /**
    * Test method
    */
    public static void main(final String[] arguments) {
        Image image1 = new ProxyImage("HiRes_10MB_Photo1");
        Image image2 = new ProxyImage("HiRes_10MB_Photo2");
        
        image1.displayImage(); // loading necessary
        image1.displayImage(); // loading unnecessary
        image2.displayImage(); // loading necessary
        image2.displayImage(); // loading unnecessary
        image1.displayImage(); // loading unnecessary
    }

}
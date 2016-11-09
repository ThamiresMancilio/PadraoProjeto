/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patternproxyexample2;

/**
 *
 * @author Thamires
 */
public class RealImage implements Image{
    private String filename = null;
    /**
     * Constructor
     * @param filename
     */
    public RealImage(final String filename) { 
        this.filename = filename;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.println("Loading   " + filename);
    }

    // Método Abstrato
    public void displayImage() { 
        System.out.println("Displaying " + filename); 
    }
}

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
public class ProxyImage implements Image{
    
    
    private RealImage image = null;
    private String filename = null;
    
    public ProxyImage(final String filename) { 
        this.filename = filename; 
    }

    /**
     * Displays the image
     */
    
    //método abstrato
    public void displayImage() {
        if (image == null) {
           image = new RealImage(filename);
        } 
        image.displayImage();
    }
}

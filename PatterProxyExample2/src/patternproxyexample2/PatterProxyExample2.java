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
public class PatterProxyExample2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        final Image IMAGE1 = new ProxyImage("HiRes_10MB_Photo1");
        final Image IMAGE2 = new ProxyImage("HiRes_10MB_Photo2");
        
        IMAGE1.displayImage(); 
        IMAGE1.displayImage(); 
        IMAGE2.displayImage();
        IMAGE2.displayImage(); 
        IMAGE1.displayImage(); 
    }
    
}

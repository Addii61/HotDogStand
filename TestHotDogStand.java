/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testhotdogstand;

/**
 *
 * @author cui
 */
public class TestHotDogStand {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HotDogStand HotDogStand1=new HotDogStand(123,12);
        HotDogStand HotDogStand2=new HotDogStand(456,12);
        HotDogStand HotDogStand3=new HotDogStand(789,12);
        HotDogStand1.JustSold();
        HotDogStand2.JustSold();
        HotDogStand3.JustSold();
        System.out.println("Hot Dogs Sold at Stand 1: " + HotDogStand1.getSold());
        System.out.println("Hot Dogs Sold at Stand 2: " + HotDogStand2.getSold());
        System.out.println("Hot Dogs Sold at Stand 3: " + HotDogStand3.getSold());
    }
    
}

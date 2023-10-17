/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testhotdogstand;

/**
 *
 * @author cui
 */
public class HotDogStand {
    private int IDNumber;
    private int sold;
    public HotDogStand(int i,int s){
      this.IDNumber=i;
      this.sold=s;
    }
     public void JustSold(){
        this.sold++;
    }

    public int getIDNumber() {
        return IDNumber;
    }

    public int getSold() {
        return sold;
    }
     
}

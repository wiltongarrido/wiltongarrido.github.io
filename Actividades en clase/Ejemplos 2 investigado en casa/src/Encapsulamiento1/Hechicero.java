/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encapsulamiento1;

/**
 *
 * @author Constanza
 */
public class Hechicero extends Personaje {
    
    private int poder;
    
    public void saludar(){
        
        System.out.println("Hola! Soy un Hechicero");
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }
    
    
    
}

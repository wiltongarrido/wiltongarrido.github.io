/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encapsulamiento1;

/**
 *
 * @author Constanza
 */
public class Main {
    
    public static void main(String[] args){
        
        Personaje hechicero=new Hechicero();
        
        hechicero.setNombre("Wilton");
        hechicero.setEdad(18);
        hechicero.setTextura("Guapo");
        
        System.out.println("Name:" + hechicero.getNombre());
        System.out.println("Edad:" + hechicero.getEdad());
        System.out.println("Textura:" + hechicero.getTextura());
        
        hechicero.saludar();
        
    }
    
}

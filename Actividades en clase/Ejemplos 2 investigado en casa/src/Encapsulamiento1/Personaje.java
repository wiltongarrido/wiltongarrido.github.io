/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encapsulamiento1;

/**
 *
 * @author Constanza
 */
public class Personaje {
    
    private String nombre;
    private int edad;
    private String textura;
    
    public void saludar() {
        
        System.out.println ("Hola");
        
    }
    
    public String getNombre () {
        
        return nombre;
        
    }
    public void setNombre(String nombre) {
        
        this.nombre= nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTextura() {
        return textura;
    }

    public void setTextura(String textura) {
        this.textura = textura;
    }
    
    
}


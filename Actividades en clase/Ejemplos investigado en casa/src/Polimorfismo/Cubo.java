/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo;

/**
 *
 * @author Constanza
 */
public abstract class Cubo {
    
    protected int dimension;
    protected String nombre;
    protected String textura;
    
    public void destruir() {
        
        System.out.println("Uy me rompí pero no se que hacer porque no tengo identidad xd :(");
    }
    
    public void construir() {
        
        System.out.println("uy pusiste algo pero no se que es por que no tiene identidad");
    }
    
}

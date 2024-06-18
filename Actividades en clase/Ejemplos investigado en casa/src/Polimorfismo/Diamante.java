/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo;

/**
 *
 * @author Constanza
 */
public class Diamante extends Cubo {
    
    private int xp;
    
    public void destruir() {
        System.out.println("Uy me rompí, ten un diamante");
    }
    
    public void construir() {
        System.out.println("Uy colocaste un bloque de diamante");
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animal;

/**
 *
 * @author Constanza
 */
public class Principal {
    public static void main(String[]args){
        Persona persona=new Persona();
        Perro perro=new Perro();
        Vaca vaca=new Vaca(); 
        
        persona.comer();
        perro.comer();
        vaca.comer();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo;

/**
 *
 * @author Constanza
 */
public class Main {
    
    public static void main(String[] args) {
        
        Cubo carbonsito=new Carbon();
        carbonsito.destruir();
        
        Cubo diamante=new Diamante();
        diamante.destruir();
        
        Cubo carbon=new Carbon();
        carbon.construir();
        
        Cubo diamantito=new Diamante();
        diamantito.construir();
        
        
        
    }
    
}

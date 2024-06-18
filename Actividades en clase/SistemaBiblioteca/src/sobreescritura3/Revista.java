/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sobreescritura3;

/**
 *
 * @author wilton
 */
public class Revista extends Material{
    
    private int tipodecontenido;
    @Override
    public void mostrar() {
        
        System.out.println("Estoy viendo un catalogo de ropa");
    }

    public int getTipodecontenido() {
        return tipodecontenido;
    }

    public void setTipodecontenido(int tipodecontenido) {
        this.tipodecontenido = tipodecontenido;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author Constanza
 */
public class PrincipaI {
    public static void main(String[] args){
        CuentaBancaria cuentas = new CuentaBancaria();
        
        cuentas.setNcuenta(1);
        cuentas.setNomtitular("Wilton Garrido");
        cuentas.setSaldo(1500);
        
        System.out.println("Numero de cuenta:" + cuentas.getNcuenta());
        System.out.println("Nombre:" + cuentas.getNomtitular());
        System.out.println("Saldo:" + cuentas.getSaldo());
        cuentas.proceso();
    }
}

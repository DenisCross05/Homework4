/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication29tiendadscuento;

import javax.swing.JOptionPane;

/**
 *
 * @author G6
 */
public class JavaApplication29TiendaDscuento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float p=10, d=0, tot = 0, u=0;//el precio por docena es igual a $10
        int n;
        String totcompra=null, descuento=null, docenas, prepro=null, unidades; 
        System.out.println("***El precio fijo por docena es de $10***");
        for (int i = 1; i <= 10; i ++ ){
        docenas = JOptionPane.showInputDialog("Ingrese el numero de docenas a vender para el cliente: " +i);
        n = Integer.parseInt(docenas);
        p=n*10;
        
        if (n==3)
        {
            d= (float) (p*0.15);
            u=0;
        }
        if (n<3)
        {
            d= (float) (p*0.10);
            u=0;
        } 
        if (n>3)
        {
        d= (float) (p*0.15);   
        u=n;
        }
        else
        {
            unidades=null;
        }
        tot=n*10-d;
        
        
        System.out.println("******************************************************************");
        System.out.println("El monto total de compra del cliente "+i+" es $:"+tot);
        System.out.println("El monto de descuento del cliente "+i+" es: $"+d);
        System.out.println("El numero de unidades de obsequio para el cliente "+i+" es:"+u);
        }
    }
}

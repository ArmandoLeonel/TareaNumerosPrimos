/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosprimos;

import javax.swing.JOptionPane;

/**
 *
 * @author Armando Yañez
 */
public class NumerosPRIMOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int N1=Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantos numeros primos requieres? "));
        int x=2;
        int Fr;
        int i;
        boolean Nprimo;
    
        for (  i = 0 ; i <N1 ; x++) {
        Nprimo=true;
         for ( Fr = 2 ; Fr<=x/2 && Nprimo==true ; Fr++) {
             if(x %Fr==0)Nprimo = false;
         }
         
             if (Nprimo){
              i++;
                 System.out.println(x);
            
       }}}}

    


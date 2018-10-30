/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.viteri.modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class Areas {
    double r=0;
    double area, base,altura; 
    public void calcular(){
        r=Double.parseDouble(JOptionPane.showInputDialog("INGREESE EL RADIO"));
        r= Math.PI*Math.pow(r,2);
        JOptionPane.showMessageDialog(null,r);
    }
     public void calculartriangulo(){
        altura=Double.parseDouble(JOptionPane.showInputDialog("INGREESE LA ALTURA")); 
        base=Double.parseDouble(JOptionPane.showInputDialog("INGREESE la base"));
        area=(base*altura)/2;
        JOptionPane.showMessageDialog(null,area);
     }
            

    
}

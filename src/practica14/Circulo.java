/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica14;

/**
 *
 * @author Usuario
 */
public class Circulo {
    private int radio;

    public void setRadio(int radio) {
        this.radio = radio;
    }
    
    public double area(){
        return radio*radio*3.14159265;
    }
            
    
}

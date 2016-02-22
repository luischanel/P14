/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica14;

import static java.lang.Math.sqrt;

/**
 *
 * @author Usuario
 */
public class Triangulo {
    private int a;
    private int b;
    private int c;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }
    
    public double area(){
        double area1, s;
        s=(a+b+c)/2;
        area1=(sqrt(s*(s-a)*(s-b)*(s-c)));
        return area1;
    }
}

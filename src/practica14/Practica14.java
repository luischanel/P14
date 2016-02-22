/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica14;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Practica14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sel, ladoA, ladoB, ladoC, radio1, salir=0;
        Triangulo tr1= new Triangulo();
        Circulo cr1= new Circulo();
        Scanner lector= new Scanner(System.in);
        while(salir==0){
            System.out.println("Seleccione figura:");
            System.out.println("1. Circulo   2. Triangulo 3. Salir");
            sel=lector.nextInt();
            switch (sel){
                case 1:
                    System.out.println("Ingrese radio: ");
                    radio1=lector.nextInt();
                    cr1.setRadio(radio1);
                    System.out.println("El area es: "+cr1.area());
                    break;            
                case 2:
                    System.out.println("Ingrese ladoA: ");
                    ladoA=lector.nextInt();
                    tr1.setA(ladoA);

                    System.out.println("Ingrese ladoB: ");
                    ladoB=lector.nextInt();
                    tr1.setB(ladoB);

                    System.out.println("Ingrese ladoC: ");
                    ladoC=lector.nextInt();
                    tr1.setC(ladoC);
                    System.out.println("El area es: "+tr1.area());
                    break;            
                case 3:
                    salir=1;
                    break;
            }
        }
        
    System.out.println("FIN");
}

    
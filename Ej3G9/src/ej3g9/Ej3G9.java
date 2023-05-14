/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3g9;

import Servicios.ArregloServicio;

/**
 *
 * @author U
 */
public class Ej3G9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // TODO code application logic here
        double[] A = new double[50];
        double[] B = new double[20];
        ArregloServicio nuevo = new ArregloServicio();

        nuevo.inicializarA(A);
        System.out.println("ARREGLO A");
        nuevo.mostrar(A);
        System.out.println("ORDENA A");

        nuevo.ordenar(A);
        System.out.println("");
        nuevo.inicializarB(A, B);
        System.out.println("ARREBLO A");
        nuevo.mostrar(A);
        System.out.println("ARREGLO B");
        nuevo.mostrar(B);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Arrays;

/**
 *
 * @author U
 */
public class ArregloServicio {

    public void inicializarA(double[] n) {
        for (int i = 0; i < 50; i++) {
            n[i] = Math.random() * 10;
        }

    }

    public void mostrar(double[] n) {
        System.out.println(Arrays.toString(n));
    }

    public void ordenar(double[] n) {
        double[] auxA = new double[50];
        System.arraycopy(n, 0, auxA, 0, 50);
        Arrays.sort(auxA);
        for (int i = 49; i >= 0; i--) {
            System.out.print("[" + auxA[i] + "]");

        }

    }

    public void inicializarB(double[] n, double[] n1) {

        System.arraycopy(n, 0, n1, 0, 10);
        for (int i = 10; i < 20; i++) {
            n1[i] = 0.5;

        }

    }

    
}

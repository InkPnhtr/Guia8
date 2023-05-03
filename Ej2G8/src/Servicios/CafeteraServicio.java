/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cafetera;

/**
 *
 * @author U
 */
public class CafeteraServicio {

    Cafetera C1 = new Cafetera();

    public void llenarCafetera() {
        C1.setCapacidadMáxima(500);
        C1.setCantidadActual(C1.getCapacidadMáxima());
        System.out.println("Cafetera Llena " + C1.getCantidadActual());
    }

    public void servirTaza(int capacTaza) {
        if (C1.getCantidadActual() > capacTaza) {
            C1.setCantidadActual(C1.getCantidadActual() - capacTaza);
            System.out.println("Se llenoo taza queda Cant. Actual: " + C1.getCantidadActual());
        } else {
            System.out.println("No Hay suficiente Cafe, se llena: " + C1.getCantidadActual() + " de " + capacTaza);
            C1.setCantidadActual(0);
            vaciarCafetera();
        }
    }

    public void vaciarCafetera() {
        C1.setCantidadActual(0);
    }

    public void agregarCafe(int CantCafeAgreg) {
        C1.setCantidadActual(C1.getCantidadActual() + CantCafeAgreg);
        System.out.println("Se agrego cafe: " + CantCafeAgreg);
        System.out.println("Cant Actual: " + C1.getCantidadActual());
    }
}

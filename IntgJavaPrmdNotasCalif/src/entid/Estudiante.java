/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entid;

/**
 *
 * @author U
 */
public class Estudiante {
    private String nombre;
    private double nota;

    public Estudiante() {
    }

    public Estudiante(String nombre, double notas) {
        this.nombre = nombre;
        this.nota = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNotas() {
        return nota;
    }

    public void setNotas(double notas) {
        this.nota = notas;
    }
    
    
}

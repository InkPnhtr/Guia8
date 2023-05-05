/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Persona;
import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author U
 */
public class PersonaServicio {

    Persona P = new Persona();

    //Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
    public void esMayorDeEdad() {

    }

//Metodo crearPersona(): el método crear persona, le pide 
//los valores de los atributos al usuario y después se le a
//signan a sus respectivos atributos para llenar el 
//objeto Persona. Además, comprueba que el sexo introducido sea 
//correcto, es decir, H, M o O. Si no es correcto se deberá 
//mostrar un mensaje.
    public Persona crearPersona() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ing Nombre: ");
        P.setNombre(leer.nextLine());
        System.out.print("Ing Edad: ");
        P.setEdad(leer.nextInt());
        System.out.print("Ing Peso: ");
        P.setPeso(leer.nextDouble());
        System.out.print("Ing Altura: ");
        P.setAltura(leer.nextDouble());
        //System.out.print("Ing Sexo: ");
        //P.setSexo(leer.next());
        return P;
    }

    /**
     * Método calcularIMC(): calculara si la persona está en su peso ideal (peso
     * en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor
     * que 20, significa que la persona está por debajo de su peso ideal y la
     * función devuelve un -1. Si la fórmula da por resultado un número entre 20
     * y 25 (incluidos), significa que la persona está en su peso ideal y la
     * función devuelve un 0. Finalmente, si el resultado de la fórmula es un
     * valor mayor que 25 significa que la persona tiene sobrepeso, y la función
     * devuelve un 1.
     *
     */
    public double calcularIMC() {
        double imc = P.getPeso() / pow (P.getAltura(),2);
        System.out.println("IMC= " + imc);
        return imc;
    }

    /**
     *
     */
}

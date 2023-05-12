
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3g8;

import Entidades.Persona;
import Servicios.PersonaServicio;

/**
 *
 * @author U
 */
public class Ej3G8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /**
         * A continuación, en la clase main hacer lo siguiente: Crear 4 objetos
         * de tipo Persona con distintos valores, a continuación, llamaremos
         * todos los métodos para cada objeto, deberá comprobar si la persona
         * está en su peso ideal, tiene sobrepeso o está por debajo de su peso
         * ideal e indicar para cada objeto si la persona es mayor de edad. Por
         * último, guardaremos los resultados de los métodos calcularIMC y
         * esMayorDeEdad en distintas variables(arrays), para después calcular
         * un porcentaje de esas 4 personas cuantas están por debajo de su peso,
         * cuantas en su peso ideal y cuantos, por encima, y también
         * calcularemos un porcentaje de cuantos son mayores de edad y cuantos
         * menores. Para esto, podemos crear unos métodos adicionales.
         *
         */
        PersonaServicio PS = new PersonaServicio();
        Persona P[] = new Persona[4];

        for (int j = 0; j < 4; j++) {
            P[j] = PS.crearPersona();
            System.out.println("P1: " + P[j].getNombre() + "IMC= " + PS.calcularIMC());
        }
        
        
//        Persona P2 = PS.crearPersona();
//        System.out.println("P2: " + P2.getNombre());
//        Persona P3 = PS.crearPersona();
//        System.out.println("P3: " + P3.getNombre());

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intgjavaprmdnotascalif;

import entid.Estudiante;

/**
 *
 * @author U
 */
public class IntgJavaPrmdNotasCalif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante[] E1 = new Estudiante[8];
        E1[0] = new Estudiante("Mica", 10);
        E1[1] = new Estudiante("Pedro", 7.5);
        E1[2] = new Estudiante("Carla", 6);
        E1[3] = new Estudiante("Mara", 8.5);
        E1[4] = new Estudiante("Cristina", 9);
        E1[5] = new Estudiante("Ariel", 5.5);
        E1[6] = new Estudiante("Pepa", 9.5);
        E1[7] = new Estudiante("Juan", 7);

        double sumaNotas = 0;
        for (int i = 0; i < E1.length; i++) {
            //Estudiante estudiante = E1[i];

            sumaNotas += E1[i].getNotas();
            System.out.println("SumaNotas= " + sumaNotas);
        }
        double Promedio = sumaNotas / E1.length;
        System.out.println("Promedio= " + Promedio);
        
        int cont = 0;
        String[] nombres = new String[E1.length];
        for (int i = 0; i < E1.length; i++) {
            if (E1[i].getNotas() > Promedio){
                nombres[cont] = E1[i].getNombre();
                cont +=1;
            }
            
        }
        for (int i = 0; i < cont; i++) {
            System.out.println(nombres[i] + " Supera al Promedio");
        }

    }

}

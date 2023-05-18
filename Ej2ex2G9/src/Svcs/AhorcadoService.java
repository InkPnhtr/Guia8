/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Svcs;

import Enti.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author U
 */
public class AhorcadoService {
    Ahorcado A1 = new Ahorcado;
    
    Scanner scanner = new Scanner(System.in);
    public void crearJuego(){
        String pal;
        System.out.print("Ing Palabra: ");
        pal = scanner.next();
        System.out.print("Ing Cant Jug Max: ");
        A1.setJugMax(scanner.nextInt());
        int l = pal.length();
        A1.setL(l);
        for (int j = 0; j<l; j++){
            char ch = pal.charAt(j);
            Arrays.fill(A1.setVecPalab,(ch));
        }
        
    }
    public void longitud(){
        System.out.println("Largo Palabra = " + A1.getL());
    }
    
    public boolean buscar(char x){
        boolean b = false;
        int i=0;
        for (int j = 0; j<A1.getL(); j++){
            if (A1.getVecPalab(j)=x){
                i=i++;
                b = true;}
            return b;
            }
            
        }
        
    }
    
    
}

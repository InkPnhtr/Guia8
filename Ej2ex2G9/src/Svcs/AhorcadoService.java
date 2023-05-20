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
    
    
    Scanner scanner = new Scanner(System.in);
    public Ahorcado crearJuego(){
        Ahorcado Ahorc1 = new Ahorcado();
        String pal;
        System.out.print("Ing Palabra: ");
        pal = scanner.next();
        char[] palVec = new char[pal.length()];
        System.out.print("Ing Cant Jug Max: ");
        Ahorc1.setJugMax(scanner.nextInt());
        int l = pal.length();
        Ahorc1.setL(l);
        for (int j = 0; j<l; j++){
            char ch = pal.charAt(j);
            palVec[j] = ch;
        }
        Ahorc1.setVecPalab(palVec);
        return Ahorc1;
    }
    public void longitud(Ahorcado Ahorc1){
        System.out.println("Largo Palabra = " + Ahorc1.getVecPalab().length);
    }
    
    public void buscar(Ahorcado Ahorc1, char x){
        boolean b = false;
        for (int j = 0; j<Ahorc1.getVecPalab().length ; j++){
            if (Ahorc1.getVecPalab()[j]==x){
                b = true;
                System.out.println("Se Encontro la letra ingresada!!");
                break;
            }
        }
        if (!b){
        System.out.println("No se encontro la letra ingresada");
        }

    }
    public boolean encontradas(Ahorcado Ahorc1, char x){
        boolean b = false;
        int i=0;
        int largoPal = Ahorc1.getVecPalab().length;
        int Econtradas = Ahorc1.getCantLetEnc();
        int faltan = largoPal - Ahorc1.getCantLetEnc();
        for (int j = 0; j<largoPal ; j++){
            if (Ahorc1.getVecPalab()[j]==x){
                i++;
            }
        }
        b = i>0;
        if (b){
        System.out.println("Se incontraron"+ i + "letras");
        faltan -=i;
        Ahorc1.setCantLetEnc(Ahorc1.getCantLetEnc()+i);
       
        }
        else{
            
        }
    return b;

    }
    public int intentos(Ahorcado Ahorc1){
        int x = Ahorc1.getJugMax()-1;
        return x;
        
    }
    
    public void juego(Ahorcado Ahorc1){
        System.out.print("Ing una letra : ");
        char letra = scanner.next().charAt(0);
        crearJuego();
        longitud(Ahorc1);
        buscar(Ahorc1, letra);
        encontradas(Ahorc1, letra);
        intentos(Ahorc1);
    }
    
    
}

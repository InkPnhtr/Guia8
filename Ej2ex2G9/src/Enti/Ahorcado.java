/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enti;

/**
 *
 * @author U
 */
public class Ahorcado {
    private int l;
    private char[] vecPalab = new char[l];
    private int cantLetEnc;
    private int jugMax;

    public Ahorcado() {
    }

    public Ahorcado(int l, int cantLetEnc, int jugMax) {
        this.l = l;
        this.cantLetEnc = cantLetEnc;
        this.jugMax = jugMax;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public char[] getVecPalab() {
        return vecPalab;
    }

    public void setVecPalab(char[] vecPalab) {
        this.vecPalab = vecPalab;
    }

    public int getCantLetEnc() {
        return cantLetEnc;
    }

    public void setCantLetEnc(int cantLetEnc) {
        this.cantLetEnc = cantLetEnc;
    }

    public int getJugMax() {
        return jugMax;
    }

    public void setJugMax(int jugMax) {
        this.jugMax = jugMax;
    }
    
    
    
    
    
    
    
}

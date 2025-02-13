/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.sebastian.intervalos;

/**
 * Proyecto de intervalos de números
 * @author sebastian
 * @since 13/02/2025
 * @version 1.0
 */
public class Intervalos {
    /**
     * Función principal del proyecto
     * @param args no se utiliza
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    
    /**
     * Función tipo String que determinará el intervalo en el que se encuentra un número.
     * @param k recibirá el número
     * @return El intervalo en el que se encuentre ese número (A, B o C).
     */
    public static String ObtenerIntervalo(double k) {
        if (k < -4) {
            final String A = "Intervalo A";
            return A;
        }
        if (k >= -4 && k < 6) {
            return "Intervalo B";
        } else {
            return "Intervalo C";
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.sebastian.intervalos;

/**
 *
 * @author sebastian
 */
public class Intervalos {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
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

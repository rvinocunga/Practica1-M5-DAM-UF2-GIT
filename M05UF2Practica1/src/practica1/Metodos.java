/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author roger
 */
public class Metodos {

    public static void demanar(boolean comprobar, String operacion) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nVols continuar operant? [s/n]");
            do {
                comprobar = true;
                operacion = sc.nextLine();

                switch (operacion) {
                    case "s":
                    case "S":
                    case "n":
                    case "N":
                        break;
                    default:
                        System.err.println("\nError, posa un valor vàlid.");
                        comprobar = false;
                }
            } while (comprobar != true);

    }

}

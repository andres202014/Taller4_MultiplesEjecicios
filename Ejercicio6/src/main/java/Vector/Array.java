/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vector;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Andres Lopez
 */
public class Array {
    
    Scanner teclado = new Scanner(System.in);
    Vector v = new Vector();
    int dato;
    boolean van = true;

    public void LlenarSinRepetir() {
        while (van == true) {
            System.out.println("Digite el dato a insertar");
            System.out.println();
            dato = teclado.nextInt();
            if (v.contains(dato)) {
                System.out.println("El dato ya existe en el vector");
                System.out.println("Tu vector es el siguiente:");
                Mostrar();
                van = false;
            } else {
                v.add(dato);                
            }
        }
    }

    public void Mostrar() {
        for (int i = 0; i < v.size(); i++) {
            System.out.println("[" + v.get(i) + "]");
        }
    }
    
}

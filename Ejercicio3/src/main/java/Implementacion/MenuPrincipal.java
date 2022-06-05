package Implementacion;

import Clases.Array;
import Clases.Datos;
import java.util.Scanner;

/**
 *
 * @author Andres Lopez
 */
public class MenuPrincipal {

    Scanner teclado = new Scanner(System.in);
    Array list = new Array();
    Datos d1 = new Datos();
    Datos d2 = new Datos();
    Datos d3 = new Datos();
    Datos d4 = new Datos();
    Datos d5 = new Datos();
    int op;

    public void Menu() {
        System.out.println("|-----------------------------------------|");
        System.out.println("|1. Ordenar por burbuja                   |");
        System.out.println("|2. Ordenar por QuickSort                 |");
        System.out.println("|0. Salir                                 |");
        System.out.println("|-----------------------------------------|");
        System.out.println("|Digite la opcion que desea               |");
        this.op = teclado.nextInt();

        switch (op) {
            case 1:
                list.Burbuja();
                System.out.println("¡Se ha ordenado mediante el codigo Burbuja!");
                list.Mostrar();
                Menu();
                break;
            case 2:
                list.quicksort(0, 4);
                System.out.println("¡se ha ordenado mediante el codigo Quicksort!");
                list.Mostrar();
                Menu();
                break;
            
            case 3:
                System.exit(0);
                break;
        }
    }

    public void LlenarArray() {
        d1.setNum();
        list.Llenar(0, d1);
        d2.setNum();
        list.Llenar(1, d2);
        d3.setNum();
        list.Llenar(2, d3);
        d4.setNum();
        list.Llenar(3, d4);
        d5.setNum();
        list.Llenar(4, d5);
        
        System.out.println("Este es el Array aleatorio que se ha creado");
        list.Mostrar();
    }
    
    
}

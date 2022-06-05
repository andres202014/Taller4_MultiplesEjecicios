package Clases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Array {

    Scanner teclado = new Scanner(System.in);
    ArrayList<Datos> Numeros = new ArrayList<>();

    public void Llenar(int index, Datos a) {
        Numeros.add(index, a);
    }

    public void Mostrar() {
        for (int i = 0; i < Numeros.size(); i++) {
            Numeros.get(i).Mostrar();
            System.out.println();
        }
    }

    public void Burbuja() {
        Datos aux;
        for (int i = 0; i < Numeros.size() - 1; i++) {
            for (int j = 0; j < Numeros.size() - i - 1; j++) {
                if (Numeros.get(j + 1).getNum() < Numeros.get(j).getNum()) {
                    aux = Numeros.get(j + 1);
                    Numeros.set(j + 1, Numeros.get(j));
                    Numeros.set(j, aux);
                }
            }
        }

    }

    public void quicksort( int izq, int der) {

        float pivote = Numeros.get(izq).num; // tomamos primer elemento como pivote
        int i = izq;         // i realiza la búsqueda de izquierda a derecha
        int j = der;         // j realiza la búsqueda de derecha a izquierda
        float aux;

        while (i < j) {                          // mientras no se crucen las búsquedas                                   
            while (Numeros.get(i).num <= pivote && i < j) {
                i++; // busca elemento mayor que pivote
            }
            while (Numeros.get(j).num > pivote) {
                j--;           // busca elemento menor que pivote
            }
            if (i < j) {                        // si no se han cruzado                      
                aux = Numeros.get(i).num;                      // los intercambia
                Numeros.get(i).num = Numeros.get(j).num;
                Numeros.get(j).num = aux;
            }
        }

        Numeros.get(izq).num = Numeros.get(j).num;      // se coloca el pivote en su lugar de forma que tendremos                                    
        Numeros.get(j).num = pivote;      // los menores a su izquierda y los mayores a su derecha

        if (izq < j - 1) {
            quicksort(izq, j - 1);          // ordenamos subarray izquierdo
        }
        if (j + 1 < der) {
            quicksort(j + 1, der);          // ordenamos subarray derecho
        }
    }
}

package Clases;

import Interfaz.VehiculoInterfaz;

/**
 *
 * @author Andres Lopez
 */
public class Ferry implements VehiculoInterfaz {
    

    
    @Override
    public void Acelerar() {
        System.out.println("El vehiculo esta acelerando");
    }

    @Override
    public void Frenar() {
        System.out.println("El vehiculo esta frenando");
    }

}

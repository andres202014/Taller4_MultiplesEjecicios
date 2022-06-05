package Implementacion;

import Clases.TipoVehiculo;
import Clases.Vehiculo;
import java.util.Scanner;

/**
 *
 * @author Andres Lopez 
 */
public class Implementacion {
    Scanner teclado = new Scanner(System.in);
    Vehiculo v1 = new Vehiculo();
    Vehiculo v2 = new Vehiculo();
    Vehiculo v3 = new Vehiculo();
    Vehiculo v4 = new Vehiculo();
    Vehiculo v5 = new Vehiculo();
    Vehiculo v6 = new Vehiculo();
    Vehiculo v7 = new Vehiculo();
    Vehiculo v8 = new Vehiculo();
    Vehiculo v9 = new Vehiculo();
    Vehiculo v10 = new Vehiculo();
    TipoVehiculo Tipo = new TipoVehiculo();
    int a,b,c,p;
    String d,e;
    public void Menu(){
        
    }
    
    public void CrearVehiculos(){
        
        System.out.println("Digite la matricula del vehiculo 1");
        this.d = teclado.next();
        v1.setFechaMatricula(d);
        System.out.println("Digite el medio por el cual se desplaza");
        this.e = teclado.next();
        v1.setMedioDesplazamiento(e);
        System.out.println("Digite el numero de pasajeros");
        this.a = teclado.nextInt();
        v1.setNumeroPasajeros(a);
        System.out.println("Digite el numero de ruedas");
        this.b = teclado.nextInt();
        v1.setRuedas(b);
        System.out.println("Digite la tripulacion, si es que el vehiculo la requiere");
        this.c = teclado.nextInt();
        v1.setTripulacion(c);
        System.out.println("Digite la cantidad de puertas del Vehiculo");
        this.p = teclado.nextInt();
        v1.setPuertas(p);
        Tipo.EsCarro(v1);
        Tipo.EsBarco(v1);
        Tipo.EsCamion(v1);
        Tipo.EsBicicleta(v1);
        
        System.out.println("Digite la matricula del vehiculo 2");
        this.d = teclado.next();
        v2.setFechaMatricula(d);
        System.out.println("Digite el medio por el cual se desplaza");
        this.e = teclado.next();
        v2.setMedioDesplazamiento(e);
        System.out.println("Digite el numero de pasajeros");
        this.a = teclado.nextInt();
        v2.setNumeroPasajeros(a);
        System.out.println("Digite el numero de ruedas");
        this.b = teclado.nextInt();
        v2.setRuedas(b);
        System.out.println("Digite la tripulacion, si es que el vehiculo la requiere");
        this.c = teclado.nextInt();
        v2.setTripulacion(c);  
        System.out.println("Digite la cantidad de puertas del Vehiculo");
        this.p = teclado.nextInt();
        v2.setPuertas(p);
        Tipo.EsCarro(v2);
        Tipo.EsBarco(v2);
        Tipo.EsCamion(v2);
        Tipo.EsBicicleta(v2);
        
        System.out.println("Digite la matricula del vehiculo 3");
        this.d = teclado.next();
        v3.setFechaMatricula(d);
        System.out.println("Digite el medio por el cual se desplaza");
        this.e = teclado.next();
        v3.setMedioDesplazamiento(e);
        System.out.println("Digite el numero de pasajeros");
        this.a = teclado.nextInt();
        v3.setNumeroPasajeros(a);
        System.out.println("Digite el numero de ruedas");
        this.b = teclado.nextInt();
        v3.setRuedas(b);
        System.out.println("Digite la tripulacion, si es que el vehiculo la requiere");
        this.c = teclado.nextInt();
        v3.setTripulacion(c);
        System.out.println("Digite la cantidad de puertas del Vehiculo");
        this.p = teclado.nextInt();
        v3.setPuertas(p);
        Tipo.EsCarro(v3);
        Tipo.EsBarco(v3);
        Tipo.EsCamion(v3);
        Tipo.EsBicicleta(v3);
        
        /*
        System.out.println("Digite la matricula del vehiculo 4");
        this.d = teclado.next();
        v4.setFechaMatricula(d);
        System.out.println("Digite el medio por el cual se desplaza");
        this.e = teclado.next();
        v4.setMedioDesplazamiento(e);
        System.out.println("Digite el numero de pasajeros");
        this.a = teclado.nextInt();
        v4.setNumeroPasajeros(a);
        System.out.println("Digite el numero de ruedas");
        this.b = teclado.nextInt();
        v4.setRuedas(b);
        System.out.println("Digite la tripulacion, si es que el vehiculo la requiere");
        this.c = teclado.nextInt();
        v4.setTripulacion(c);
        System.out.println("Digite la cantidad de puertas del Vehiculo");
        this.p = teclado.nextInt();
        v4.setPuertas(p);
        Tipo.EsCarro(v4);
        Tipo.EsBarco(v4);
        Tipo.EsCamion(v4);
        Tipo.EsBicicleta(v4);
        
        
        System.out.println("Digite la matricula del vehiculo 5");
        this.d = teclado.next();
        v5.setFechaMatricula(d);
        System.out.println("Digite el medio por el cual se desplaza");
        this.e = teclado.next();
        v5.setMedioDesplazamiento(e);
        System.out.println("Digite el numero de pasajeros");
        this.a = teclado.nextInt();
        v5.setNumeroPasajeros(a);
        System.out.println("Digite el numero de ruedas");
        this.b = teclado.nextInt();
        v5.setRuedas(b);
        System.out.println("Digite la tripulacion, si es que el vehiculo la requiere");
        this.c = teclado.nextInt();
        v5.setTripulacion(c);
        System.out.println("Digite la cantidad de puertas del Vehiculo");
        this.p = teclado.nextInt();
        v5.setPuertas(p);
        Tipo.EsCarro(v5);
        Tipo.EsBarco(v5);
        Tipo.EsCamion(v5);
        Tipo.EsBicicleta(v5);
        
        
        System.out.println("Digite la matricula del vehiculo 6");
        this.d = teclado.next();
        v6.setFechaMatricula(d);
        System.out.println("Digite el medio por el cual se desplaza");
        this.e = teclado.next();
        v6.setMedioDesplazamiento(e);
        System.out.println("Digite el numero de pasajeros");
        this.a = teclado.nextInt();
        v6.setNumeroPasajeros(a);
        System.out.println("Digite el numero de ruedas");
        this.b = teclado.nextInt();
        v6.setRuedas(b);
        System.out.println("Digite la tripulacion, si es que el vehiculo la requiere");
        this.c = teclado.nextInt();
        v6.setTripulacion(c);
        System.out.println("Digite la cantidad de puertas del Vehiculo");
        this.p = teclado.nextInt();
        v6.setPuertas(p);
        Tipo.EsCarro(v6);
        Tipo.EsBarco(v6);
        Tipo.EsCamion(v6);
        Tipo.EsBicicleta(v6);
        
        System.out.println("Digite la matricula del vehiculo 7");
        this.d = teclado.next();
        v7.setFechaMatricula(d);
        System.out.println("Digite el medio por el cual se desplaza");
        this.e = teclado.next();
        v7.setMedioDesplazamiento(e);
        System.out.println("Digite el numero de pasajeros");
        this.a = teclado.nextInt();
        v7.setNumeroPasajeros(a);
        System.out.println("Digite el numero de ruedas");
        this.b = teclado.nextInt();
        v7.setRuedas(b);
        System.out.println("Digite la tripulacion, si es que el vehiculo la requiere");
        this.c = teclado.nextInt();
        v7.setTripulacion(c);
        System.out.println("Digite la cantidad de puertas del Vehiculo");
        this.p = teclado.nextInt();
        v7.setPuertas(p);
        Tipo.EsCarro(v7);
        Tipo.EsBarco(v7);
        Tipo.EsCamion(v7);
        Tipo.EsBicicleta(v7);
        
        System.out.println("Digite la matricula del vehiculo 8");
        this.d = teclado.next();
        v8.setFechaMatricula(d);
        System.out.println("Digite el medio por el cual se desplaza");
        this.e = teclado.next();
        v8.setMedioDesplazamiento(e);
        System.out.println("Digite el numero de pasajeros");
        this.a = teclado.nextInt();
        v8.setNumeroPasajeros(a);
        System.out.println("Digite el numero de ruedas");
        this.b = teclado.nextInt();
        v8.setRuedas(b);
        System.out.println("Digite la tripulacion, si es que el vehiculo la requiere");
        this.c = teclado.nextInt();
        v8.setTripulacion(c);
        System.out.println("Digite la cantidad de puertas del Vehiculo");
        this.p = teclado.nextInt();
        v8.setPuertas(p);
        Tipo.EsCarro(v8);
        Tipo.EsBarco(v8);
        Tipo.EsCamion(v8);
        Tipo.EsBicicleta(v8);
        
        System.out.println("Digite la matricula del vehiculo 9");
        this.d = teclado.next();
        v9.setFechaMatricula(d);
        System.out.println("Digite el medio por el cual se desplaza");
        this.e = teclado.next();
        v9.setMedioDesplazamiento(e);
        System.out.println("Digite el numero de pasajeros");
        this.a = teclado.nextInt();
        v9.setNumeroPasajeros(a);
        System.out.println("Digite el numero de ruedas");
        this.b = teclado.nextInt();
        v9.setRuedas(b);
        System.out.println("Digite la tripulacion, si es que el vehiculo la requiere");
        this.c = teclado.nextInt();
        v9.setTripulacion(c);
        System.out.println("Digite la cantidad de puertas del Vehiculo");
        this.p = teclado.nextInt();
        v9.setPuertas(p);
        Tipo.EsCarro(v9);
        Tipo.EsBarco(v9);
        Tipo.EsCamion(v9);
        Tipo.EsBicicleta(v9);
        
        System.out.println("Digite la matricula del vehiculo 10");
        this.d = teclado.next();
        v10.setFechaMatricula(d);
        System.out.println("Digite el medio por el cual se desplaza");
        this.e = teclado.next();
        v10.setMedioDesplazamiento(e);
        System.out.println("Digite el numero de pasajeros");
        this.a = teclado.nextInt();
        v10.setNumeroPasajeros(a);
        System.out.println("Digite el numero de ruedas");
        this.b = teclado.nextInt();
        v10.setRuedas(b);
        System.out.println("Digite la tripulacion, si es que el vehiculo la requiere");
        this.c = teclado.nextInt();
        v10.setTripulacion(c);
        System.out.println("Digite la cantidad de puertas del Vehiculo");
        this.p = teclado.nextInt();
        v10.setPuertas(p);
        Tipo.EsCarro(v10);
        Tipo.EsBarco(v10);
        Tipo.EsCamion(v10);
        Tipo.EsBicicleta(v10);
*/
    }

    
    public void MostrarVehiculos(){
        System.out.println("A Continuacion una lista de los vehiculos creados");
        System.out.println();
        v1.Mostrar();
        System.out.println();
        v2.Mostrar();
        System.out.println();
        v3.Mostrar();
        System.out.println();
        v4.Mostrar();
        System.out.println();
        v5.Mostrar();
        System.out.println();
        v6.Mostrar();
        System.out.println();
        v7.Mostrar();
        System.out.println();
        v8.Mostrar();
        System.out.println();
        v9.Mostrar();
        System.out.println();
        v10.Mostrar();
        System.out.println();
        
    }
}

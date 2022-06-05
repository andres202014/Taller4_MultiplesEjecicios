package Clases;

/**
 *
 * @author Andres Lopez
 */
public class Vehiculo {
    int numeroPasajeros;
    int Tripulacion;
    int Ruedas;
    int Puertas;
    String fechaMatricula;
    String medioDesplazamiento;

    public int getPuertas() {
        return Puertas;
    }

    public void setPuertas(int Puertas) {
        this.Puertas = Puertas;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public int getTripulacion() {
        return Tripulacion;
    }

    public void setTripulacion(int Tripulacion) {
        this.Tripulacion = Tripulacion;
    }

    public int getRuedas() {
        return Ruedas;
    }

    public void setRuedas(int Ruedas) {
        this.Ruedas = Ruedas;
    }

    public String getFechaMatricula() {
        return fechaMatricula;
    }

    public void setFechaMatricula(String fechaMatricula) {
        this.fechaMatricula = fechaMatricula;
    }

    public String getMedioDesplazamiento() {
        return medioDesplazamiento;
    }

    public void setMedioDesplazamiento(String medioDesplazamiento) {
        this.medioDesplazamiento = medioDesplazamiento;
    }
    
    public void Mostrar(){
        System.out.println("El vehiculo tiene: "+getNumeroPasajeros()+" Numero de pasajeros");
        System.out.println("El vehiculo tiene: "+getTripulacion()+" Tripulantes");
        System.out.println("El vehiculo tiene: "+getRuedas()+" Ruedas");
        System.out.println("La fecha de su matricula es de: "+getFechaMatricula());
        System.out.println("El vehiculo Se desplaza por: "+getNumeroPasajeros());
        System.out.println("El numero de puertas es de: "+getPuertas());
    }
    
}

package SistemaSolar;

/**
 *
 * @author Andres Lopez 
 */
public class Planeta {
    double Masa;
    double Densidad;
    double Diametro;
    double distanciaSol;
    int Id;
    String Nombre;

    public double getMasa() {
        return Masa;
    }

    public void setMasa(double Masa) {
        this.Masa = Masa;
    }

    public double getDensidad() {
        return Densidad;
    }

    public void setDensidad(double Densidad) {
        this.Densidad = Densidad;
    }

    public double getDiametro() {
        return Diametro;
    }

    public void setDiametro(double Diametro) {
        this.Diametro = Diametro;
    }

    public double getDistanciaSol() {
        return distanciaSol;
    }

    public void setDistanciaSol(double distanciaSol) {
        this.distanciaSol = distanciaSol;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void Mostrar() {
        
        System.out.println("La densidad del planeta es: " + getDensidad()+" g/cm^3");
        System.out.println("Su masa es: " + getMasa());
        System.out.println("Tiene un diametro de: " + getDiametro()+" Kms");
        System.out.println("Su distancia del sol es de : " + getDistanciaSol()+" Millones de Kms");
        System.out.println("Su Id es: " + getId());
        System.out.println("Su nombre es: " + getNombre());
        System.out.println();
    }
    
    
}

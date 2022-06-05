package SistemaSolar;
import Interfaz.PlanetaInterfaz;

/**
 *
 * @author Andres Lopez
 */
public class Sistema implements PlanetaInterfaz {

    @Override
    public void AtraccionGravitatoria(Planeta p1,Planeta p2, double Distancia) {
        double g = 6.67* Math.pow(10, -23);
        double FuerzaG = (g*p1.Masa*p2.Masa)/(Math.pow(Distancia,2));
        System.out.println("la Fuerza Gravitacional es de: "+FuerzaG+" Nm^2/Kg^2");
    }
    
    

}

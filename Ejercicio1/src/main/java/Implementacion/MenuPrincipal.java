package Implementacion;
import SistemaSolar.Planeta;
import SistemaSolar.Sistema;
import java.util.Scanner;

/**
 *
 * @author Andres Lopez
 */
public class MenuPrincipal {
    int op;
    Scanner teclado = new Scanner(System.in);
    Planeta p1 = new Planeta();
    Planeta p2 = new Planeta();
    Planeta p3 = new Planeta();
    Planeta p4 = new Planeta();
    Planeta p5 = new Planeta();
    Planeta p6 = new Planeta();
    Planeta p7 = new Planeta();
    Planeta p8 = new Planeta();
    Sistema s = new Sistema();
    public void Menu(){
        System.out.println("|------------------------------------------------|");
        System.out.println("|1. Mostrar Planetas del sistema                 |");
        System.out.println("|2. Cacular Fuerza gravitacional entre 2 planetas|");
        System.out.println("|3. Salir                                        |");
        System.out.println("|------------------------------------------------|");
        System.out.println("Digite la opcion que Desea");
        this.op = teclado.nextInt();
        switch(op){
            case 1:
                p1.Mostrar();
                p2.Mostrar();
                p3.Mostrar();
                p4.Mostrar();
                p5.Mostrar();
                p6.Mostrar();
                p7.Mostrar();
                p8.Mostrar();
                Menu();
                break;
            case 2:
                s.AtraccionGravitatoria(p1, p2, 120);
                
                Menu();
                break;
            case 3:
                System.exit(0);
                break;
        }
    }
    
    public void LlenarPlanetas(){
       
        
        p1.setDensidad(5.43);
        p1.setDiametro(4.879);
        p1.setDistanciaSol(58);
        p1.setId(1);
        p1.setMasa(3.3);
        p1.setNombre("Mercurio");
        
        p2.setDensidad(5.24);
        p2.setDiametro(12.104);
        p2.setDistanciaSol(108);
        p2.setId(2);
        p2.setMasa(48.7);
        p2.setNombre("Venus");
        
        p3.setDensidad(5.51);
        p3.setDiametro(12.742);
        p3.setDistanciaSol(146);
        p3.setId(3);
        p3.setMasa(59.7);
        p3.setNombre("Tierra");
        
        p4.setDensidad(3.93);
        p4.setDiametro(6.779);
        p4.setDistanciaSol(227);
        p4.setId(4);
        p4.setMasa(6.4);
        p4.setNombre("Marte");
    
        p5.setDensidad(1.33);
        p5.setDiametro(139.820);
        p5.setDistanciaSol(778);
        p5.setId(5);
        p5.setMasa(19.000);
        p5.setNombre("Jupiter");
        
        p6.setDensidad(0.68);
        p6.setDiametro(116.460);
        p6.setDistanciaSol(1.429);
        p6.setId(6);
        p6.setMasa(5.688);
        p6.setNombre("Saturno");
        
        p7.setDensidad(1.27);
        p7.setDiametro(50.724);
        p7.setDistanciaSol(2.870);
        p7.setId(7);
        p7.setMasa(868);
        p7.setNombre("Urano");
        
        p8.setDensidad(1.64);
        p8.setDiametro(49.224);
        p8.setDistanciaSol(4.504);
        p8.setId(8);
        p8.setMasa(1024);
        p8.setNombre("Neptuno");
    }
}

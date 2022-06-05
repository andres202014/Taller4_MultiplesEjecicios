package Clases;

/**
 *
 * @author Andres Lopez
 */
public class TipoVehiculo {
    Ferry f = new Ferry();
    
    public void EsCarro(Vehiculo Carro){
        if(Carro.getPuertas() == 3 || Carro.getPuertas() == 5){
            System.out.println("Es un carro");
            f.Acelerar();
            System.out.println();
            f.Frenar();
        }
    }
    
    public void EsBarco(Vehiculo Barco){
        if(Barco.getMedioDesplazamiento().equals("agua")){
            System.out.println("Es un barco");
        }
    }
    
    public void EsMoto(Vehiculo Moto){
        if(Moto.getRuedas()==2){
            System.out.println("Es una moto");
        }
    }
    
    public void EsCamion(Vehiculo Camion){
        if(Camion.getRuedas()>8 && Camion.getRuedas()< 10){
            System.out.println("Es un camion");
            
        }
    }
    
    public void EsBicicleta(Vehiculo Bicicleta){
        if(Bicicleta.getRuedas()==2 && Bicicleta.getNumeroPasajeros()==1){
            System.out.println("Es una bicicleta");
        }
    }
}

package Clases;

/**
 *
 * @author USER
 */
public class Datos {

    float num;
    float ran = Randon();
    public float getNum() {
        return num;
    }

    public void setNum() {
        this.num = ran;
    }

    public void Mostrar() {

        System.out.println(getNum());

    }

    private float Randon() {
        ran = (float) Math.random()*100+1;
        return ran;
    }
    
    

}

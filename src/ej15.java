public class ej15 {

    private String nombre;
    private int min;

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombreEntrada){
        nombre=nombreEntrada;
    }

    public int getMin(){
        return min;
    }
    public void setMin(int minEntrada){
        min=minEntrada;
    }

    public void jugar(int min){
        setMin(getMin()+min);
    }

    public double horasJugadas(){
        return getMin()/60.0;
    }

}

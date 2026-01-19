public class ej11 {

    private int porcentaje;

    public int getPorcentaje(){
        return porcentaje;
    }
    public void setPorcentaje(int porcentajeEntrada){
        porcentaje=porcentajeEntrada;

        if (porcentaje > 100){
            porcentaje=100;
        }
        if (porcentaje < 0){
            porcentaje=0;
        }
    }


    public void usar(int minutos){
        porcentaje -= minutos;

        if (porcentaje < 0){
            porcentaje=0;
        }
    }

    public void cargar(int minutos){
        porcentaje +=minutos;

        if (porcentaje > 100){
            porcentaje=100;
        }
    }

}

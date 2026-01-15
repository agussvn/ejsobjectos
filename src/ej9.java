public class ej9 {

    private String titulo;
    private int reps;

    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String tituloEntrada) {
        titulo = tituloEntrada;
    }

    public int getReps(){
        return reps;
    }
    public void setReps(int repsEntrada) {
        reps = repsEntrada;
    }

    public void reps(){
        reps++;
    }
}

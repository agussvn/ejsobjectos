public class ej7 {
    private String titulo;
    private String autor;
    private int numeroVolumen;
    private boolean leido;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String tituloEntrada) {
        titulo = tituloEntrada;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autorEntrada) {
        autor = autorEntrada;
    }

    public int getNumeroVolumen() {
        return numeroVolumen;
    }
    public void setNumeroVolumen(int numeroVolumenEntrada) {
        numeroVolumen = numeroVolumenEntrada;
    }

    public boolean isLeido() {
        return leido;
    }
    public void setLeido(boolean leidoEntrada) {
        leido = leidoEntrada;
    }
}

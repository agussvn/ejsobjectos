public class ej10 {
    private String equipoLocal;
    private String equipoVisitante;
    private int golesLocal;
    private int golesVisitante;

    public String getEquipoLocal() {
        return equipoLocal;
    }
    public void setEquipoLocal(String equipoLocalEntrada) {
        equipoLocal = equipoLocalEntrada;
    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }
    public void setEquipoVisitante(String equipoVisitanteEntrada) {
        equipoVisitante = equipoVisitanteEntrada;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    // Métodos para marcar goles
    public void golLocal() {
        golesLocal++;
    }

    public void golVisitante() {
        golesVisitante++;
    }


    public String resultado() {
        return golesLocal + " - " + golesVisitante;
    }
}

public class ej16 {

    private String titulo;
    private double precio;
    private boolean estudiante;

    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String tituloEntrada){
        titulo=tituloEntrada;
    }


    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precioEntrada){
        precio=precioEntrada;
    }

    public boolean getEstudiante(){
        return estudiante;
    }
    public void setEstudiante(boolean estudianteEntrada){
        estudiante=estudianteEntrada;
    }

    public double precioFinal(){
        if (estudiante){
            return precio = (precio * 20)/100;
        }
        return 0;
    }


    }


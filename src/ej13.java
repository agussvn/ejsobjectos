public class ej13 {
    private double total;

    public double getTotal(){
        return total;
    }
    public void setTotal(double totalEntrada){
        total=totalEntrada;
    }

    public void Carrito(){
        total=0.0;
    }

    public void añadirProducto(double precio){
        setTotal(getTotal()+precio);
    }

    public void aplicarDescuento(double porcentaje){
        double descuento = getTotal() * porcentaje/100;
        setTotal(getTotal()- descuento);
    }


}

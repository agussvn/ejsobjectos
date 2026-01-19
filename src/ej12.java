public class ej12 {

    private String nombre;
    private int vida;
    private int ataque;

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombreEntrada){
        nombre=nombreEntrada;
    }

    public int getVida(){
        return vida;
    }
    public void setVida(int vidaEntrada){
        vida = vidaEntrada;

        if (vida > 100){
            vida=100;
        }
        if (vida < 0){
            vida=0;
        }
    }

    public int getAtaque(){
        return ataque;
    }
    public void setAtaque(int ataqueEntrada){
        ataque=ataqueEntrada;
    }

    public void recibirHit(int hit){
        vida -= hit;

        if (vida < 0){
            vida=0;
        }
    }

    public void curarse(int cura){
        vida +=cura;

        if (vida >100){
            vida=100;
        }
    }

    public boolean estaVivo(){
        return vida > 0;
    }
}

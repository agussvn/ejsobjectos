public class ej14 {

    private String titulo;
    private int likes;
    private int dislikes;




    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String tituloEntrada){
        titulo=tituloEntrada;
    }

    public int getLikes() {
        return likes;

    }
    public void setLikes(int likesEntrada) {
        likes = likesEntrada;
    }

    public int getDislikes() {
        return dislikes;
    }
    public void setDislikes(int dislikesEntrada) {
        dislikes = dislikesEntrada;
    }

    public void darLike(){
        setLikes(getLikes()+1);
    }

    public void darDislike(){
        setDislikes(getDislikes()+1);
    }

    public int getFinal(){
        return getLikes()-getDislikes();

    }
}

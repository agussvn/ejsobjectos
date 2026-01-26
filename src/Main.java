public class Main {
    public static void main(String[] args) {
/// //////--------------------------------EJ1---------------------------------
        ej1 cancion1 = new ej1();
        ej1 cancion2 = new ej1();

        cancion1.setTitulo("Bohemian Rhapsody");
        cancion1.setArtista("Freddy Mercury");
        cancion1.setDuracion(2);

        cancion2.setTitulo("Murder");
        cancion2.setArtista("Duki");
        cancion2.setDuracion(3);
        System.out.println("\n\n--EJ1--");

        System.out.println("El nombre de la cancion 1 es: " + cancion1.getTitulo());
        System.out.println("Cantada por el gran: " + cancion1.getArtista());
        System.out.println("Tiene una duración de: " + cancion1.getDuracion() + "min");

        System.out.println("\nEl nombre de la cancion 2 es: " + cancion2.getTitulo());
        System.out.println("Cantada por el gran: " + cancion2.getArtista());
        System.out.println("Tiene una duración de: " + cancion2.getDuracion() + "min");

        cancion1.setDuracion(5);

        System.out.println();
        System.out.println("Nueva duración de" + cancion1.getTitulo() + " : " + cancion1.getDuracion());

        System.out.println();

        if (cancion1.getDuracion() > cancion2.getDuracion()) {
            System.out.println(cancion1.getTitulo() + " tiene una duración mayor");
        } else if (cancion2.getDuracion() > cancion1.getDuracion()) {
            System.out.println(cancion2.getTitulo() + " tiene una duración mayor");
        }
        System.out.println("---------------");
        /// --------------------------EJ2--------------------------

        ej2 pelicula1 = new ej2();

        pelicula1.setTitulo("Cumback");
        pelicula1.setArtista("Pedro Sánchez");
        pelicula1.setEstreno(2067);
        pelicula1.setMin(67);
        System.out.println("\n\n\n\n--EJ2--");

        System.out.println("-----------CARTELERA-----------");
        System.out.println(pelicula1.getTitulo() + " es la película más esperada de la historia, con el famoso artista "
                + pelicula1.getArtista() + ". " + "Se estrena en " + pelicula1.getEstreno() + " y tendrá una duración de " + pelicula1.getMin() + " minutos.");

        pelicula1.setArtista(pelicula1.getArtista().toUpperCase());
        System.out.println("\n Director Principal-Dr " + pelicula1.getArtista());

        System.out.println("-------------------------------");

        /// ----------------------EJ3---------------------------

        ej3 yt1 = new ej3();
        ej3 yt2 = new ej3();
        ej3 yt3 = new ej3();

        yt1.setCanal("Lolito");
        yt1.setCategoria("Fortnite");
        yt1.setSubs(8);

        yt2.setCanal("Vegeta");
        yt2.setCategoria("Minecraft");
        yt2.setSubs(40);

        yt3.setCanal("Tfue");
        yt3.setCategoria("Pesca");
        yt3.setSubs(12);

        System.out.println("\n\n--EJ3--");
        System.out.println("YOUTUBE");
        System.out.println(yt1.getCanal() + " sube contenido relacionado con "
                + yt1.getCategoria() + " y además tiene " + yt1.getSubs() + " millones de subscriptores.");
        System.out.println(yt2.getCanal() + " sube contenido relacionado con "
                + yt2.getCategoria() + " y además tiene " + yt2.getSubs() + " millones de subscriptores.");
        System.out.println(yt3.getCanal() + " sube contenido relacionado con "
                + yt3.getCategoria() + " y además tiene " + yt3.getSubs() + " millones de subscriptores.");
        System.out.println("");

        yt2.setSubs(45);
        System.out.println(yt2.getCanal() + " esta cada vez más cerca de 50m al subir a " + yt2.getSubs() + " millones de subs.");
        System.out.println("----------");

/// //-------------------------EJ4--------------------------

        ej4 jugador = new ej4();

        jugador.setNombre("CR7");
        jugador.setEquipo("Real Madrid");
        jugador.setPosicion("Delantero");
        jugador.setDorsal(7);

        System.out.println("\n\n ----EJ4---");
        System.out.println("Fútbol");
        System.out.println("El gran " + jugador.getNombre()
                + " con el número " + jugador.getDorsal() + " en la espalda," + "es "
                + jugador.getPosicion() + " y juega en el " + jugador.getEquipo() + ".");

        System.out.println("---Cambio equipo y dorsal---");
        jugador.setDorsal(9);
        jugador.setEquipo("Al-Nassr");
        System.out.println(jugador.getNombre() + "se ha cambiado al " + jugador.getEquipo() + " y su nuevo número es " + jugador.getDorsal() + ".");
        System.out.println("---------------------");


//-----------------EJ5-------------------------
        System.out.println("\n\n--EJ5--");

        ej5 skin1 = new ej5();
        ej5 skin2 = new ej5();

        skin1.setNombre("Cuervo");
        skin1.setPrecio(2000);
        skin1.setRareza("Legendaria");
        skin1.setVideojuego("Fortnite");

        skin2.setNombre("Reaver");
        skin2.setPrecio(1750);
        skin2.setRareza("Rojo");
        skin2.setVideojuego("Valorant");

        System.out.println("(Skin) = " + skin1.getNombre() + " , (Rareza) = "
                + skin1.getRareza() + " , (Videojuego) = " + skin1.getVideojuego() + " , (Precio) = " + skin1.getPrecio());

        System.out.println("(Skin) = " + skin2.getNombre() + " , (Rareza) = "
                + skin2.getRareza() + " , (Videojuego) = " + skin2.getVideojuego() + " , (Precio) = " + skin2.getPrecio());

        System.out.println("\nCambio de precio y rareza");
        skin1.setPrecio(10000);
        skin1.setRareza("Exclusiva");
        System.out.println("(Precio nuevo) = " + skin1.getPrecio() + " (Rareza nueva) = " + skin1.getRareza());
        System.out.println("-------------------------------");

        //----------------EJ6--------------------
        System.out.println("\n\n--POKEMON-EJ6--");

        ej6 pokemon1 = new ej6();

        pokemon1.setNombre("Charmander");
        pokemon1.setTipo("Fuego");
        pokemon1.setNivel(5);
        pokemon1.setVida(100);

        System.out.println("(Nombre) = " + pokemon1.getNombre() +
                " , (Tipo) = " + pokemon1.getTipo() +
                " , (Nivel) = " + pokemon1.getNivel() +
                " , (Vida) = " + pokemon1.getVida());

        System.out.println("\nCambio de nivel y vida");
        pokemon1.setNivel(10);
        pokemon1.setVida(80);

        System.out.println("(Nivel nuevo) = " + pokemon1.getNivel() +
                " , (Vida nueva) = " + pokemon1.getVida());

        System.out.println("-------------------------------");

        //----------------EJ7------------------------

        System.out.println("\n\n--MANGA--");

        ej7 manga1 = new ej7();

        manga1.setTitulo("Attack on Titan");
        manga1.setAutor("Hajime Isayama");
        manga1.setNumeroVolumen(1);
        manga1.setLeido(false);

        System.out.println("(Título) = " + manga1.getTitulo() +
                " , (Autor) = " + manga1.getAutor() +
                " , (Volumen) = " + manga1.getNumeroVolumen() +
                " , (Leído) = " + manga1.isLeido());

        System.out.println("\nMarcando manga como leído...");
        manga1.setLeido(true);

        System.out.println("(Leído ahora) = " + manga1.isLeido());
        System.out.println("-------------------------------");

        //----------------------EJ8------------------------

        System.out.println("\n\n--EQUIPO ESPORTS--");

        ej8 equipo1 = new ej8();

        equipo1.setNombre("G2 Esports");
        equipo1.setJuego("League of Legends");
        equipo1.setPais("España");
        equipo1.setRankingMundial(5);

        System.out.println("(Equipo) = " + equipo1.getNombre() +
                " , (Juego) = " + equipo1.getJuego() +
                " , (País) = " + equipo1.getPais() +
                " , (Ranking) = " + equipo1.getRankingMundial());

        System.out.println("\nCambio de ranking mundial...");
        equipo1.setRankingMundial(2);

        System.out.println("(Ranking nuevo) = " + equipo1.getRankingMundial());
        System.out.println("-------------------------------");

        //---------------------EJ9--------------------

        System.out.println("\n\n--CANCION STATS-EJ9--");
        ej9 cancion = new ej9();

        cancion.setTitulo("HOLA");
        cancion.setReps(0);

        for (int i = 0; i < 5; i++) {
            cancion.reps();
        }

        System.out.println("(Canción) = " + cancion.getTitulo() +
                " , (Reproducciones totales) = " + cancion.getReps());

        System.out.println("-------------------------------");

        //--------------------------EJ10---------------------------

        System.out.println("\n\n--PARTIDO--");

        ej10 partido1 = new ej10();

        partido1.setEquipoLocal("Barcelona");
        partido1.setEquipoVisitante("Real Madrid");


        partido1.golLocal();
        partido1.golVisitante();
        partido1.golLocal();
        partido1.golLocal();

        System.out.println("(Equipo Local) = " + partido1.getEquipoLocal());
        System.out.println("(Equipo Visitante) = " + partido1.getEquipoVisitante());
        System.out.println("(Resultado Final) = " + partido1.resultado());

        System.out.println("-------------------------------");


        //---------------------------EJ11---------------------------------

        System.out.println("\n\n--EJ11--");

        ej11 bateria = new ej11();
        bateria.setPorcentaje(60);

        System.out.println("Usted tiene " + bateria.getPorcentaje() + " de batería.");

        System.out.println("\n Jugando...");
        bateria.usar(40);
        System.out.println("Batería restante = " + bateria.getPorcentaje() + "%");

        System.out.println("\n Cargando...");
        bateria.cargar(20);
        System.out.println("Se ha restaurado hasta " + bateria.getPorcentaje() + " % de batería.");

        System.out.println("---------------------");

        //---------------------EJ12-------------------------
        System.out.println("\n\n--EJ12--");
        System.out.println(" BATALLA FORTNITE");

        ej12 tu = new ej12();
        tu.setNombre("neiragus");
        tu.setAtaque(80);
        tu.setVida(100);

        ej12 opp = new ej12();
        opp.setNombre("Tfue");
        opp.setVida(100);
        opp.setAtaque(33);

        System.out.println("\n El jugador " + tu.getNombre() + " tiene " + tu.getVida() + " puntos de vida.");
        System.out.println(" El jugador " + opp.getNombre() + " tiene " + opp.getVida() + " puntos de vida.");

        System.out.println("\n Primer PVP");
        opp.recibirHit(tu.getAtaque());
        System.out.println(tu.getNombre() + " acaba de quitar "
                + tu.getAtaque() + " puntos de vida a " + opp.getNombre() + "." + opp.getNombre() + " se queda a " + opp.getVida());

        tu.recibirHit(opp.getAtaque());
        System.out.println("Recibes " + opp.getAtaque() + " de daño " + "de " + opp.getNombre() + "." + " Te quedas a " + tu.getVida());

        System.out.println("\n--Ronda 2: Héroe se cura--");
        tu.curarse(10);
        System.out.println(tu.getNombre() + " se cura 10 puntos. Vida = " + tu.getVida());

        System.out.println("\n--Estado final--");
        System.out.println(tu.getNombre() + " está vivo? " + tu.estaVivo());
        System.out.println(opp.getNombre() + " está vivo? " + opp.estaVivo());
        System.out.println("-------------------------------");

        //------------------------EJ13-------------------------

        System.out.println("\n\n--EJ13--");

        ej13 carrito1 = new ej13();

        carrito1.añadirProducto(50.0);
        carrito1.añadirProducto(20.0);
        carrito1.añadirProducto(17.0);

        System.out.println("Sin descuento = " + carrito1.getTotal());

        carrito1.aplicarDescuento(20);

        System.out.println("Total después del 10% de descuento = $" + carrito1.getTotal());
        System.out.println("-----------------------");


        //------------------------EJ14---------------------------------

        System.out.println("\n\n--EJ14--");
        System.out.println("-POPULARIDAD");

        ej14 pop = new ej14();
        pop.setTitulo("Sahur");
        pop.setLikes(8);
        pop.setDislikes(4);

        System.out.println(pop.getTitulo() + " tiene " + pop.getLikes() + " likes y " + pop.getDislikes() + " dislikes.");
        System.out.println("Veremos si aumenta y la popularidad mañana");

        pop.darLike();
        pop.darLike();
        pop.darLike();
        pop.darDislike();
        pop.darDislike();


        System.out.println(pop.getTitulo() + " tiene una popularidad de " + pop.getFinal());
        System.out.println("-------------------");


        //-------------------------------EJ15------------------------------

        System.out.println("\n\n--EJ15--");
        System.out.println("-JUEGO-");

        ej15 game = new ej15();
        game.setNombre("Fortnite");

        System.out.println("Veamos cuanto as jugado a " + game.getNombre() + " :");

        game.jugar(40);
        game.jugar(30);
        game.jugar(30);

        System.out.println("Ayer jugado un total de " + game.horasJugadas() + " horas.");
        System.out.println("Lo que supondría un total de " + game.getMin() + " minutos.");

        game.jugar(15);
        game.jugar(30);

        System.out.println("Con lo de hoy y ayer has jugado "
                + game.getMin() + " minutos y " + game.horasJugadas() + " horas " + "a " + game.getNombre() + ".");

        System.out.println("------------------------");

        //------------------------------EJ16------------------------------------

        System.out.println("\n\n--EJ16--");
        System.out.println("-CINE-");

        ej16 e1 = new ej16();
        e1.setTitulo("Interstellar");
        e1.setPrecio(10);
        e1.setEstudiante(true);

        ej16 e2 = new ej16();
        e2.setTitulo("Matrix");
        e2.setPrecio(12);
        e2.setEstudiante(false);

        System.out.println(e1.getTitulo() + " -> " + e1.precioFinal() + "€");
        System.out.println(e2.getTitulo() + " -> " + e2.precioFinal() + "€");
        System.out.println("--------------------");


    }
}


























package platzi.play.contenido;

public class Pelicula extends Contenido {
    public Pelicula(String titulo, int duracion, Genero genero, double calificaion) {
        super(titulo, duracion, genero, calificaion);
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo la pelicula: " + getTitulo());
    }
}

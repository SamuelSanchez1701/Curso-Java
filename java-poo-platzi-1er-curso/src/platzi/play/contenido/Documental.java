package platzi.play.contenido;

public class Documental extends Contenido implements Promocionable{
    private String narrador;

    public Documental(String titulo, int duracion, Genero genero) {
        super(titulo, duracion, genero);
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo el documental: " + getTitulo() + " narrado por: " + getNarrador());
    }

    public Documental(String titulo, int duracion, Genero genero, double calificaion, String narrador) {
        super(titulo, duracion, genero, calificaion);
        this.narrador = narrador;
    }

    @Override
    public String promocionar() {
        return "Descubre el documental: " + getTitulo() + " narrado por " + getNarrador() + "¡Ahora en Platzi Play!";
    }

    public String getNarrador(){
        return narrador;
    }

}

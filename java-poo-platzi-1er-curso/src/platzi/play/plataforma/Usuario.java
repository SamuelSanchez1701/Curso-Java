package platzi.play.plataforma;

import platzi.play.contenido.Contenido;

import java.time.LocalDateTime;

public class usuario {
    public String nombre;
    public String email;
    public LocalDateTime fechaRegistro;

    public usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public void ver(Contenido pelicula){
        System.out.println(nombre + " esta viendo... ");
        pelicula.reproducir();
    }
}

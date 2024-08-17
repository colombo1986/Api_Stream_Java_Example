package api.stream.ejemplos;

import api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamMapFilterSingle2 {
    public static void main(String[] args) {
        Usuario usuario = Stream.of("Pato Guzman 1", "Carlos Perez 2", "Pato Natales 3", "Luisa Acevedo 4")
                .map(nombre ->{
                    String[] partes = nombre.split(" ");
                    return new Usuario(partes[0], partes[1], Integer.parseInt(partes[2]));
                })
                .peek(System.out::println)
                .filter(u -> u.getId().equals(3))
                .findFirst().get() ;





        System.out.println(usuario);
    }
}

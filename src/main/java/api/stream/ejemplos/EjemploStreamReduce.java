package api.stream.ejemplos;

import api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamDisctinct {
    public static void main(String[] args) {
     Stream<String> nombres = Stream.of("Pato Guzman", "Carlos Perez", "Pato Natales", "Luisa Acevedo" ,"Pato Guzman")
                .distinct() ;
     
     nombres.forEach(System.out::println);



    }
}

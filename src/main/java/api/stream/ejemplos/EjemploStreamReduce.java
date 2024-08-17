package api.stream.ejemplos;
import java.util.stream.Stream;

class EjemploStreamDisctinct {
    public static void main(String[] args) {
     Stream<String> nombres = Stream.of("Pato Guzman",
                     "Carlos Perez",
                     "Pato Natales",
                     "Luisa Acevedo",
                     "Pato Guzman")
                .distinct() ;
     
     nombres.forEach(System.out::println);



    }
}

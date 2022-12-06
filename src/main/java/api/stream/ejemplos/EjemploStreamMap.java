package api.stream.ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStream {
    public static void main(String[] args) {

       Stream<String> nombres = Stream.of("Pato" , "Carlo" , "Maria" , "Luisa") ;
       nombres.forEach(System.out::println);

       String[] arr = {"Pato" , "Carlo" , "Maria" , "Luisa"} ;
       Stream<String> nombres2 = Arrays.stream(arr) ;
       nombres2.forEach(System.out::println);

       Stream<String> nombres3 = Stream.<String>builder().add("Pato").add("Pepa").add("Pia").build() ;
       nombres3.forEach(System.out::println) ; 
       
       List<String> lista = new ArrayList<>() ;
       lista.add("Pepe");
       lista.add("Pepa") ;
       lista.add("Maria") ;

       Stream<String> nombres4 = lista.stream();
       nombres4.forEach(System.out::println);
       lista.stream().forEach(System.out::println);

    }
}
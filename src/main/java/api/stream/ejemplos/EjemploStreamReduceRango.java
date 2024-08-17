package api.stream.ejemplos;

import java.util.stream.Stream;

class EjemploStreamReduceEnteros {
    public static void main(String[] args) {
     Stream<Integer> enteros = Stream.of(5 , 10 , 15 , 20)
                .distinct() ;
     
     Integer resultado = enteros.reduce(0, (a , b) ->a+ b) ;
        System.out.println("resultado = " + resultado);



    }
}

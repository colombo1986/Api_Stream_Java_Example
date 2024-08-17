package api.stream.ejemplos;

import api.stream.ejemplos.models.Usuario;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStreamMapFilterAnyMatch {
    public static void main(String[] args) {
        boolean existe = Stream.of("Pato Guzman", "Carlos Perez", "Pato Natales", "Luisa Acevedo")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                //.peek(System.out::println)
                .anyMatch(u -> u.getId().equals(9)) ;

        System.out.println(existe);

        List<Usuario> lista = Arrays.asList(new Usuario("Pato" ,"Guzman"),
                                              new Usuario("Carlos" ,"Perez"),
                                                 new Usuario("Pato"," Natales") ,
                                                  new Usuario(  "Luisa" ,"Acevedo")) ;

        boolean resultado = false ;
        for(Usuario u:lista){
            if(u.getId().equals(3)){
                resultado = true ;
                break ;
            }
        }

        System.out.println(resultado);

    }
}

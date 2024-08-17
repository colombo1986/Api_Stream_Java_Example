package api.stream.ejemplos;

import api.stream.ejemplos.models.Usuario;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStreamMapFilterAnyMatch {
    public static void main(String[] args) {
        boolean existe = Stream.of("Pato Guzman 1", "Carlos Perez 2", "Pato Natales 3", "Luisa Acevedo 4")
                .map(nombre ->{
                    String[] partes = nombre.split(" ");
                    return new Usuario(partes[0], partes[1], Integer.parseInt(partes[2]));
                        })
                        .anyMatch(u->u.getId()==1);

        System.out.println(existe);

        List<Usuario> lista = Arrays.asList(new Usuario("Pato" ,"Guzman", 1),
                                              new Usuario("Carlos" ,"Perez", 2),
                                                 new Usuario("Pato"," Natales", 3) ,
                                                  new Usuario("Luisa" ,"Acevedo", 4)) ;

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

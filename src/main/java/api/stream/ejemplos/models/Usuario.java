package api.stream.ejemplos.models;

public class Usuario {

    String nombre;
    String apellido;
    Integer id;

    public Usuario(String nombre, String apellido ) {
        this.nombre = nombre;
        this.apellido = apellido;

    }

    public Usuario() {
    }

    public Usuario(String nombre,String apellido, Integer id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;

    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "apellido='" + apellido + '\'' +
                ", nombre='" + nombre + '\'' +
                ", id=" + id +
                '}';
    }
}

public class Usuario {

    private String id;
    private String nombre;
    private String apellido;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Usuario(String id, String nombre, String apellido) {
        setId(id);
        setNombre(nombre);
        setApellido(apellido);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

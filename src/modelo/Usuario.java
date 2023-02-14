package modelo;

public class Usuario {
    private int id;
    private int existencia;
    private String nombre;
    private String apellido;
    private String celular;
    private String correo;

    public Usuario() {
    }

    public Usuario(int id, int existencia, String nombre, String apellido, String celular, String correo) {
        this.id = id;
        this.existencia = existencia;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.correo = correo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}

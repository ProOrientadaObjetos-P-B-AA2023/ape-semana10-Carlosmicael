package paquete02;
public class Persona{
    private String nombre;
    private String apellido;
    private String userName;
    public Persona() {}
    public Persona(String nombre, String apellido, String userName) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.userName = userName;
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
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
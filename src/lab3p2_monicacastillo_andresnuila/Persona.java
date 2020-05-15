package lab3p2_monicacastillo_andresnuila;

import java.util.Date;

public class Persona {

    private String username;
    private int ID;
    private String contraseña;
    private String correo;
    private String nombre;
    private Date nacimiento;

    public Persona() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    @Override
    public String toString() {
        return ", nombre=" + nombre + "username=" + username + ", ID=" + ID + ", contrase\u00f1a=" + contraseña + ", correo=" + correo + ", nacimiento=" + nacimiento;
    }

}

package lab3p2_monicacastillo_andresnuila;

import java.util.Date;

public class Persona {

    protected String username;
    protected int ID;
    protected String contraseña;
    protected String correo;
    protected String nombre;
    protected Date nacimiento;

    public Persona() {
    }

    public Persona(String username, int ID, String contraseña, String correo, String nombre, Date nacimiento) {
        this.username = username;
        this.ID = ID;
        this.contraseña = contraseña;
        this.correo = correo;
        this.nombre = nombre;
        this.nacimiento = nacimiento;
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
        return "Nombre=" + nombre + "\n-username=" + username + ", ID=" + ID + ", contraseña=" + contraseña + ", correo=" + correo + ", nacimiento=" + nacimiento;
    }

}

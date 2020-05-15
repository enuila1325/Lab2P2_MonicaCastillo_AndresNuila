package lab3p2_monicacastillo_andresnuila;

import java.util.ArrayList;

public class Local {

    private String nombre;
    private ArrayList<Empleado> empleados = new ArrayList();
    private ArrayList<Producto> productos = new ArrayList();
    private Empleado jefe;

    public Local() {
    }

    public Local(String nombre, Empleado jefe) {
        this.nombre = nombre;
        this.jefe = jefe;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public Empleado getJefe() {
        return jefe;
    }

    public void setJefe(Empleado jefe) {
        this.jefe = jefe;
    }

    @Override
    public String toString() {
        return "NOMBRE DEL LOCAL=" + nombre + ", empleados=" + empleados + ", productos=" + productos + ", jefe=" + jefe;
    }

}

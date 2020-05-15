package lab3p2_monicacastillo_andresnuila;

import java.util.ArrayList;

public class Tienda extends Local {

    public Tienda() {
    }

    public Tienda(String nombre, Empleado jefe) {
        super(nombre, jefe);
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
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
        return super.toString();
    }

    
}

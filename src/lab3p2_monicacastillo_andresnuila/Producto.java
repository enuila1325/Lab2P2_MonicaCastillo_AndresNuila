package lab3p2_monicacastillo_andresnuila;

public class Producto {

    protected String nombre;
    protected double precio;
    protected String descripcion;

    public Producto() {
    }

    public Producto(String nombre, double precio, String descripcion) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Producto ->\n" + "nombre=" + nombre + ", precio=" + precio + ", descripcion=" + descripcion;
    }
    
    
}

package lab3p2_monicacastillo_andresnuila;

public class Juguete extends Producto{

    public Juguete() {
    }

    public Juguete(String nombre, double precio, String descripcion, int cantidad) {
        super(nombre, precio, descripcion, cantidad);
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
        return super.toString();
    }
    
    
}

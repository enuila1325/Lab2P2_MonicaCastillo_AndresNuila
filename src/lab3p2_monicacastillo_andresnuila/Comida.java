package lab3p2_monicacastillo_andresnuila;

import java.util.Date;

public class Comida extends Producto {

    private String tipo;
    private Date vencimiento;

    public Comida() {
    }

    public Comida(String tipo, Date vencimiento, String nombre, double precio, String descripcion) {
        super(nombre, precio, descripcion);
        this.tipo = tipo;
        this.vencimiento = vencimiento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Date vencimiento) {
        this.vencimiento = vencimiento;
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
        return super.toString() + "tipo=" + tipo + ", vencimiento=" + vencimiento + '}';
    }

}

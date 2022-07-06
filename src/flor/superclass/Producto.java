package flor.superclass;

public abstract class Producto {
    protected String nombre;
    protected String categoria;
    protected double precioDeLista;
    protected int cantidad;

    public abstract double obtenerPrecioFinal();
    public abstract int getCantidad();
    public abstract String getNombre();
    public abstract double getPrecioDeLista();
}

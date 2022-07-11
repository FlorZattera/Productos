package flor.superclass;

public abstract class Producto {
    protected String nombre;
    protected String categoria;
    protected double precioDeLista;

    public abstract double obtenerPrecioFinal();
    public abstract String getNombre();
    public abstract double getPrecioDeLista();
    public abstract String getCategoria();
}

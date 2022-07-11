package flor.subclass;

import flor.superclass.Producto;

public class Herramientas extends Producto {
    private final double DESCUENTO = 0.05;
    private String metodoPago;

    public Herramientas(String metodoPago, String nombre, double precioDeLista) {
        this.metodoPago = metodoPago;
        this.nombre = nombre;
        this.precioDeLista = precioDeLista;
        this.categoria = "Herramientas";
    }

    @Override
    public double obtenerPrecioFinal() {
        double precio = precioDeLista;
        if (metodoPago.equals("Tarjeta de Credito")) {
            precio = precioDeLista - (precioDeLista * DESCUENTO);
        }
        return precio;
    }

    @Override
    public String getCategoria() {
        return categoria;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double getPrecioDeLista() {
        return precioDeLista;
    }
}

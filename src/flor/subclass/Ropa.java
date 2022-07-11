package flor.subclass;

import flor.superclass.Producto;

public class Ropa extends Producto {
    private final double DESCUENTO = 0.15;
    private String tipoRopa;

    public Ropa(String tipoRopa, String nombre, double precioDeLista) {
        this.tipoRopa = tipoRopa;
        this.nombre = nombre;
        this.precioDeLista = precioDeLista;
        this.categoria = "Ropa";
    }

    @Override
    public double obtenerPrecioFinal() {
        double precio = precioDeLista;
        if (tipoRopa == "Mujer" || tipoRopa == "Niño") {
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
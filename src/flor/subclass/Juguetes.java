package flor.subclass;

import flor.superclass.Producto;

public class Juguetes extends Producto {
    private final double DESCUENTO = 0.25;

    public Juguetes(int cantidad, String nombre, double precioDeLista) {
        this.categoria = "Juguetes";
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.precioDeLista = precioDeLista;
    }

    @Override
    public double obtenerPrecioFinal() {
        double precio = precioDeLista;
        if (cantidad > 3) {
            precio = precioDeLista - (precioDeLista * DESCUENTO);
        } else if (precioDeLista > 3000) {
            precio = precioDeLista - (precioDeLista * DESCUENTO);
        }
        return precio;
    }

    @Override
    public int getCantidad() {
        return cantidad;
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
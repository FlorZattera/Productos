package flor;

import flor.subclass.Alimentos;
import flor.subclass.Herramientas;
import flor.subclass.Juguetes;
import flor.subclass.Ropa;
import flor.superclass.Producto;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Producto> listaCompra = new ArrayList<>();

        listaCompra.add(new Alimentos("Arroz", 100, "Martes", 2));
        listaCompra.add(new Alimentos("Aceite", 600, "Viernes", 3));
        listaCompra.add(new Alimentos("Zanahoria", 23, "Domingo", 1));

        listaCompra.add(new Juguetes(1, "Buzz Lightyear", 680));
        listaCompra.add(new Juguetes(5, "Autito", 125));
        listaCompra.add(new Juguetes(2, "Casa de Barbies", 8500));

        listaCompra.add(new Ropa("Niño", "Buzo", 6000, 7));
        listaCompra.add(new Ropa("Mujer", "Remera", 1700, 1));
        listaCompra.add(new Ropa("Hombre", "Campera", 12000, 4));

        listaCompra.add(new Herramientas("Tarjeta de Credito", "Martillo", 560, 1));
        listaCompra.add(new Herramientas("Tarjeta de Debito", "Moladora", 2200, 2));
        listaCompra.add(new Herramientas("Efectivo", "Clavo", 50, 4));

        int sumaProductos = 0;
        double precioFinalNoDesc = 0;
        double precioFinalDesc = 0;

        for (int i = 0; i < listaCompra.size(); i++) {
            sumaProductos += listaCompra.get(i).getCantidad();
            //en esta variable vamos a ir almacenando la cantidad total de productos
            precioFinalNoDesc += listaCompra.get(i).getPrecioDeLista();
            //en esta variable vamos a ir almacenando el precio total no descontado
            precioFinalDesc += listaCompra.get(i).obtenerPrecioFinal();
            //en esta variable vamos a ir almacenando el precio total descontado

            System.out.println("Precio descontado de: " + listaCompra.get(i).getNombre() + " es $" + listaCompra.get(i).obtenerPrecioFinal() + ", precio de lista: $" + listaCompra.get(i).getPrecioDeLista() + ".");
            //mostramos producto, precio descontado (si aplica), precio de lista
            System.out.println(listaCompra.get(i).getCantidad() + " x " + listaCompra.get(i).obtenerPrecioFinal() + " = $" + (listaCompra.get(i).getCantidad() * listaCompra.get(i).obtenerPrecioFinal()));
            //mostramos el precio que va a pagar (si aplica, descuento) por la cantidad de productos iguales (ej. 5 autitos)
        }
        System.out.println("Cantidad de productos: " + sumaProductos + ".");
        System.out.println("Precio total descontado: $" + precioFinalDesc + ".");
        System.out.println("Precio total de lista: $" + precioFinalNoDesc + ".");
    }
}

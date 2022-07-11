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
        Alimentos arroz = new Alimentos("Arroz", 100, "Martes");
        Alimentos aceite = new Alimentos("Aceite", 600, "Viernes");
        Alimentos zanahoria = new Alimentos("Zanahoria", 23, "Domingo");

        Juguetes buzz = new Juguetes("Buzz Lightyear", 680);
        Juguetes auto = new Juguetes("Autito", 125);
        Juguetes casa = new Juguetes("Casa de Barbies", 8500);

        Ropa buzo = new Ropa("Niño", "Buzo", 6000);
        Ropa remera = new Ropa("Mujer", "Remera", 1700);
        Ropa campera = new Ropa("Hombre", "Campera", 12000);

        Herramientas martillo = new Herramientas("Tarjeta de Credito", "Martillo", 560);
        Herramientas moladora = new Herramientas("Tarjeta de Debito", "Moladora", 2200);
        Herramientas clavo = new Herramientas("Efectivo", "Clavo", 50);

        Factura facturaABCABC = new Factura();
        facturaABCABC.agregarItem(5, arroz);
        facturaABCABC.agregarItem(1, aceite);
        facturaABCABC.agregarItem(4, zanahoria);
        facturaABCABC.agregarItem(1, buzz);
        facturaABCABC.agregarItem(9, auto);
        facturaABCABC.agregarItem(1, casa);
        facturaABCABC.agregarItem(6, buzo);
        facturaABCABC.agregarItem(4, remera);
        facturaABCABC.agregarItem(1, campera);
        facturaABCABC.agregarItem(2, martillo);
        facturaABCABC.agregarItem(1, moladora);
        facturaABCABC.agregarItem(10, clavo);

        System.out.println("Usted está comprando " + facturaABCABC.contarProductos() + " productos.");
        facturaABCABC.mostrarProductos();
        facturaABCABC.mostrarTotalDescontado();
        facturaABCABC.mostrarTotalNoDescontado();
    }
}

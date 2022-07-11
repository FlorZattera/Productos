package flor;

import flor.superclass.Producto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Factura {
        List<Producto> listaCompra = new ArrayList<>();
        Date fechaFactura;
        int sumaProductos;
        int sumaJuguetes;
        double precioFinalNoDesc;
        double precioFinalDesc;

        public Factura() {
            this.fechaFactura = new Date();
        }

        public void agregarItem(int cantidad, Producto prodAgregando) {
            //como parametro, la cantidad de veces que quiero comprar prodAgregando
            //prodAgregando es una instancia de una subclase hecha con sus atributos en el main
            if (cantidad == 1) {
                listaCompra.add(prodAgregando);
                //si compro un paquete de arroz, lo agrego una vez
                precioFinalDesc = precioFinalDesc + prodAgregando.obtenerPrecioFinal();
                //al precio final descontado (el neto que pago) le voy sumando el precio final del producto elegido
                precioFinalNoDesc = precioFinalNoDesc + prodAgregando.getPrecioDeLista();
                //al precio final NO descontado, le agrego precio de lista del producto (precio no descontado)
                if (prodAgregando.getCategoria().equals("Juguetes")) {
                    sumaJuguetes ++;
                }
            } else if (cantidad > 1) {
                for (int i = 0; i < cantidad; i++) {
                    listaCompra.add(prodAgregando);
                    //si compro un paquete de arroz 3 veces, lo agrego 3 veces
                    precioFinalDesc = precioFinalDesc + prodAgregando.obtenerPrecioFinal();
                    //cada vez que agrego el repetido a una nueva casilla, le sumo el precio al total
                    precioFinalNoDesc = precioFinalNoDesc + prodAgregando.getPrecioDeLista();
                    //le agrego el precio de lista del repetido al precio no descontado
                    if (prodAgregando.getCategoria().equals("Juguetes")) {
                        sumaJuguetes ++;
                    }
                }
            }
        }

        public int contarProductos() {
            sumaProductos = listaCompra.size();
            //la cantidad total de productos equivale a la cantidad de casillas creadas en el arraylist
            return sumaProductos;
        }

        public void mostrarTotalDescontado() {
            double sumaPrecioJuguetes = 0;
            double precioJugDesc = 0;
            if (sumaJuguetes > 3) {
                //sumo los precios de lista de los juguetes, y aplico 25% de descuento
                for (int i = 0; i < listaCompra.size(); i++) {
                    if (listaCompra.get(i).getCategoria().equals("Jueguetes")) {
                        sumaPrecioJuguetes = sumaPrecioJuguetes + listaCompra.get(i).getPrecioDeLista();
                    }
                }
                precioJugDesc = sumaPrecioJuguetes * 0.25;
            }
            precioFinalDesc = precioFinalDesc - sumaPrecioJuguetes + precioJugDesc;
            System.out.println("El precio a pagar es: $" + precioFinalDesc + ".");
        }

        public void mostrarTotalNoDescontado() {
            System.out.println("El precio sin descuentos es: $" + precioFinalNoDesc + ".");
        }

        public void mostrarProductos() {
            for (int i = 0; i < listaCompra.size(); i++) {
                System.out.println("Precio de: " + listaCompra.get(i).getNombre() + " es $" + listaCompra.get(i).getPrecioDeLista() + ".");
                //mostramos producto, precio descontado (si aplica), precio de lista
            }
        }
    }


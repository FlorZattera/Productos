package flor.subclass;

import flor.superclass.Producto;

    public class Alimentos extends Producto {
        private final double DESCUENTO = 0.1;
        private String diaDeSemana;

        public Alimentos(String nombre, double precioDeLista, String diaDeSemana) {
            this.categoria = "Alimentos";
            this.nombre = nombre;
            this.precioDeLista = precioDeLista;
            this.diaDeSemana = diaDeSemana;
        }

        @Override
        public double obtenerPrecioFinal() {
            double precio = precioDeLista;
            if (diaDeSemana.equals("Martes") || diaDeSemana.equals("Jueves")) {
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


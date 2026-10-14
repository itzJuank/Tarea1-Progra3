public class ListaLineas {
    private Nodo primero;
    private int cantidad;

    private static class Nodo {
        private LineaDetalle dato;
        private Nodo siguiente;

        private Nodo(LineaDetalle dato) {
            this.dato = dato;
        }
    }

    public void agregar(LineaDetalle linea) {
        Nodo nuevo = new Nodo(linea);

        if (primero == null) {
            primero = nuevo;
        } else {
            Nodo actual = primero;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }

        cantidad++;
    }

    public void insertar(LineaDetalle linea, int posicion) {
        if (posicion < 0 || posicion > cantidad) {
            throw new IndexOutOfBoundsException("Posicion invalida: " + posicion);
        }

        Nodo nuevo = new Nodo(linea);

        if (posicion == 0) {
            nuevo.siguiente = primero;
            primero = nuevo;
        } else {
            Nodo anterior = obtenerNodo(posicion - 1);
            nuevo.siguiente = anterior.siguiente;
            anterior.siguiente = nuevo;
        }

        cantidad++;
    }

    public LineaDetalle eliminar(int posicion) {
        if (posicion < 0 || posicion >= cantidad) {
            throw new IndexOutOfBoundsException("Posicion invalida: " + posicion);
        }

        Nodo eliminado;

        if (posicion == 0) {
            eliminado = primero;
            primero = primero.siguiente;
        } else {
            Nodo anterior = obtenerNodo(posicion - 1);
            eliminado = anterior.siguiente;
            anterior.siguiente = eliminado.siguiente;
        }

        cantidad--;
        eliminado.siguiente = null;
        return eliminado.dato;
    }

    public LineaDetalle buscar(String codigo) {
        Nodo actual = primero;

        while (actual != null) {
            if (actual.dato.getProducto().getCodigo().equals(codigo)) {
                return actual.dato;
            }
            actual = actual.siguiente;
        }

        return null;
    }

    public LineaDetalle getLineaMayor() {
        if (primero == null) {
            return null;
        }

        LineaDetalle mayor = primero.dato;
        Nodo actual = primero.siguiente;

        while (actual != null) {
            if (actual.dato.getImporte() > mayor.getImporte()) {
                mayor = actual.dato;
            }
            actual = actual.siguiente;
        }

        return mayor;
    }

    public int consolidar() {
        int eliminadas = 0;
        Nodo actual = primero;

        while (actual != null) {
            Nodo anterior = actual;
            Nodo comparado = actual.siguiente;

            while (comparado != null) {
                String codigoActual = actual.dato.getProducto().getCodigo();
                String codigoComparado = comparado.dato.getProducto().getCodigo();

                if (codigoActual.equals(codigoComparado)) {
                    int nuevaCantidad = actual.dato.getCantidad() + comparado.dato.getCantidad();
                    actual.dato.setCantidad(nuevaCantidad);
                    anterior.siguiente = comparado.siguiente;
                    comparado = anterior.siguiente;
                    cantidad--;
                    eliminadas++;
                } else {
                    anterior = comparado;
                    comparado = comparado.siguiente;
                }
            }

            actual = actual.siguiente;
        }

        return eliminadas;
    }

    public void invertir() {
        Nodo anterior = null;
        Nodo actual = primero;

        while (actual != null) {
            Nodo siguiente = actual.siguiente;
            actual.siguiente = anterior;
            anterior = actual;
            actual = siguiente;
        }

        primero = anterior;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getSubtotal() {
        int subtotal = 0;
        Nodo actual = primero;

        while (actual != null) {
            subtotal += actual.dato.getImporte();
            actual = actual.siguiente;
        }

        return subtotal;
    }

    public String verContenido() {
        StringBuilder resultado = new StringBuilder();
        Nodo actual = primero;

        while (actual != null) {
            resultado.append(actual.dato).append(" --> ");
            actual = actual.siguiente;
        }

        resultado.append("null");
        return resultado.toString();
    }

    private Nodo obtenerNodo(int posicion) {
        Nodo actual = primero;

        for (int i = 0; i < posicion; i++) {
            actual = actual.siguiente;
        }

        return actual;
    }
}

public class ListaLineas {
    private Nodo primero;

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

    public int getCantidad() {
        int contador = 0;
        Nodo actual = primero;

        while (actual != null) {
            contador++;
            actual = actual.siguiente;
        }

        return contador;
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
}

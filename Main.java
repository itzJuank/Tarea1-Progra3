public class Main {
    public static void main(String[] args) {
        ListaLineas lista = crearListaDePrueba();

        imprimir("Subtotal inicial", lista.getSubtotal());
        imprimir("Cantidad inicial", lista.getCantidad());
        imprimir("Buscar CLA-2", lista.buscar("CLA-2"));
        imprimir("Buscar TOR-8", lista.buscar("TOR-8"));
        imprimir("Buscar PVC-050", lista.buscar("PVC-050"));
        imprimir("Linea mayor", lista.getLineaMayor());
        imprimir("Contenido", lista.verContenido());
    }

    private static ListaLineas crearListaDePrueba() {
        Producto tuboPvc = new Producto("PVC-050", "Tubo PVC 1/2", 1000);
        Producto cemento = new Producto("CEM-50", "Cemento 50 kg", 8500);
        Producto clavos = new Producto("CLA-2", "Clavos 2 pulg", 1200);
        Producto pintura = new Producto("PIN-GL", "Pintura galon", 14000);

        ListaLineas lista = new ListaLineas();
        lista.agregar(new LineaDetalle(tuboPvc, 10));
        lista.agregar(new LineaDetalle(cemento, 2));
        lista.agregar(new LineaDetalle(clavos, 5));
        lista.agregar(new LineaDetalle(tuboPvc, 4));
        lista.agregar(new LineaDetalle(pintura, 1));
        return lista;
    }

    private static void imprimir(String etiqueta, Object valor) {
        System.out.println(etiqueta + ": " + valor);
    }
}

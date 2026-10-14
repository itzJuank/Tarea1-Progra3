public class LineaDetalle {
    private Producto producto;
    private int cantidad;

    public LineaDetalle(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getImporte() {
        return producto.getPrecioUnitario() * cantidad;
    }

    @Override
    public String toString() {
        return "[" + producto.getCodigo() + " x " + cantidad + "]";
    }
}

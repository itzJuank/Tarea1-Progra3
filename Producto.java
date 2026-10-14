public class Producto {
    private String codigo;
    private String descripcion;
    private int precioUnitario;

    public Producto(String codigo, String descripcion, int precioUnitario) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    @Override
    public String toString() {
        return codigo + " - " + descripcion;
    }
}

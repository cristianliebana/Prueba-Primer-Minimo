public class ListaProducto {

    int cantidad;
    String producto;

    public ListaProducto(int cantidad, String producto){
     this.cantidad = cantidad;
     this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }
}

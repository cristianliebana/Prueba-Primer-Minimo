import java.util.List;

public class Pedido {

    String Usuario;
    String producto;

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }


    public void add(int cantidad, String producto) {
        elementos.add(new ListaProducto(cantidad, producto));
    }
}
}

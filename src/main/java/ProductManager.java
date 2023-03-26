import java.util.List;


//Prueba
public interface ProductManager {
    void addProduct(String nombre,double precio);
    void addUser(String id, String nombre, String apellido);
    // Listado de productos ordenado ascendentemente por precio
    List<Producto> listadeProductosporPrecios();

    // Realizar un pedido por parte de un usuario identificado
    void realizarPedido(String id, Pedido pedido);

    // Servir un pedido. Los servicios se realizan en orden de llegadas
    Pedido servirPedido();

    // Listado de pedidos de un usuario que ya hayan sido realizados
    List<Pedido> getPedidosporUsuario(String id);

    // Listado de productos ordenado descendentemente por número de ventas
    List<Producto> getProductosporVentas();

    int numPedidos();

    void add(int cantidad, String nombre);
}


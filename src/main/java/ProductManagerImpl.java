import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class ProductManagerImpl implements ProductManager {
    List<Producto> products;
    HashMap<String,Usuario> usuarios;
    public ProductManagerImpl(){
        this.products = new ArrayList<>();
        this.usuarios = new HashMap<>();
    }
    @Override
    public void addProduct(String nombre,double precio){

        this.products.add(new Producto(nombre,precio));
    }
    @Override
    public void addUser(String id, String nombre, String apellido){
        this.usuarios.put(id, new Usuario(id, nombre, apellido));
    }
    @Override
    public List<Producto> listadeProductosporPrecios() {
        this.products.sort(new Comparator<Producto>() {
            @Override
            public int compare(Producto o1, Producto o2) {
                return o2.getNombre().compareTo(o1.getNombre());
            }
        });
        return this.products;
    }


    @Override
    public void realizarPedido(String id, Pedido pedido) {

    }

    @Override
    public Pedido servirPedido() {
        return null;
    }

    @Override
    public List<Pedido> getPedidosporUsuario(String id) {
        return null;
    }

    @Override
    public List<Producto> getProductosporVentas() {
        return null;
    }

   @Override
    public void add(int cantidad, String nombre){
        this.products.add(cantidad, nombre);
    }

    public int numUsuarios(){
        return usuarios.size();
    }

    public int numPedidos(){
        return this.pedidos.size();
    }
}

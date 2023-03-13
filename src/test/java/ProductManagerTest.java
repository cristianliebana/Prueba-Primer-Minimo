import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class ProductManagerTest {
    ProductManager pm;
    @Before
    public void inicializar(){
        pm=new ProductManagerImpl();
       pm.addProduct("CAFE",3.00);
        pm.addProduct("DONUT",1.00);
        pm.addProduct("COCA-COLA",2.00);
        pm.addUser("41667823A","Cristian","Liebana");
        pm.addUser("41667843A","Jose","Larrinzal");
    }
    @Test
    public void listadeProductosporPreciosTest(){
        List<Producto> resultado = pm.listadeProductosporPrecios();

        Assert.assertEquals("DONUT", resultado.get(0).getNombre());
        Assert.assertEquals(1.00, resultado.get(0).getPrecio(),0.25);
        Assert.assertEquals("COCA-COLA", resultado.get(1).getNombre());
        Assert.assertEquals(2.00, resultado.get(1).getPrecio(),0.25);
        Assert.assertEquals("CAFE", resultado.get(2).getNombre());
        Assert.assertEquals(3.00, resultado.get(2).getPrecio(),0.25);

    }

    @Test
    public void realizarPedidoTest(){

        Pedido pedido = new Pedido();
        pedido.add(2,"CAFE");
        pedido.add(1,"DONUT");
        pm.realizarPedido("41667823A",pedido);
        Assert.assertEquals(1, pm.numPedidos());

        Pedido pedido2 = new Pedido();
        pedido2.add(1,"CAFE");
        pedido2.add(3,"DONUT");
        pedido2.add(1,"COCA-COLA");
        pm.realizarPedido("41667843A",pedido2);

        Assert.assertEquals(2, pm.numPedidos());
    }

    @Test
    public void servirPedidoTest(){
        realizarPedidoTest();
        Pedido pedido = pm.servirPedido();
        //Assert.assertEquals();

        Pedido pedido2 = pm.servirPedido();
        //Assert.
    }
}

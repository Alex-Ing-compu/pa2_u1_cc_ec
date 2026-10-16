import com.edu.ec.negocio.Pedido;
import com.edu.ec.negocio.PedidoService;

 
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
 
        Pedido p =  new Pedido("Juan Peres", "laptop",150, "juansdsd" );
        PedidoService pedidoService = new PedidoService();
        //p = null;
        pedidoService.realizar(p);
        //pedidoService =  null;
       
    }
}

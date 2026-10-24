package ec.edu.uce.pa.paquete;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain 
public class Main implements QuarkusApplication{

    @Inject 
    private PedidoService pedidoService;

    @Inject 
    private CompraService compraService;


    public static void main(String[] args) {

        Quarkus.run(Main.class,args);
        
    }

    @Override 
    public int run(String... args){

        System.out.println("Iniciando aplicacion Quarkus");

        Pedido pedido =new Pedido("Juan ", "laptop", 1500, "juan@a.com");
        pedido.setTelefono("1641651565413");
        
        this.pedidoService.realizar(pedido);

        Compra compra = new Compra("jhon ", "Iphone", 1500, "jhon@.com", "01254521");
        
        this.compraService.realizar(compra);





        return 0;
    }


}

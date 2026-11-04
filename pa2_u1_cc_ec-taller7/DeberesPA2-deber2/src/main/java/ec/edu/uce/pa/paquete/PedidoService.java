package ec.edu.uce.pa.paquete;

import ec.edu.uce.pa.paquete.interceptors.Auditoria;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.spi.CDI;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ApplicationScoped 
public class PedidoService {
 
    @Auditoria 
    public String realizar(Pedido pedido, String valor1){

        long init = System.currentTimeMillis();

        //hacer dormir, simular el tiempo para que se demore la ejecucion del metodo
        try{
            Thread.sleep(1500);
        }catch(Exception e){

        }

        
        System.out.println("Realizando pedido ...");
        System.out.println("Pedido realizado para el cliente: " + pedido.getCliente());
        System.out.println("Producto: " + pedido.getProducto());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("Correo: " + pedido.getCorreo());

        System.out.println("Pedido realizado con exito");

        long fin = System.currentTimeMillis();

        return "pedido realizado con exito" + "\nTiempo ejecucion::" + (fin - init);

       

    }

}

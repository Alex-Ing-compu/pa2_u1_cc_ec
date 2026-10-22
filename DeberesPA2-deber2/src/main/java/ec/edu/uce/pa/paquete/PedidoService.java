package ec.edu.uce.pa.paquete;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.spi.CDI;
import jakarta.inject.Inject;

@ApplicationScoped //delego el control al contenedor
//@RequestScoped //para aplicaciones web
//Singleton 
public class PedidoService {
    /*
    //1. inyeccion de dependecias por atributo
    @Inject 
    private MailService mailService;
    */

    /*
    @Inject 
    private MailService mailService;
    //2. inyeccion  de dependencias por contructor 
    public PedidoService(MailService mailService){
        this.mailService = mailService;
    }
    */

    /*
    //3. inyeccion de dependencias por setter : metodo
    private MailService mailService;

    @Inject 
    public void setMailService(MailService mailService) {
        System.out.println("Se esta inyectando el servcio de correo eletronico service");
        this.mailService = mailService;
    }
*/

    //@Inject 
    //private MailService otromailll;

    public void realizar(Pedido pedido){

        //lookup de la calse MailService

        MailService mailService = CDI.current().select(MailService.class).get();

        System.out.println("Pedido realizado para el cliente: " + pedido.getCliente());
        System.out.println("Producto: " + pedido.getProducto());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("Correo: " + pedido.getCorreo());

        System.out.println("Pedido realizado con exito");

        String asunto = "Confirmacion de pedido";
        String cuerpo = "Estimado" + pedido.getCliente() + "su pedido de"+
                        pedido.getProducto() + "por un total de: " + pedido.getTotal() + 
                        "ha sido realizado con exito";
                        mailService.enviar(pedido.getCorreo(), asunto, cuerpo);
    
    }

}

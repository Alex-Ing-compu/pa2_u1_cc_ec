package ec.edu.uce.pa.paquete;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.spi.CDI;
import jakarta.inject.Inject;
import jakarta.inject.Named;

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

    @Inject 
    @Named("correo")
    private Notificacion notificacionCorreo;

    @Inject 
    @Named("sms")
    private  Notificacion notificacionSMS;


    public void realizar(Pedido pedido){

        System.out.println("Pedido realizado para el cliente: " + pedido.getCliente());
        System.out.println("Producto: " + pedido.getProducto());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("Correo: " + pedido.getCorreo());

        System.out.println("Pedido realizado con exito");

       
        String cuerpo = "Estimado" + pedido.getCliente() + "su pedido de"+
                        pedido.getProducto() + "por un total de: " + pedido.getTotal() + 
                        "ha sido realizado con éxito";

        //Notificacion por correo
        this.notificacionCorreo.enviar(pedido.getCorreo(), cuerpo);

        //Notificacion por sms
        this.notificacionSMS.enviar(pedido.getTelefono(), cuerpo);


        //mailService.enviar(pedido.getCorreo(), asunto, cuerpo);
    
    }

}

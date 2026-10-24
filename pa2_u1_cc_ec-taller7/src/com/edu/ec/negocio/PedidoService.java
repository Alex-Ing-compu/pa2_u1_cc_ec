package com.edu.ec.negocio;

public class PedidoService {
 
    public void realizar(Pedido pedido ){
        System.out.println("Pedido realizado paa el cliente: " + pedido.getCliente());
        System.out.println("Producto: " + pedido.getProducto());
        System.out.println("Total : " + pedido.getTotal());
        System.out.println("Correo: " + pedido.getCorreo());
 
        System.out.println(" Pedido realizado con exito");
 
 
        MailService mailService = new MailService();
        String asunto = "confirmacion de pedido";
        String cuerpo = "Estimado" + pedido.getCliente() + ", su pedido de "
        + pedido.getProducto() + "por un total de $ " + pedido.getTotal()
        + "ha sido realizado con exito.";
 
        mailService.enviar(pedido.getCorreo(), asunto, cuerpo);
        mailService = null;
    }
 
}
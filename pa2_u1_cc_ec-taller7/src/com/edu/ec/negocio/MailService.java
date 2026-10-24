package com.edu.ec.negocio;

 
public class MailService {
    public void enviar(String correo, String asunto, String cuerpo){
       
        System.out.println("Enviando correo a: " + correo);
        System.out.println("asunto: " + asunto);
        System.out.println("cuerpo : " + cuerpo);
        System.out.println("Correo enviado con exito");
    }
 
}
 

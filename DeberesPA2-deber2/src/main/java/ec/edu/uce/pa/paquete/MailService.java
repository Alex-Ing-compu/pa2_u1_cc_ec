package ec.edu.uce.pa.paquete;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
//@RequestScoped 
//@Singleton 
public class MailService {

    public void enviar(String correo, String asunto, String cuerpo){
        System.out.println("Enviando correo a:" + correo);
        System.out.println("Asunto:" + asunto);
        System.out.println("Cuerpo:" + cuerpo);
        System.out.println("Correo enviando con exito");
    }

}

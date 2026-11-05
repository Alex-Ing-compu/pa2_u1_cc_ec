package ec.edu.uce.pa.paquete.interceptors;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@EnviarMail
@Interceptor 
@Priority (Interceptor.Priority.APPLICATION + 4)
public class EnviarMailInterceptor {

     @AroundInvoke
    public Object enviarCorreo(InvocationContext context) throws Exception {

        System.out.println("--------------------");
        System.out.println("[INTERCEPTOR DE CORREO MAIL] ");
        System.out.println("Enviando correo al cliente...");

        Object resultado = context.proceed();

        System.out.println("Correo enviado correctamente");
        System.out.println("-------------------");

        return resultado;
    }
}

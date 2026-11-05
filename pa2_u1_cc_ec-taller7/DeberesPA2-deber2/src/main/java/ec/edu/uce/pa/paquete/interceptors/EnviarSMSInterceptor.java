package ec.edu.uce.pa.paquete.interceptors;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@EnviarSMS
@Interceptor 
@Priority (Interceptor.Priority.APPLICATION + 3)
public class EnviarSMSInterceptor {

    @AroundInvoke 
    public Object enviarSMS(InvocationContext context) throws Exception {

        System.out.println("----------------------");
        System.out.println("[INTERCEPTOR DE SMS]");
        System.out.println("Enviando SMS al cliente...");

        Object resultado = context.proceed();

        System.out.println("SMS enviado correctamente");
        System.out.println("-------------------------");

        return resultado;
    }
}
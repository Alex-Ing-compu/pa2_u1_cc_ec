package ec.edu.uce.pa.paquete.interceptors;

import java.lang.reflect.Parameter;

import ec.edu.uce.pa.paquete.Pedido;
import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@MedirTiempo 
@Interceptor 
@Priority (Interceptor.Priority.APPLICATION + 1)
public class MedirTiempoInterceptor {

      @AroundInvoke 
    public Object interceptar(InvocationContext context) throws Exception{

        long ini = System.currentTimeMillis();

        Object result = context.proceed();

        long fin = System.currentTimeMillis();

        System.out.println("[Interceptor medir TIEMPO] " + (fin-ini) + " ms");
      
        return result;


    } 

}

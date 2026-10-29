package ec.edu.uce.pa.paquete.interceptors;

import java.lang.reflect.Parameter;

import ec.edu.uce.pa.paquete.AuditoriaService;
import ec.edu.uce.pa.paquete.Pedido;
import jakarta.inject.Inject;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

//tener el mismo del interceptor para hacer ese match y ver a cual pertenece cada cual
@Auditoria 
@Interceptor 
public class AuditoriaInterceptor {
    @Inject 
    private AuditoriaService auditoriaService;


    //el contex: es todo lo que gira al rededor del metodo que voy auditar: nombre del metodo, atributos como entrada la metodo, valores que ingresan etc
    @AroundInvoke 
    public Object interceptar(InvocationContext context) throws Exception{

       
        //Todo lo que esta arriba ase ejecuta antes de ejecutar el metodo interceptor
        Object resultado = context.proceed(); //El proced: Ejecuta el metodo interceptado

        System.out.println("Retorno: " + resultado);
        String nombreMetodo = context.getMethod().getName();
        
        System.out.println("Auditoria se esta ejecutando el metodo " + nombreMetodo);
        System.out.println("Ejecuto todo lo que quiero que haga el interceptor");

        Parameter[] parametros = context.getMethod().getParameters();//aqui accedo al metodo: 
        for(Parameter parametro : parametros){
            System.out.println("Parametros: " + parametro.getName());
        }

        //Acceder a los valores
        Object[] valores = context.getParameters();
        Pedido pedido = (Pedido)valores[0];


        String cliente = pedido.getCliente();
        double total = pedido.getTotal();
        String correo = pedido.getCorreo();


        this.auditoriaService.guardarEnLaBase(cliente, total, correo);

        return resultado;


    }   
}

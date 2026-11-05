package ec.edu.uce.pa.paquete.interceptors;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.interceptor.InterceptorBinding;

@InterceptorBinding //le da el comportamiento de un interceptor
@Retention (RetentionPolicy.RUNTIME)//en que moneto se va ejecutar esto
@Target ({ElementType.TYPE, ElementType.METHOD})
public @interface MedirTiempo {

}

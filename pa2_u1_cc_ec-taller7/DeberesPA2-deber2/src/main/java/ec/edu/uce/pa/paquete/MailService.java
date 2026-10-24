package ec.edu.uce.pa.paquete;

import io.quarkus.arc.Unremovable;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import jakarta.inject.Singleton;

//Ambitos y contextos

//@ApplicationScoped //su ambito es durante toda la apliacion
// es decir, se crea una sola instancia de la clase y se comparten todos los componentes que la utilizan.

//@RequestScoped //Su ambito es en aplicaciones web durante el request/peticion http, es decir se crea una instancia de la clase y se comparten entre
//todos lo que utilzizan 

//@SessionScoped //su ambito es en apñlicaciones web dirante la secion de los usuarios, es decir 
// se crea una sola intancia con quines se cmparte o lo utilizan.

@Singleton //su ambito es durante toda la apliacion
// es decir, se crea una sola instancia de la clase y se comparten todos los componentes que la utilizan. 

//@Dependent //su ambito es durante la inyeccion de dependencias es decir se crea y se comparte
// entre todos os componenetes que la utilizan, cada vez que se inyecte se creara un nuevo objeto.
//Cuando es necesario: en pantallas 
@Named("mail") 
public class MailService implements Notificacion {

    private Integer cantidad = 0;

    private String nombre;
    
    @Override
    public void enviar(String destino, String mensaje) {
       System.out.println("Enviar correo a: " + destino);
       System.out.println("Mensaje: " + mensaje);
       System.out.println("Correo enviando con éxito"); 
       System.out.println("Fin del envio de correo"); 
    }


    //geters and stters
    
    public Integer getCantidad() {
        return cantidad;
    }


    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }


    
    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}

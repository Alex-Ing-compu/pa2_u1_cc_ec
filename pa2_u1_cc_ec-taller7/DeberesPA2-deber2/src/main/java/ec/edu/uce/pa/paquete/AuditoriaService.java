package ec.edu.uce.pa.paquete;

import java.time.LocalDateTime;

import jakarta.inject.Singleton;

@Singleton 
public class AuditoriaService {

    public void  guardarEnLaBase(String cliente, double total, String correo ){
        System.out.println("Guardando en la base datos la auditoria: Cliente: "+ cliente+ " Total: " + total + " Correo: " + correo );
        System.out.println("Con la fecha Y hora" + LocalDateTime.now());
    }
}

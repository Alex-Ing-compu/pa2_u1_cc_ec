package ec.edu.uce.pa.paquete;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain 
public class Main implements QuarkusApplication{

    @Inject 
    private PedidoService pedidoService;

    //@Inject 
    //private MatriculaService matriculaService;

    public static void main(String[] args) {

        Quarkus.run(Main.class,args);
        
    }

    @Override 
    public int run(String... args){

        System.out.println("Iniciando aplicacion Quarkus");

        Pedido pedido =new Pedido("Juan ", "laptop", 1500, "juan@a.com");

        this.pedidoService.realizar(pedido);





        
        //DEBERES
        /*
        System.out.println("------------------------------");
        System.out.println("Sistema de matriculacion");
        Estudiante estu = new Estudiante("1003456789", "Jhon", "Programacion", "jhon@.com", 23);
        this.matriculaService.procesarMatricula(estu);
        */

        return 0;
    }


}

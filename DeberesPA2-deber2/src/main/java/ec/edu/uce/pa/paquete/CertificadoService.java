package ec.edu.uce.pa.paquete;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public class CertificadoService {

    public void generarCertificado(String nombre, String curso) {
        System.out.println("----------------------------------------");
        System.out.println("CERTIFICADO DE MATRICULA");
        System.out.println("Certificamos que el/la estudiante: " + nombre);
        System.out.println("Se ha matriculado exitosamente en el curso: " + curso);
        System.out.println("----------------------------------------");
    }
}

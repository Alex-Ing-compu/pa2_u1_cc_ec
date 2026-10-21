package ec.edu.uce.pa.paquete;

public class Estudiante {

    private String cedula;
    private String nombre;
    private String curso;
    private String correo;
    private int edad;

    public Estudiante(String cedula, String nombre, String curso, String correo, int edad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.curso = curso;
        this.correo = correo;
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }



   
   


}

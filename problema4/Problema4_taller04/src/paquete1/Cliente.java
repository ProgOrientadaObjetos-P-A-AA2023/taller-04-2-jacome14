package paquete1;

/**
 *
 * @author santy
 */
public class Cliente {

    private String nombres;
    private String apellidos;
    private String cedula;

    public Cliente() {
        nombres = "Javier Alexander ";
        apellidos = "Jacome Bustamante ";
        cedula = "1104661168";
    }

    public Cliente(String noms, String aplls, String ced) {
        nombres = noms;
        apellidos = aplls;
        cedula = ced;
    }

    public void establecerNombres(String x) {
        nombres = x;
    }

    public void establecerApellidos(String x) {
        apellidos = x;

    }

    public void estabelcerCedula(String x) {
        cedula = x;
    }

    public String obtenerNombres() {
        return nombres;
    }

    public String obtenerApellidos() {
        return apellidos;
    }

    public String obtenerCedula() {
        return cedula;
    }

}

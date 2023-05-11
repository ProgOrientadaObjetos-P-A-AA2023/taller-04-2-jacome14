package paquete1;

public class Profesor {

    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private String cedula;
    private Provincia provincia;

    public Profesor() {
        nombre = "Alex";
        apellido = "Maldonado ";
        sueldoBasico = 1299.95;
        cedula = "53465767657";
        provincia = new Provincia();
    }

    public Profesor(String nom, String apll, double sBas,
             String ced, Provincia pro) {
        nombre = nom;
        apellido = apll;
        sueldoBasico = sBas;
        cedula = ced;
        provincia = pro;
    }

    public void establecerNombre(String x) {
        nombre = x;
    }

    public void establecerApellido(String x) {
        apellido = x;
    }

    public void establecerSueldoBasico(double x) {
        sueldoBasico = x;
    }

    public void calcularSueldoTotal() {
        sueldoTotal = sueldoBasico + (sueldoBasico * 0.2);
    }

    public void establecerCedula(String x) {
        cedula = x;
    }

    public void establecerProvincia(Provincia x) {
        provincia = x;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public double obtenerSueldoBasico() {
        return sueldoBasico;
    }

    public double obtenerSueldoTotal() {
        return sueldoTotal;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public Provincia obtenerProvincia() {
        return provincia;
    }

    @Override
    public String toString() {
        String cadena = String.format("""
                                      El profesor %s %s tiene las siguientes 
                                      caracter\u00edsticas:
                                      Vive en la provincia de %s (%d)
                                      Sueldo B\u00e1sico: %.2f
                                      Sueldo Total: %.2f
                                      C\u00e9dula: %s
                                      ---------------------------------
                                      -----------
                                      """,
                nombre, apellido,
                provincia.obtenerNombreProvincia(),
                provincia.obtenerNumeroHabitantes(), sueldoBasico,
                sueldoTotal, cedula);
        return cadena;
    }

}

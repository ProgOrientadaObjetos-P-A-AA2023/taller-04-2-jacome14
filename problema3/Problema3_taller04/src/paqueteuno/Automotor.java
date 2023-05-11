package paqueteuno;

public class Automotor {

    private String cedulaDuenio;
    private Fabricante fabricante;
    private int anioFabricacion;
    private double valorVehiculo;
    private double valorMatricula;

    public Automotor() {
        cedulaDuenio = "4342432";
        fabricante = new Fabricante();
        anioFabricacion = 2000;
        valorVehiculo = 2000.90;
    }

    public Automotor(String ced, Fabricante fab, int anioFab, double valVeh) {
        cedulaDuenio = ced;
        fabricante = fab;
        anioFabricacion = anioFab;
        valorVehiculo = valVeh;
    }

    public void establecerCedulaDuenio(String x) {
        cedulaDuenio = x;
    }

    public void establecerFabricante(Fabricante x) {
        fabricante = x;
    }

    public void establecerAnioFabricacion(int x) {
        anioFabricacion = x;
    }

    public void establecerValorVehiculo(double x) {
        valorVehiculo = x;
    }

    public void calcularValorMatricula() {
        valorMatricula = (valorVehiculo * 0.00002) * anioFabricacion;
    }

    public String obtenerCedulaDuenio() {
        return cedulaDuenio;
    }

    public Fabricante obtenerFabricante() {
        return fabricante;
    }

    public int obtenerAnioFabricacion() {
        return anioFabricacion;
    }

    public double obtenerValorVehiculo() {
        return valorVehiculo;
    }

    public double obtenerValorMatricula() {
        return valorMatricula;
    }

    @Override
    public String toString() {
        String cadena = String.format("""
                                      Caracter\u00edsticas del Veh\u00edculo:
                                      Cedula del Due\u00f1o: %s
                                      Fabricante: %s
                                      Ciudad de Origen: %s
                                      A\u00f1o de  Fabricaci\u00f3n: %d
                                      Valor del Veh\u00edculo: %.2f
                                      Valor de la Matr\u00edcula: %.2f
                                      -----------------------------
                                      """,
                cedulaDuenio, fabricante.obtenerNombreFabricante(),
                fabricante.obtenerCiudadOrigen(), anioFabricacion,
                valorVehiculo, valorMatricula);
        return cadena;
    }

}

package paqueteuno;

public class Fabricante {

    private String nombreFabricante;
    private String ciudadOrigen;

    public Fabricante() {
        nombreFabricante = "Toyota ";
        ciudadOrigen = "Estados Unidos";
    }

    public Fabricante(String nomFab, String ciuOg) {
        nombreFabricante = nomFab;
        ciudadOrigen = ciuOg;
    }

    public void establecerNombreFabricante(String x) {
        nombreFabricante = x;
    }

    public void establecerCiudadOrigen(String x) {
        ciudadOrigen = x;
    }

    public String obtenerNombreFabricante() {
        return nombreFabricante;
    }

    public String obtenerCiudadOrigen() {
        return ciudadOrigen;
    }

}

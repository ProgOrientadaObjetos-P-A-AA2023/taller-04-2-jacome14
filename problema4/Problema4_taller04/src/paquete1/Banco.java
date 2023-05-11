package paquete1;

public class Banco {

    private String nombreBanco;
    private int numeroSucursales;

    public Banco() {
        nombreBanco = "Banco de Loja";
        numeroSucursales = 5;
    }

    public Banco(String nomBan, int numSuc) {
        nombreBanco = nomBan;
        numeroSucursales = numSuc;
    }

    public void establecerNombreBanco(String x) {
        nombreBanco = x;
    }

    public void establecerNumeroSucursales(int x) {
        numeroSucursales = x;
    }

    public String obtenerNombreBanco() {
        return nombreBanco;
    }

    public int obtenerNumeroSucursales() {
        return numeroSucursales;
    }

}

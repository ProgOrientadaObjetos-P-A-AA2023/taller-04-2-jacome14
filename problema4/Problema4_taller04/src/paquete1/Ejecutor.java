package paquete1;

public class Ejecutor {

    public static void main(String[] args) {

        EntidadFinanciera enfi = new EntidadFinanciera();

        enfi.calcularComisionBanco();

        System.out.printf("%s", enfi);

        String nombres = "Karelys Alexandra ";
        String apellidos = "Pineda Davila";
        String cedula = "43242546";
        Cliente cliente = new Cliente(nombres, apellidos, cedula);
        String banco = "Banco Pichincha";
        int sucursales = 8;
        Banco ban = new Banco(banco, sucursales);
        double valorCheque = 1100.90;
        EntidadFinanciera enfi2 = new EntidadFinanciera(cliente,
                ban, valorCheque);

        enfi2.calcularComisionBanco();

        System.out.printf("%s", enfi2);
    }

}

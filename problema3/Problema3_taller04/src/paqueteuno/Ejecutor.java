package paqueteuno;

public class Ejecutor {

    public static void main(String[] args) {

        Automotor auto = new Automotor();

        auto.calcularValorMatricula();

        System.out.printf("%s", auto);

        // Creación de los segundos objetos
        String fabricante = "Nissan";
        String ciudad = "China ";
        Fabricante fab = new Fabricante(fabricante, ciudad);
        String cedulaDuenio = "35345436";
        int anioFabricacion = 1988;
        double valorVehiculo = 3050.50;
        Automotor auto2 = new Automotor(cedulaDuenio, fab,
                 anioFabricacion, valorVehiculo);

        auto2.calcularValorMatricula();

        System.out.printf("%s", auto2);
    }

}

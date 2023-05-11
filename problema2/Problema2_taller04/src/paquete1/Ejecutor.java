package paquete1;

public class Ejecutor {
    public static void main(String[] args) {
     
        Profesor prof = new Profesor();
        
        prof.calcularSueldoTotal();
        
        System.out.printf("%s",prof);
   
        String provincia = "Zamora ";
        int numHabitantes = 43656456;
        Provincia pro = new Provincia(provincia,numHabitantes);
        String nombre = "Javier ";
        String apellido = "Jacome";
        double sueldoBasico = 800;
        String cedula = "1900740968";
        Profesor prof2 = new Profesor(nombre,apellido
                ,sueldoBasico,cedula,pro);
        
        prof2.calcularSueldoTotal();
        
        System.out.printf("%s",prof2);
    }
    
}

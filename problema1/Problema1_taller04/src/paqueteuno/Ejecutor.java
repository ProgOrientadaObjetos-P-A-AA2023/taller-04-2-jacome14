package paqueteuno;

public class Ejecutor {
    public static void main(String[] args) {
        // Creación de los primeros objetos
        EstudianteNota alumno = new EstudianteNota();
        
        alumno.calcularPromedioNotas();
        
        System.out.printf("%s",alumno);
     
        String universidad = "UTPL";
        String direccion = "San Cayetano Alto";
        Universidad u = new Universidad(universidad,direccion);
        String nombre = "ALEX JAVIER ";
        double nota1 = 9.00;
        double nota2 = 8.00;
        double nota3 = 5.50;
        EstudianteNota alumno2 = new EstudianteNota(nombre,nota1,
                nota2,nota3,u);
        
        alumno2.calcularPromedioNotas();
        
        System.out.printf("%s",alumno2);
    }
    
}

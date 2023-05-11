package paquete1;


public class Provincia {
    private String nombreProvincia;
    private int numeroHabitantes;
    
    public Provincia(){
        nombreProvincia = "Loja";
        numeroHabitantes = 448966;
    }
    
    public Provincia(String nomPro, int numHab){
        nombreProvincia = nomPro;
        numeroHabitantes = numHab;
    }
    
    public void establecerNombreProvincia(String x){
        nombreProvincia = x;
    }
    
    public void establecerNumeroHabitantes(int x){
        numeroHabitantes = x;
    }
    
    public String obtenerNombreProvincia(){
        return nombreProvincia;
    }
    
    public int obtenerNumeroHabitantes(){
        return numeroHabitantes;
    }
    
}

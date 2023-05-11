package paqueteuno;

public class Universidad {
    private String nombreUniversidad;
    private String direccion;
    
    public Universidad(){
        nombreUniversidad = "UNL";
        direccion = "AV. PIO JARAMILLO ";
    }
    
    public Universidad(String nomUni, String dirc){
        nombreUniversidad = nomUni;
        direccion = dirc;
    }
    
    public void establecerNombreUniversidad(String x){
        nombreUniversidad = x;
    }
    
    public void establecerDireccion(String x){
        direccion = x;
    }
    
    public String obtenerNombreUniversidad(){
        return nombreUniversidad;
    }
    
    public String obtenerDireccion(){
        return direccion;
    }
    
}

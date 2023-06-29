package paquete02;


public class Ciudad {
    private String nombre;
    
    
    public Ciudad(String c){
        nombre = c;
    }

    public void establecerNombre(String s) {
        nombre = s;
    }

    public String obtenerNombre() {
        return nombre;
    }
}

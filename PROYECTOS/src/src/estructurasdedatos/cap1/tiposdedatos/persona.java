package estrucutrasdedatos.cap1.tipsdedatos

public class Persona {  
    private String nombre;
    private String cedula;
    private String direccion;
    private String telofono;
   
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   public String getCedula() {
        return cedula;
    }
  
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
 
    public String getDireccion() {
        return direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelofono() {
        return telofono;
    }
   
    public void setTelofono(String telofono) {
        this.telofono = telofono;
    } 
}

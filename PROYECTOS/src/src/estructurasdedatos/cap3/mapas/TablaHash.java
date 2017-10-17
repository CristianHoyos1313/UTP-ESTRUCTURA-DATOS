/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap3.mapas;

public class TablaHash {
    Persona registro[];
    private int tamaño;
    
    public TablaHash(int tam){
        this.registro = new Persona[tam];
        this.tamaño = tam;
    }
    
           
    
    public int codigoHash(int clave){
        return clave % this.tamaño;        
    }
    
          
    
    public int plegamiento(int clave){
        int r1 = clave/this.tamaño;
        int r2 = clave%this.tamaño;
        int posicion = r1+r2;
        return posicion;
    }
    
          
    
    public int cuadrados(int clave){
        int posicion = (clave%this.tamaño)/2;
        return posicion;
    }
    
    public void insertar(int clave, String nombre){
        Persona nuevaP = new Persona (clave,nombre);
        int posicion = cuadrados(clave);
        this.registro[posicion] = nuevaP;         
        }
    
    public void eliminar(int clave){
        int posicion = cuadrados(clave);
        this.registro[posicion] = null;
        
    }
    
    public Persona consultar(int cedula){
        int posicion = cuadrados(cedula);
        return this.registro[posicion];
    }
      
    public void listar(){
        int i;
        for(i=0; i< this.tamaño; i++){
            if(this.registro[i]==null){
                System.out.println("registro vacio");
                
            }else{
                System.out.println("LISTADO DATOS " + i);
                System.out.println("Cedula: " + this.registro[i].getClave());
                System.out.println("Nombre: " + this.registro[i].getNombre());
                
            }
            
        }
    }
}

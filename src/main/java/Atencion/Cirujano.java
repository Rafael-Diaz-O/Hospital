
package Atencion;
import Urgencias.*;


public class Cirujano extends Persona {
    
    private String quirofano;
    private String tipoProcedimiento; 
    private HistorialCirugias historial;
    
    public Cirujano(){}
    
    public Cirujano(String nombre,String cedula,int edad,String genero,String quirofano,String tipoProcedimiento
    ,String fechaProcedimiento, String horaProcedimiento){
        super(nombre,cedula,edad,genero); 
        this.quirofano = quirofano;
        this.tipoProcedimiento = tipoProcedimiento;
        this.historial = new HistorialCirugias (fechaProcedimiento,horaProcedimiento); 
        
    }
    
    public void setQuirfano(String quirofano){
        if(quirofano == null || quirofano.isBlank() || quirofano.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")){ 
            throw new IllegalArgumentException("El nombre es incorrecto");
        }else{
            this.quirofano = quirofano;
        }
    }
    
    public void setTipoProcedmiento(String tipoProcedimiento){
       if(tipoProcedimiento == null || tipoProcedimiento.isBlank() || tipoProcedimiento.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")){ 
            throw new IllegalArgumentException("El nombre es incorrecto");
        }else{
            this.tipoProcedimiento = tipoProcedimiento;
        } 
    }

    public String getQuirofano() {
        return quirofano;
    }

    public String getTipoProcedimiento() {
        return tipoProcedimiento;
    }
    
    public void asignarQuirofanos(){
        
        String pacientes = "";
                      
        if (pacientes != null){
            
        }else {
            
        }
    }
    
    public void preprarCirugia(){
        
        asignarQuirofanos();
    }
    @Override 
    public String toString(){
        
        String str = super.toString() + ""; 
        
        return str;
    }
    
}

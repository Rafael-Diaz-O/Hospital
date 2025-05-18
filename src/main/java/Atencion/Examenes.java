package Atencion;


public class Examenes {
    
    private String tipoExamen;
    private String resultado;
    
    public Examenes(){}
    
    public Examenes (String tipoExamen, String resultado){
        
        this.resultado = resultado;
        this.tipoExamen = tipoExamen;    
    }
    
    public void setTipoExamen (String tipoExamen){
        if(tipoExamen == null || tipoExamen.isBlank() || tipoExamen.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")){ 
            throw new IllegalArgumentException("El nombre es incorrecto");
        }else{
            this.tipoExamen = tipoExamen;
        }
    }
    
    public void setResultados(String resulatdo){
       if(resultado == null || resultado.isBlank() || resultado.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")){ 
            throw new IllegalArgumentException("El nombre es incorrecto");
        }else{
            this.resultado = resultado;
        } 
    }

    public String getTipoExamen() {
        return tipoExamen;
    }

    public String getResultado() {
        return resultado;
    }
    
    @Override 
    
    public String toString(){
        String str = "";
        return str; 
    }
    
}

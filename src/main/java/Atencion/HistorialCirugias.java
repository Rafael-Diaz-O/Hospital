package Atencion;


public class HistorialCirugias {
    
    private String fechaProcedimientos;
    private String horaProcedimiento;
    private boolean exito; 
    
    public HistorialCirugias(){}
    
    public HistorialCirugias(String fechaProcedimiento,String horaProcedimiento){
        this.fechaProcedimientos = fechaProcedimiento;
        this.horaProcedimiento = horaProcedimiento; 
    }
    
    public void setFechaProcedimientos(String fechaProcedimientos){
       if(fechaProcedimientos == null || fechaProcedimientos.isBlank() || fechaProcedimientos.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")){ //Sirve para validar datos enteramente de letras y no de numeros, asi como mombres con acentuacion
            throw new IllegalArgumentException("El nombre es incorrecto");
        }else{
            this.fechaProcedimientos = fechaProcedimientos;
        }
        
        
    }
    
    public void setHoraProcedimiento(String horaProcedimiento){
        if(horaProcedimiento == null || horaProcedimiento.isBlank() || horaProcedimiento.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")){ //Sirve para validar datos enteramente de letras y no de numeros, asi como mombres con acentuacion
            throw new IllegalArgumentException("El nombre es incorrecto");
        }else{
            this.horaProcedimiento = horaProcedimiento;
        }
    }

    public String getFechaProcedimientos() {
        return fechaProcedimientos;
    }

    public String getHoraProcedimiento() {
        return horaProcedimiento;
    }

    
    @Override 
    
    public String toString(){
        
        String str = "";
        
        return str; 
        
    }
    
    
    
}

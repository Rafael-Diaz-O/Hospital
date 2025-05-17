
package Urgencias;


public class Persona {
    
    private String nombre;
    private String cedula;
    private int edad;
    private String genero;
   
    public Persona(){};
    
    
 
    public Persona (String nombre,String cedula,int edad, String genero){
        this.nombre = nombre; 
        this.cedula = cedula; 
        this.edad = edad;
        this.genero = genero; 
    }
    
    
    public void setName(String nombre){
        if(nombre == null || nombre.isBlank()|| nombre.matches(".*[-!@#$%^&*()+=<>?/]*.")){
            throw new IllegalArgumentException("Este nombre no es valido");
        }
        else {
            this.nombre = nombre; 
        }
    
    }
    
    public void setCedula (String cedula ){
        //investigar como validar el que no me puedan escribir palabras solo numeros
        if(cedula == null|| cedula.isBlank() || cedula.matches(".*[-!@#$%^&*()+=<>?/]*.")){
            throw new IllegalArgumentException("Valores no validos porfavor ingrese solo numeros");
        }else 
        {
            this.cedula = cedula; 
        }
    }
    
    // investiar como pasar de entero a string para validar 
    /*
    public void setEdad(int edad){
        if(edad = null || edad.isBlank ||edad.matches(".*[-!@#$%^&*()+=<>?/]*.") ){
            throw new IllegalArgumentException("Datos inscorrectos por favor use solo numeros");
        }
    }
    
    */

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void setGenero(String genero){
        if(genero == null || genero.isBlank()|| genero.matches(".*[-!@#$%^&*()+=<>?/]*.")){
            throw new IllegalArgumentException("Valor no valido por favor solo escrive texto sin numeros o carateres especiales");
        }else{
            this.genero = genero; 
        }
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }
    
    @Override 
    public String toString(){
        
        String str ="Nombre: " + this.nombre + "Edad: " + this.edad + "Cedula: " + this.cedula + "Genero: "
                + this.genero;
        
        return str;
        
    }
    
}
 
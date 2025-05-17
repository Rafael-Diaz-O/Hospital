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
    
    public void setNombre(String nombre){
        if(nombre == null || nombre.isBlank() || nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")){ //Sirve para validar datos enteramente de letras y no de numeros, asi como mombres con acentuacion
            throw new IllegalArgumentException("El nombre es incorrecto");
        }else{
            this.nombre = nombre;
        }
    }
    
    public void setCedula(String cedula){
        if(cedula == null || cedula.isBlank() || cedula.matches("\\d{10}")){ //Limitar el ingreso de datos 10 digitos
           throw new IllegalArgumentException("La cedula es incorrecta");
        }
        else{
            this.cedula = cedula;
        }
    }
    
    
    public void setEdad(int edad){
        if(edad < 0 || edad > 130){
            throw new IllegalArgumentException("La edad debe estar dentro del rango de 0 a 130");
        }else{
            this.edad = edad;
        }
    }
    
    public void setGenero(String genero){
        if(genero == null || genero.isBlank() || genero.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")){
            throw new IllegalArgumentException("El genero es incorrecto");
        }
        else{
            this.genero = genero;
        }
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getCedula(){
        return this.cedula;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public String genero(){
        return this.genero;
    }
    @Override
    public String toString(){
        String str = "Nombre: " + this.nombre +
                      "\tCedula: " + this.cedula +
                      "\tEdad: " + this.edad + 
                      "\tGenero: " + this.genero;
        
        return str;
    }
    
    
}

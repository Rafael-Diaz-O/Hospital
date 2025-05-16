package Urgencias;

public abstract class Personal {
    
    private String tareas;
    private String idPersonal;
    private String nombrePersonal;

public Personal(){ 
}    
public Personal(String tareas, String idPersonal, String nombrePersonal){
    this.tareas = tareas;
    this.idPersonal = idPersonal;
    this.nombrePersonal = nombrePersonal;
}
public void setTareas(String tareas){
    if (tareas == null || tareas.isBlank() || tareas.matches(".*[-!@#$%^&*()+=<>?/].*")){
            throw new IllegalArgumentException("Error al intentar cargar las tareas");
        }
        else{
            this.tareas = tareas;
        }
}
public void setIdPersonal(String idPersonal){
    if (idPersonal == null || idPersonal.isBlank() || idPersonal.matches(".*[-!@#$%^&*()+=<>?/].*")){
            throw new IllegalArgumentException("Error al intentar cargar el ID del usuario");
        }
        else{
            this.idPersonal = idPersonal;
        }
}
public void setNombrePersonal (String nombrePersonal){
    if (nombrePersonal == null || nombrePersonal.isBlank() || nombrePersonal.matches(".*[-!@#$%^&*()+=<>?/].*")){
            throw new IllegalArgumentException("Error al intentar cargar el nombre del usuario");
        }
        else{
            this.nombrePersonal = nombrePersonal;
        }
}
public String getTareas(){
    return this.tareas;
}
public String getIdPersonal(){
    return this.idPersonal;
}
public String getNombrePersonal(){
    return this.nombrePersonal;
}
@Override
public String toString(){
    String str = this.nombrePersonal + "," + this.idPersonal + "," + this.tareas;
        return str;
}
}
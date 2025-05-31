

package Urgencias;
import Atencion.Personal;


public class Enfermero extends Personal {
        
private String nombre,signos,medicamento,viaAdministracion;

public Enfermero(String nombre,String signos,String medicamento, String viaAdministracion,String tareas,String idPersonal,String nombrePersonal){
    super(tareas,idPersonal,nombrePersonal);
    this.nombre = nombre;
    this.medicamento = medicamento;
    this.viaAdministracion= viaAdministracion;
    this.signos = signos;
    
}


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSignos() {
        return signos;
    }

    public void setSignos(String signos) {
        this.signos = signos;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public String getViaAdministracion() {
        return viaAdministracion;
    }

    public void setViaAdministracion(String viaAdministracion) {
        this.viaAdministracion = viaAdministracion;
    }
    
    @Override
    public String turno() {
        // Aquí va la lógica para el turno del enfermero
        return "Turno de día"; // o lo que necesites devolver
    }
     

    @Override
    public String toString() {
        String str;
        
        str= String.format("| %-20s | %-30s | %-20s | %-21s |", 
            nombre, signos, medicamento, viaAdministracion);
       
        return str;
    }
    
    
}

    

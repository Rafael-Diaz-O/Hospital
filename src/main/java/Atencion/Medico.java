/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atencion;

/**
 *
 * @author caflo
 */
public class Medico extends Personal {
    
    private String consultorio;
    private int añosExp;
    private int cantidadConsultasDiarias;
    
    
    public Medico(){
        
    }
    
    public Medico(String nombre, String cedula, int edad, String genero, String tareas, String idPersonal, String consultorio, int añosExp, int cantidadConsultasDiarias){
        super(nombre, cedula, edad, genero, tareas, idPersonal);
        this.consultorio = consultorio;
        this.añosExp = añosExp;
        this.cantidadConsultasDiarias = cantidadConsultasDiarias;
    }
    
    public void setConsultorio(String consultorio){
        if(consultorio == null || consultorio.isBlank() || consultorio.matches("\\d+")){
            throw new IllegalArgumentException("Error del consultorio");
        }else{
            this.consultorio = consultorio;
        }
    }
   
    
    public String getConsultorio(){
        return this.consultorio;
    }
    
    public void setAñosExp(int añosExp){
        if(añosExp < 0 || añosExp > 70){
            throw new IllegalArgumentException("El año de experiencia debe estar entre 0 y 70");
        }
        else{
            this.añosExp = añosExp;
        }
    }
    
    public int getAñosExp(){
        return this.añosExp;
    }
    
    public void setCantidadConsultasDiarias(int cantidadConsultasDiarias){
        if(cantidadConsultasDiarias < 0 || cantidadConsultasDiarias > 50){
            throw new IllegalArgumentException("El rango debe estar entre 0 y 50");
        }
        else{
            this.cantidadConsultasDiarias = cantidadConsultasDiarias;
        }
    }
    
    public int getCantidadConsultasDiarias(){
        return this.cantidadConsultasDiarias;
    }
    
    @Override
    public String turno(){
        return "Turno en la mañana";
    }
    
    @Override
    
    public String toString(){
        String str = super.toString() + "\nConsultorio: " + this.consultorio + "\nAños de Experiencia: " + this.añosExp + "\nCantidad de consultas: " + this.cantidadConsultasDiarias;
        
        return str;
    }
    
    
    
}

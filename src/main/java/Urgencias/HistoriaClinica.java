/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Urgencias;

/**
 *
 * @author valen
 */
public class HistoriaClinica {
    
 private String horaIngreso;
    private String fechaIngreso;
    private String diagnosticoYrecomendaciones;
    private String incapacidad;
    private Paciente paciente;

    public HistoriaClinica() {
        this.horaIngreso = "";
        this.fechaIngreso = "";
        this.diagnosticoYrecomendaciones = "";
        this.incapacidad = "";
        this.paciente = null;
    }

    public HistoriaClinica(String horaIngreso, String fechaIngreso, String diagnosticoYrecomendaciones, String incapacidad, Paciente paciente) {
        this.setHoraIngreso(horaIngreso);
        this.setFechaIngreso(fechaIngreso);
        this.setDiagnosticoYrecomendaciones(diagnosticoYrecomendaciones);
        this.setIncapacidad(incapacidad);
        this.paciente = paciente; // No se necesita validación para Paciente, ya que ya está validado.
    }

    public void setHoraIngreso(String horaIngreso) {
        if (horaIngreso == null || horaIngreso.trim().isBlank() || horaIngreso.matches(".*[-!@#$%^&*()+=<>?/].*")) {
            throw new IllegalArgumentException("Hora ingreso no es valida.");
        }
        this.horaIngreso = horaIngreso.trim();
    }

    public void setFechaIngreso(String fechaIngreso) {
        if (fechaIngreso == null || fechaIngreso.trim().isBlank() || fechaIngreso.matches(".*[!@#$%^&*()+=<>?/].*")) {
            throw new IllegalArgumentException("Fecha ingreso no es valida");
        }
        this.fechaIngreso = fechaIngreso.trim();
    }

    public void setDiagnosticoYrecomendaciones(String diagnosticoYrecomendaciones) {
        if (diagnosticoYrecomendaciones == null || diagnosticoYrecomendaciones.trim().isBlank() || diagnosticoYrecomendaciones.matches(".*[-!@#$%^&*()+=<>?/].*")) {
            throw new IllegalArgumentException("Diagnostico y recomendaciones no es valido");
        }
        this.diagnosticoYrecomendaciones = diagnosticoYrecomendaciones.trim();
    }

    public void setIncapacidad(String incapacidad) {
        if (incapacidad == null || incapacidad.trim().isBlank() || incapacidad.matches(".*[-!@#$%^&*()+=<>?/].*")) {
            throw new IllegalArgumentException("Incapacidad no es valida");
        }
        this.incapacidad = incapacidad.trim();
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getHoraIngreso() {
        return this.horaIngreso;
    }

    public String getFechaIngreso() {
        return this.fechaIngreso;
    }

    public String getDiagnosticoYrecomendaciones() {
        return this.diagnosticoYrecomendaciones;
    }

    public String getIncapacidad() {
        return this.incapacidad;
    }

    public Paciente getPaciente() {
        return this.paciente;
    }

    @Override
    public String toString() {
        return horaIngreso + "," + fechaIngreso + "," + diagnosticoYrecomendaciones + "," + incapacidad + "," + (paciente != null ? paciente.toString() : "Sin paciente");
   //String str;
   //str=String.format("| %-20s | %-20s | %-20s | %-25s |", horaIngreso,fechaIngreso,diagnosticoYrecomendaciones,incapacidad,(paciente != null ? paciente.toString() : "Sin paciente"));
          // return str;
    }
}

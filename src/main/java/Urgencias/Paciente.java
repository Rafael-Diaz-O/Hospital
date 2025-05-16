/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Urgencias;

/**
 *
 * @author valen
 */
public class Paciente {
    
private String eps;
    private String grupoSanguineo;
    private String id;

    public Paciente() {
        this.eps = "";
        this.grupoSanguineo = "";
        this.id = "";
    }

    public Paciente(String eps, String grupoSanguineo, String id) {
        this.setEps(eps);
        this.setGrupoSanguineo(grupoSanguineo);
        this.setId(id);
    }

    public void setEps(String eps) {
        if (eps == null || eps.trim().isBlank() || eps.matches(".*[-!@#$%^&*()+=<>?/].*")) {
            throw new IllegalArgumentException("EPS no es valido.");
        }
        this.eps = eps.trim();
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        if (grupoSanguineo == null || grupoSanguineo.trim().isBlank() || grupoSanguineo.matches(".*[!@#$%^&*()=<>?/].*")) {
            throw new IllegalArgumentException("grupo sanguineo no es valido");
        }
        this.grupoSanguineo = grupoSanguineo.trim();
    }

    public void setId(String id) {
        if (id == null || id.trim().isBlank() || id.matches(".*[-!@#$%^&*()+=<>?/].*")) {
            throw new IllegalArgumentException("ID no es valido.");
        }
        this.id = id.trim();
    }

    public String getEps() {
        return this.eps;
    }

    public String getGrupoSanguineo() {
        return this.grupoSanguineo;
    }

    public String getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return eps + "," + grupoSanguineo + "," + id;
       // String str;
       // str=String.format("| %-20s | %-30s | %-20s |", eps,grupoSanguineo,id);
       // return str;
    }
}


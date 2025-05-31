

package Urgencias.Menu;

import Urgencias.*;
import Urgencias.HistoriaClinica;
import Atencion .*; 

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Menu extends UtilClass {
 /*
    public static ArrayList<HistoriaClinica> readHistoriaClinica(String filePath, ArrayList<Paciente> pacientes) {
        ArrayList<HistoriaClinica> historiaClinicas = new ArrayList<>();
        String line;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            reader.readLine(); // Skip header

            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    System.out.println("Saltar línea vacía en el archivo de historia clínica");
                    continue;
                }

                String[] parts = line.split(",");
                if (parts.length >= 5) {
                    String horaIngreso = parts[0].trim();
                    String fechaIngreso = parts[1].trim();
                    String diagnosticoYrecomendaciones = parts[2].trim();
                    String incapacidad = parts[3].trim();
                    String id = parts[4].trim();
                    Paciente tempA = null;

                    try {
                        for (Paciente a : pacientes) {
                            if (id.equals(a.getId())) {
                                tempA = a;
                                break;
                            }
                        }
                        if (tempA != null) {
                            historiaClinicas.add(new HistoriaClinica(horaIngreso, fechaIngreso, diagnosticoYrecomendaciones, incapacidad, tempA));
                        } else {
                            System.out.println("No se encontró ninguna paciente coincidente para ID: " + id);
                        }
                    } catch (Exception e) {
                        System.out.println("Error al crear el objeto HistoriaClinica: " + e.getMessage());
                    }
                } else {
                    System.out.println("Formato de línea no válido en el archivo de historia clínica: " + line);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo de historia clínicas: " + e.getMessage());
        }
        return historiaClinicas;
    }

    public static ArrayList<Paciente> readPacientes(String filePath) {
        ArrayList<Paciente> pacientes = new ArrayList<>();
        String line;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            reader.readLine(); // Skip header

            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    System.out.println("Omitiendo línea vacía en el archivo de pacientes");
                    continue;
                }

                String[] parts = line.split(",");
                if (parts.length >= 3) {
                    String eps = parts[0].trim();
                    String grupoSanguineo = parts[1].trim();
                    String id = parts[2].trim();

                    try {
                        pacientes.add(new Paciente(eps, grupoSanguineo, id));
                    } catch (Exception e) {
                        System.out.println("Error al crear el objeto Paciente: " + e.getMessage());
                    }
                } else {
                    System.out.println("Formato de línea inválido en el archivo de pacientes: " + line);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo de pacientes:" + e.getMessage());
        }
        return pacientes;
    } */

    public static void main(String[] args) {
        ArrayList<HistoriaClinica> historiaClinicas ;
        ArrayList<Paciente> pacientes;

        System.out.println("Creando la lista de Paciente");
        //pacientes = readPacientes("C:\\Users\\valen\\OneDrive\\Documentos\\SEMESTRE_2025-1\\PROGRAMACION_ORIENTADA_A_OBJETOS\\PROYECTO\\Menu\\info_pacientes.txt");
    pacientes = readPacientes("./info_pacientes.txt");
        System.out.println("\nINFORMACION DE PACIENTES");
        for (Paciente p : pacientes) {
            System.out.println(p.toString());
        }
       
        System.out.println("\nINFORMACION DE HISTORIA CLINICA");
        
        /*for (HistoriaClinica u : historiaClinicas) {
            System.out.println(u.toString());
        }
        */

        System.out.println("\nCreando lista de Historias Clinicas");
       // historiaClinicas = readHistoriaClinica("C:\\Users\\valen\\OneDrive\\Documentos\\SEMESTRE_2025-1\\PROGRAMACION_ORIENTADA_A_OBJETOS\\PROYECTO\\\\Menu\\info_historiaClinicas.txt", pacientes);
        historiaClinicas = readHistoriaClinica("./info_historiaClinicas.txt",pacientes);
        System.out.println("\nINFORMATION DE HISTORIAS CLINICAS\n");
       // System.out.println("| %-15s | %-15s | %-20s | %-25s | %-15s | %-10s | %-10s |\n","HORA","FECHA","DIAGNOSTICO","EPS","TIPO DE SAGRE","ID");
        //for (HistoriaClinica h : historiaClinicas) {
        //    System.out.println(h.toString());
        System.out.printf("| %-15s | %-15s | %-20s | %-25s | %-15s | %-16s | %-15s |\n",
                  "Hora Ingreso", "Fecha Ingreso", "Diagnostico", "Incapacidad",
                  "EPS", "Grupo Sanguineo", "ID Paciente");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");

       // }
       for (HistoriaClinica h : historiaClinicas) {
    Paciente p = h.getPaciente();
    System.out.printf("| %-15s | %-15s | %-20s | %-25s | %-15s | %-16s | %-15s |\n",
                      h.getHoraIngreso(), h.getFechaIngreso(), h.getDiagnosticoYrecomendaciones(),
                      h.getIncapacidad(),
                      p != null ? p.getEps() : "Sin paciente",
                      p != null ? p.getGrupoSanguineo() : "Sin paciente",
                      p != null ? p.getId() : "Sin paciente");
}
       
   
       //Parte de Rafael 
       
        System.out.println(" \n\t\t\t\t HISTORIA CLINICA ");
        
         System.out.println("\n\t\t\t\tPROCESANDO LA INFORMACION.... ");
        
         
        ArrayList <Cirujano> cirujanos  = leerCirujano("./Informacion_cirujias.txt");
        
        
        System.out.println("\n\t\t\t\tRESULTADO ");
        for(Cirujano c: cirujanos){
            System.out.println(c.toString());
        }
        
        
        escribirCirujano("./Informacion_cirujias.txt", cirujanos);
       
    }
}

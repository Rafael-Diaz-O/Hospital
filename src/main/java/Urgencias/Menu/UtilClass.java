
package Urgencias.Menu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import Atencion.*;
import Urgencias.HistoriaClinica;
import Urgencias.Paciente;

public class UtilClass {
    
    
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
    }
    public static ArrayList<Cirujano> leerCirujano(String filePath){
    
    ArrayList  <Cirujano> cirujanos = new ArrayList<>();
    
    String encabezado = ""; 
    String nombre = "";
    String cedula = "" ;
    String genero = ""; 
    String quirofano = "";
    String tipoProcedimiento = ""; 
    String fechaProcedimiento = "";
    String horaProcedimiento = "" ;
    int edad = 0;
    
     try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
       reader.readLine();
      while((encabezado=reader.readLine())!=null){
                
                String[] parts = encabezado.split(",");
                
                if(parts.length>=7){
                    nombre = parts[0];
                    cedula = parts[1];
                    edad = Integer.parseInt(parts[2]);
                    genero = parts[3];
                    quirofano = parts[4];
                    tipoProcedimiento = parts[5];
                    fechaProcedimiento = parts [6];
                    horaProcedimiento = parts[7];
                    
                    
                    try{
                        cirujanos.add(new Cirujano(nombre,cedula,edad,genero,quirofano,tipoProcedimiento,
                                fechaProcedimiento,horaProcedimiento));
                    }catch(Exception e){
                        System.out.println("Error al crear el objecto: " + e.getMessage());
                    }
                }else{
                    System.out.println("No hay suficientes datos para crear el objeto");
                }
                
            }
            
            reader.close();
            
        } catch (IOException e) {
            System.err.println("Error en la lectura del archivo: " + e.getMessage());
        }
        return cirujanos;
    }
         
     public static  void escribirCirujano(String filePath, ArrayList<Cirujano> cirujanos){
         
         try (BufferedWriter escribir = new BufferedWriter(new FileWriter(filePath,true))){
         escribir.write("Lista de cirujias");
         escribir.write(""); 
         escribir.newLine();
         
         String linea = ""; 
          for (Cirujano  c: cirujanos){
              
              linea = c.toString(); 
              escribir.write(linea);
              escribir.newLine();
              
          }
          escribir.close(); 
         System.out.println("\nArchivo creado : " + filePath);
          
         }catch (IOException e){
             System.err.println("Error: No se pudo crear el archivo " + e.getMessage());
         }
         
         
     }
     
     
    
    
}


package Urgencias.Menu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import Atencion.*;

public class UtilClass {
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
                        System.out.println("Error creating the object: " + e.getMessage());
                    }
                }else{
                    System.out.println("No hay suficientes datos para crear el objeto");
                }
                
            }
            
            reader.close();
            
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return cirujanos;
    }
         
     
    
    
}

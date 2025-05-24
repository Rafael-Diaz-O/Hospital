
package Urgencias.Menu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import Atencion.Cirujano;

public class UtilClass {
     public static ArrayList<Cirujano> leerCirujano(String filePath){
    
    ArrayList  <Cirujano> cirujanos = new ArrayList<>();
    
    String encabezado = ""; 
    String nombre = "";
    String cedula = "" ;
    String genero = ""; 
    String quirofano = "";
    String tipoProcedimiento = ""; 
    String fechaProcedmiento = "";
    String horaProcedimiento = "" ;
    int edad = 0;
    
     try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
       reader.readLine();
      while((encabezado=reader.readLine())!=null){
                
                String[] parts = encabezado.split(",");
                
                if(parts.length>=7){
                    nombre = parts[0];
                    cedula = parts[1];
                    quirofano = parts[2];
                    tipoProcedimiento = parts[3];
                    horaProcedimiento = parts[4];
                    edad = Integer.parseInt(parts[5]);
                    
                   
                   
                    
                    try{
                        books.add(new Book(name,value,authorName,id,nationality));
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

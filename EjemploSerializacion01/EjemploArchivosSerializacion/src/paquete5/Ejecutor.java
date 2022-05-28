/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

/**
 *
 * @author SALA I
 */
public class Ejecutor {
    public static void main(String[] args) {

        // nombre del archivo
        String nombreArchivo = "data/hospitales.data";
        
        Hospital h1 = new Hospital("Isidro Ayora", 
                650, 6666.66,"11235d");
        Hospital h2 = new Hospital("SOLCA", 
                500, 777.77,"11325f");
        Hospital h3 = new Hospital("San Agustin", 
                1000, 1245.87,"11245h");

        EscrituraArchivoSecuencial archivo = 
                new EscrituraArchivoSecuencial(nombreArchivo);
        
        // establecer el valor del atributo registro
        archivo.establecerRegistro(h1);
        // establecer en el archivo el atributo del registro
        archivo.establecerSalida();
        archivo.establecerRegistro(h2);
        archivo.establecerSalida();
        archivo.establecerRegistro(h3);
        archivo.establecerSalida();
        archivo.cerrarArchivo();
        
        LecturaArchivoSecuencial lectura = 
                new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerListaHospital();
        System.out.println(lectura);
    }
    
}

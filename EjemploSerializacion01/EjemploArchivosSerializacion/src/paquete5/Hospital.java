/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Hospital implements Serializable{
    String nombre;
    int numeroCamas;
    double presupuesto;
    String idHospital;
    
    public Hospital(String n, int d,double c,String m){
        nombre = n;
        numeroCamas = d;
        presupuesto = c;
        idHospital = m;
    }
    
    public void establecerNombre(String n){
        nombre = n;        
    }
    
    public void estabablecerNumCamas(int d){
        numeroCamas = d;
    }
    
    public void establecerPresupuesto(double c){
        presupuesto = c;
    }
    
    public void establecerIdHospital(String m){
        idHospital = m;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public int obtenerNumCamas(){
        return numeroCamas;
    }
    
    public double obtenerPresupuesto(){
        return presupuesto;
    }
    
    public String obtenerIdHospital(){
        return idHospital;
    }
    
    @Override
    public String toString() {
        String p = String.format("%s;%d;%.2f;%s",
                    nombre,
                    numeroCamas,
                    presupuesto,
                    idHospital);
        return p;
    }
    

    
}
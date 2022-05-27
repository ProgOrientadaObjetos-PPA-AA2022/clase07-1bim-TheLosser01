/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

/**
 *
 * @author reroes
 */
public class Hospital {
    String nombreHospital;
    int numeroCamas;
    double presupuesto;
    
    public void establecerNombre(String n){
        nombreHospital = n;
    }
    
    public void establecerNumCamas(int c){
        numeroCamas = c;
    }
    
    public void establecerPresupuesto(double c){
        presupuesto = c;
    }
    
    public String obtenerNombre(){
        return nombreHospital;
    }
    
    public int obtenerNumCamas(){
        return numeroCamas;
    }
    
    public double obtenerPresupuesto(){
        return presupuesto;
    }
}

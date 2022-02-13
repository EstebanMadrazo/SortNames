/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author Esteban Madrazo
 */
public class Ortografo {
    private List nombres;

    public Ortografo(List nombres) {
        this.nombres = nombres;
    }

    public List getNombres() {
        return nombres;
    }

    public void setNombres(List nombres) {
        this.nombres = nombres;
    }
    
    public void Ordenar(){
        Collections.sort(getNombres()); 
    }
    
    public void PonerMayusculas(){
        String nombre;
        String resultado;
        for (int i = 0 ; i < getNombres().size() ; i++){
            nombre = (String) getNombres().get(0) ;
            resultado = nombre.toUpperCase().charAt(0) + nombre.substring(1, nombre.length()).toLowerCase();
            getNombres().remove(0);
            getNombres().add(resultado);
            
        }
    }
    
}

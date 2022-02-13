/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Applicacion;

import Modelo.Lector;
import Modelo.Ortografo;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author sonic
 */
public class Ejecutar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List nombres = new LinkedList<String>();
        Lector lector = new Lector(nombres,"Nombres.txt");
        lector.LeerTxt();
        Ortografo ortografo = new Ortografo(nombres);
        ortografo.Ordenar();
        ortografo.PonerMayusculas();
        
        for (Object nombre : nombres) {
            System.out.println(nombre);
        }
        
    }
    
}

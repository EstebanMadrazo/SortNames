/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author sonic
 */
public class Lector {
    private List nombres;
    private String ruta;

    public Lector(List nombres, String ruta) {
        this.nombres = nombres;
        this.ruta = ruta;
    }

    public List getNombres() {
        return nombres;
    }

    public void setNombres(List nombres) {
        this.nombres = nombres;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

   
    
    public void LeerTxt(){
        File archivo = null;
        FileReader lectorArchivo = null;
        BufferedReader lectorBufer = null;
        
        try {
            archivo = new File (getRuta());
            if (!archivo.exists()) {
                archivo.createNewFile();
            }
            String nombre;
            lectorArchivo = new FileReader (archivo);
            lectorBufer = new BufferedReader(lectorArchivo);
            while((nombre=lectorBufer.readLine())!=null){
                getNombres().add(nombre);
            }
            
        }//FIN DEL TRY
        catch(IOException e){
            System.out.println(e);
        }
        finally{
            try{ //el bloque finally se ejecuta siempre, por eso, si se cierra el fichero
                if( lectorArchivo != null){ //al final del primer try, y ha dado un error antes, pasaría
                    lectorArchivo.close(); //al 1er catch y luego saldría, dejándolo abierto. Es conveniente
                } //cerrarlo aquí, comprobando que no sea -por un error anterior, como
            }catch (IOException e){ // no tener permisos de lectura o que no exista - de valor null.
            }
        }
    }   
    
}

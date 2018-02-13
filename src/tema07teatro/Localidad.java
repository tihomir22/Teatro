/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema07teatro;

import java.util.ArrayList;

/**
 *
 * @author mati
 */
public class Localidad {
    private String nombre;
    private int nTeatro;
    private ArrayList<Teatro> teatros = new ArrayList<Teatro>();

    public ArrayList<Teatro> getTeatros() {
        return teatros;
    }

    public void setTeatros(ArrayList<Teatro> teatros) {
        this.teatros = teatros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getnTeatro() {
        return nTeatro;
    }

    public void setnTeatro(int nTeatro) {
        this.nTeatro = nTeatro;
    }

    public Localidad(String nombre, int nTeatro) {
        this.nombre = nombre;
        this.nTeatro = nTeatro;
    }
    public void añadirTeatro(){
        
    }
    public int buscarTeatro(String nombre){
        for(int i=0;i<this.teatros.size();i++){
            if(this.teatros.get(i).getActiva().getNombre().equalsIgnoreCase(nombre)){
                return i;
            }
        
        }
        return -1;
    
    }
}

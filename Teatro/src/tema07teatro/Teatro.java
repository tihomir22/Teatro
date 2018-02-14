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
public class Teatro {

    private String nombre;
    private int nAsiento;
    private ArrayList<Funcion> funciones = new ArrayList<Funcion>();
    private Funcion activa;

    public Funcion getActiva() {
        return activa;
    }

    public void setActiva(Funcion activa) {
        this.activa = activa;
    }

    public Teatro(String nombre, int nAsiento) {
        this.nombre = nombre;
        this.nAsiento = nAsiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getnAsiento() {
        return nAsiento;
    }

    public void setnAsiento(int nAsiento) {
        this.nAsiento = nAsiento;
    }

    public ArrayList<Funcion> getFunciones() {
        return funciones;
    }

    public void setFunciones(ArrayList<Funcion> funciones) {
        this.funciones = funciones;
    }

    public void añadirFuncion(Funcion f) {
        this.funciones.add(f);

    }

    public void modificarFuncion(double precio, Funcion f) {
        f.setPrecio(precio);
    }
    public int buscarFuncion(String nombre){
        for(int i=0;i<this.funciones.size();i++){
            if(this.funciones.get(i).getNombre().equalsIgnoreCase(nombre)){
                return i;
            }
        }
        return -1;
    }

}

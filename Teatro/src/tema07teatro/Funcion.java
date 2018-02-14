/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema07teatro;

/**
 *
 * @author mati
 */
public class Funcion {

    private String id;
    private String nombre;
    private double precio;
    private int nAsientosLibres;
    private String fecha;
    private String hrepre;

    public Funcion(String id, String nombre, double precio, int nAsientosLibres, String fecha, String hrepre) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.nAsientosLibres = nAsientosLibres;
        this.fecha = fecha;
        this.hrepre = hrepre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getnAsientosLibres() {
        return nAsientosLibres;
    }

    public void setnAsientosLibres(int nAsientosLibres) {
        this.nAsientosLibres = nAsientosLibres;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHrepre() {
        return hrepre;
    }

    public void setHrepre(String hrepre) {
        this.hrepre = hrepre;
    }

    public void mostrarFuncion() {
        System.out.println("*************************************************");
        System.out.println("El id es : " + this.id);
        System.out.println("Nombre : " + this.nombre);
        System.out.println("Precio : " + this.precio);
        System.out.println("Numero de asientos libres : " + this.nAsientosLibres);
        System.out.println("La fecha de la funcion : " + this.fecha);
        System.out.println("La hora de representacion es " + this.hrepre);
        System.out.println("*************************************************");
    }

}

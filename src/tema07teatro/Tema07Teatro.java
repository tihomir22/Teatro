/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema07teatro;

import java.util.Scanner;

/**
 *
 * @author mati
 */
public class Tema07Teatro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Localidad local1 = null;
        Teatro teatro = null;
        Funcion funcion1=null;
        int numCorre=1,opcion, numT, numA;
        
        String nombre, nomTe;
        Scanner teclado = new Scanner(System.in);

        local1 = new Localidad();
        System.out.println("Introduce nombre de localidad");
        teclado.nextLine();
        nombre = teclado.nextLine();
        local1.setNombre(nombre);
        System.out.println("Introduce numero de teatros");
        numT = teclado.nextInt();
        local1.setnTeatro(numT);
        while (numT > 0) {
            teatro = new Teatro();
            System.out.println("Introduce nombre del teatro");
            teclado.nextLine();
            nomTe = teclado.nextLine();
            teatro.setNombre(nomTe);
            System.out.println("Introduce numero asientos");
            numA = teclado.nextInt();
            teatro.setnAsiento(numA);
            local1.getTeatros().add(teatro);

            numT--;
        }
        do {
            mostrarMenu();
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Introduzca nombre del teatro al que gestionar");
                    teclado.nextLine();
                    nomTe = teclado.nextLine();
                    if (local1.buscarTeatro(nomTe) != -1) {
                        funcion1=new Funcion();
                        funcion1.setId(numCorre);
                        System.out.println("Introduzca nombre de la funcion");
                        nombre=teclado.nextLine();
                        if(funcion1.)
                    }else{
                        System.out.println("No puedes gestionar un teatro que no existe");
                    }
                    break;
            }
        } while (opcion != 0);
    }

    public static void mostrarMenu() {
        System.out.println("1.-Añadir funcionesa un teatro");
        System.out.println("2.-Gestion de reserva");
        System.out.println("0.-Para salir");
    }

}

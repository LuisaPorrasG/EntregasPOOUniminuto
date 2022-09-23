/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entrega3;

import Entrega3.Conjunto;
import java.util.ArrayList;
import java.util.Scanner;

public class ConjuntoNumeros {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        int numeroIngresar ;
        short fin=1;
        
        ArrayList<Conjunto> list= new ArrayList <> ();
        do{
            System.out.println("Introduzca un número para agregar al conjunto: ");
            numeroIngresar = entrada.nextInt(); 
            Conjunto myConjunto = new Conjunto (numeroIngresar);
            list.add(myConjunto);
            System.out.println(""+myConjunto);
            System.out.println("/////////////////////////////////////////");
            System.out.println("Para ver promedio presione | 0 |");
            System.out.println("Para agregar un nuevo número presione | 1 |");
            System.out.println("/////////////////////////////////////////");
            fin = entrada.nextShort();
        }while(fin!=0);
        Conjunto myConjunto1 = new Conjunto ();
        myConjunto1.setListaConjunto(list);
        System.out.println("- Promedio global es: "+ myConjunto1.Promedio());
        System.out.println("- La suma de los numeros del conjunto es :" + myConjunto1.Suma());
        
    }
 }
    

        


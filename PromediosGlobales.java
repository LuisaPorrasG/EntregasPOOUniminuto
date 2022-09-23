
package Entrega3;


import java.util.ArrayList;
import java.util.Scanner;

/**
 
 2.	El departamento escolar de la facultad de ingeniería necesita obtener un reporte global
 * de los promedios de sus alumnos y que muestre el promedio de cada uno. Se debe crear una clase
 * Alumno usando todos los atributos y métodos que se consideren necesarios. 
 
 */
public class PromediosGlobales {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        String nombre ="";
        double promedio = 0;
        short fin = 1;
        ArrayList<Estudiante> list= new ArrayList <> ();
        do{
            System.out.println("Introduzca su Nombre: ");
            nombre = entrada.next();
            System.out.println("Introduzca su Promedio: ");
            promedio =entrada.nextDouble();
          
            Estudiante listaEstudiante = new Estudiante(nombre, promedio); //instancia objeto
            list.add(listaEstudiante);
            System.out.println(""+listaEstudiante);
            System.out.println("/////////////////////////////////////////");
            System.out.println("Para ver promedio global presione | 0 |");
            System.out.println("Para agregar un nuevo estudiante presione | 1 |");
            fin = entrada.nextShort();

           
        }while (fin!=0);
        
        Estudiante myEstudent = new Estudiante ();
        myEstudent.setListaPromedios(list);
        System.out.println("Promedio global es: "+ myEstudent.promedios());
        
    }
}

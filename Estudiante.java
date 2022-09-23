
package Entrega3;

import java.util.ArrayList;

/**
 2.	El departamento escolar de la facultad de ingeniería necesita obtener un reporte global
 * de los promedios de sus alumnos y que muestre el promedio de cada uno. Se debe crear una clase
 * Alumno usando todos los atributos y métodos que se consideren necesarios. 
 */
public class Estudiante {
    
    private String nombreEstudiante = "";
    private double promedioEstudiante= 0.0;
    private  ArrayList <Estudiante> listaPromedios = new ArrayList<>();

    //CONTRUCTOR
    public Estudiante(String nombreEstudiante, double promedioEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
        this.promedioEstudiante= promedioEstudiante;
    }
    public Estudiante(){
    
    }

   //GETTERS Y SETETERS
    public String getNombreEstudiante() {
        return nombreEstudiante;
    }



    public void setNombreEstudiante(String nombreEstudianet) {
        this.nombreEstudiante = nombreEstudianet;
    }

    public Double getPromedioEstudiante() {
        return promedioEstudiante;
    }

    public void setPromedioEstudiante(double promedioEstudiante) {
        this.promedioEstudiante = promedioEstudiante;
    }
    
    public  ArrayList<Estudiante> getListaPromedios() {
        return listaPromedios;
    }

    public  void setListaPromedios(ArrayList<Estudiante> listaPromedios) {
       this.listaPromedios = listaPromedios;
       
    }
    
    // METODOS
    public  double promedios (){
        double additionPromedio=0;
        for (int i=0; i< listaPromedios.size();i++){ //menor al tamaño que tiene la lista
        additionPromedio = additionPromedio+ listaPromedios.get(i).getPromedioEstudiante();//aditionAge es igual a aditiona la edad de las edades de la lista.
          }
        return additionPromedio/listaPromedios.size();// la suma de las edades de divide en la el tamano de la lista
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Estudiante{Nombre Estudiante= ").append(nombreEstudiante);
        sb.append(", Promedio Estudiante= ").append(promedioEstudiante);
       // sb.append(", listaPromedios=").append(listaPromedios);
        sb.append('}');
        return sb.toString();
    }

  
    
}
 
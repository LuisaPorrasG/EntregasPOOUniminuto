
package Entrega3;

import java.util.ArrayList;

/**
 * 3. Encontrar suma y promedio de un conjunto de números donde no se conoce la
 * cantidad de datos
 */
public class Conjunto {
    private ArrayList<Conjunto> listaConjunto = new ArrayList<>();
    private int numeros;

    public Conjunto() {
        this.numeros = 0;
    }

    public Conjunto(int numeros) {
        this.numeros = numeros;
    }

    public ArrayList<Conjunto> getListaConjunto() {
        return listaConjunto;
    }

    public void setListaConjunto(ArrayList<Conjunto> listaConjunto) {
        this.listaConjunto = listaConjunto;
    }

    public int getNumeros() {
        return numeros;
    }

    public void setNumeros(int numeros) {
        this.numeros = numeros;
    }

    public double Promedio() {
        double additionNumer = 0;
        for (int i = 0; i < listaConjunto.size(); i++) { // menor al tamaño que tiene la lista
            additionNumer = additionNumer + listaConjunto.get(i).getNumeros();// aditionAge es igual a adiciona la edad
                                                                              // de las edades de la lista.
        }
        return additionNumer / listaConjunto.size();// la suma de los numeros de la lista dividivo el tamaño de la lista
    }

    public long Suma() {
        int suma = 0;

        for (int x = 0; x < listaConjunto.size(); x++) {
            suma = suma + listaConjunto.get(x).getNumeros();
        }
        return suma;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        // sb.append("Conjunto{listaConjunto= ").append(listaConjunto);
        sb.append("numero= ").append(numeros);
        sb.append('}');
        return sb.toString();
    }

}

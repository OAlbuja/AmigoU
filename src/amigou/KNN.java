/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package amigou;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class KNN {
    private AmigoU amigoU;

    public KNN(AmigoU amigoU) {
        this.amigoU = amigoU;
    }

    public List<Usuario> obtenerVecinosMasCercanos(Usuario usuario, int k) {
        List<Usuario> usuarios = amigoU.getListaUsuarios();

        // Calcular la distancia euclidiana entre el usuario dado y cada uno de los usuarios en la lista
        for (Usuario u : usuarios) {
            double distancia = calcularDistanciaEuclidiana(usuario.getIntereses(), u.getIntereses());
            u.setDistancia(distancia);
        }

        // Ordenar la lista de usuarios por distancia (del usuario más cercano al más lejano)
        Collections.sort(usuarios, new Comparator<Usuario>() {
            @Override
            public int compare(Usuario o1, Usuario o2) {
                return Double.compare(o1.getDistancia(), o2.getDistancia());
            }
        });

        // Devolver los k vecinos más cercanos
        return usuarios.subList(0, k);
    }

    private double calcularDistanciaEuclidiana(List<Integer> intereses1, List<Integer> intereses2) {
        double suma = 0.0;
        for (int i = 0; i < intereses1.size(); i++) {
            int diferencia = intereses1.get(i) - intereses2.get(i);
            suma += diferencia * diferencia;
        }
        return Math.sqrt(suma);
    }
}




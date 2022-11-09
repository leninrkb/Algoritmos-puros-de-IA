package BusquedaNoInformada;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Auto inicial = new Auto();
        inicial.recorrido.add(new Camino(0,"c0"));

        List<Auto> estados = new ArrayList<>();
        List<Auto> temp = new ArrayList<>();
        List<Auto> arbol = new ArrayList<>();
        estados = Algoritmo.generarEstados(inicial);

        int itera = estados.size();
        for (int i = 0; i < itera; i++) {
            temp = Algoritmo.generarEstados(estados.get(i));
            if (temp != null) {
                for (int j = 0; j < temp.size(); j++) {
                    if (!arbol.contains(temp.get(j))) {
                        arbol.add(temp.get(j));
                    }
                }
                if (i+1 >= itera) {
                    estados.removeAll(estados);
                    for (Auto auto : arbol) {
                        estados.add(auto);
                    }
                    itera = estados.size();
                }
            }else{
                break;
            }
            
        }

        int j =0;
        for (int i = 0; i < arbol.size(); i++) {
            if (arbol.get(i).recorrido.get(arbol.get(i).recorrido.size()-1).id == "c26") {
                Algoritmo.imprimirRuta(arbol.get(i));
                System.out.print("{28}");
                j++;
            }
            if (arbol.get(i).recorrido.get(arbol.get(i).recorrido.size()-1).id == "c27") {
                Algoritmo.imprimirRuta(arbol.get(i));
                System.out.print("{28}");
                j++;
            }
            if (arbol.get(i).recorrido.get(arbol.get(i).recorrido.size()-1).id == "c28") {
                Algoritmo.imprimirRuta(arbol.get(i));
                j++;
            }
        }
        System.out.println("soluciones: "+j);


    }
}

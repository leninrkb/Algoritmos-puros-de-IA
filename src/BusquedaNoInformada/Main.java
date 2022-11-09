package BusquedaNoInformada;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Auto inicial = new Auto();
        inicial.recorrido.add(new Camino(0,"c0"));

        List<Auto> estados = new ArrayList<>();
        estados = Algoritmo.generarEstados(inicial);

        List<Auto> nuevos = new ArrayList<>();
        List<Auto> temp = new ArrayList<>();
        int i = 0;
        do{
            for (Auto auto : estados) {
                if (auto.recorrido.get(auto.recorrido.size()-1)==null) {
                    break;
                }
                nuevos = Algoritmo.generarEstados(auto);
                for (Auto auto2 : nuevos) {
                    temp.add(auto2);
                }
            }
            if (nuevos==null) {
                break;
            }
            for (Auto auto2 : temp) {
                if (!estados.contains(auto2)) {
                    estados.add(auto2);
                }
            }
            temp.removeAll(temp);
            i++;
        }while(true);

        
        List<Auto> soluciones = new ArrayList<>();
        for (Auto auto : estados) {
            List<Camino> c = auto.recorrido;
            if (c.get(c.size()-1).id == "c28") {
                Algoritmo.imprimirRuta(auto);
                soluciones.add(auto);
            }
        }

        System.out.println("soluciones: "+soluciones.size());

    }
}

package BusquedaInformada;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Auto a = new Auto();
        a.recorrido.add(new Camino(0, "c0"));
        //Algoritmo.imprimirRuta(a);

        List<Auto> estadosHijo = new ArrayList<>();
        estadosHijo = Algoritmo.generarEstados(a);
        Auto b = new Auto();
        int i =0;
        do {            
            b = Algoritmo.seleccionarHijo(estadosHijo);
            if(Algoritmo.esSolucion(b)){
                break;
            }
            estadosHijo.remove(b);
            for (Auto auto : Algoritmo.generarEstados(b)) {
                estadosHijo.add(auto);
            }
            i++;
            if (i%1 == 0) {
                System.out.println(i);
                
            }
        } while (true);
        System.out.println("nodos formados: "+estadosHijo.size());
        Algoritmo.imprimirRuta(b);
    }
}

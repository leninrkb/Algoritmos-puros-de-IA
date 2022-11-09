package BusquedaInformada;

import java.util.ArrayList;
import java.util.List;

public class Algoritmo {

    static boolean esSolucion(Auto b){
        int last = b.recorrido.size() - 1;
        if(b.recorrido.get(last).id == "c28"){
            return true;
        }
        return false;
    }

    static Auto seleccionarHijo(List<Auto> hijos){
        Auto a = new Auto();
        a = hijos.get(0);
        for (int i = 0; i < hijos.size(); i++) {
            if (hijos.get(i).fn() < a.fn()) {
                a = hijos.get(i);
            }
        }
        return a;
    }

    static List<Auto> generarEstados(Auto a) {
        List<Camino> caminos = new ArrayList<>();
        List<Auto> nuevos = new ArrayList<>();
        int last = a.recorrido.size() - 1;
        caminos = Mapa.tomarCaminos(a.recorrido.get(last));
        for (Camino camino : caminos) {
            Auto n = new Auto();
            copiarLista(a, n);
            n.recorrido.add(camino);
            nuevos.add(n);
        }
        return nuevos;
    }

    ///////////// utils
    static int random(int ini, int fin) {
        int valorEntero = (int) Math.floor(Math.random() * (fin - ini + 1) + ini);
        return valorEntero;
    }

    static void imprimirRuta(Auto a) {
        System.out.println("--- inicio ---");
        for (int i = 0; i < a.recorrido.size(); i++) {
            System.out.print("{" + a.recorrido.get(i).id + "},");
        }
        System.out.println("\n--- fin ---\n");
    }

    static void copiarLista(Auto p, Auto h){
        for (Camino i : p.recorrido) {
            h.recorrido.add(i);
        }
    }

}

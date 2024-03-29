package Geneticos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Algoritmo a = new Algoritmo();
        List<Auto> autosGeneral = new ArrayList<>();
        autosGeneral = Algoritmo.generarPoblacion(30);

        List<Auto> autosInicial = new ArrayList<>();
        autosInicial = Algoritmo.seleccionarPoblacionInicial(autosGeneral);

        List<Auto> padres = new ArrayList<>();
        List<Auto> hijos = new ArrayList<>();

        int i = 0;
        int div = 1;
        int record = 8;

        do {

            padres = Algoritmo.seleccionarPadres(autosInicial);
            hijos = Algoritmo.cruzar(padres);
            if (hijos.get(0).recorrido.size() <= record) {
                break;
            }

            if (hijos.get(1).recorrido.size() <= record) {
                break;
            }

            hijos = Algoritmo.mutar(hijos);

            if (hijos.get(0).recorrido.size() <= record) {
                break;
            }

            if (hijos.get(1).recorrido.size() <= record) {
                break;
            }

            autosInicial.remove(padres.get(0));
            autosInicial.remove(padres.get(1));

            autosInicial.add(hijos.get(0));
            autosInicial.add(hijos.get(1));
            i++;
            if (i > 100) {
                div = 100;
            }
            if (i > 1000) {
                div = 1000;
            }
            if (i > 10000) {
                div = 10000;
            }
            if (i > 100000) {
                div = 100000;
            }
            if (i%div == 0) {
                System.out.println(i);
            }
        } while (true);

        System.out.println("hijo 1 -----------------------");
        Algoritmo.imprimirRuta(hijos.get(0));
        System.out.println(hijos.get(0).recorrido());

        System.out.println("hijo 2 -----------------------");
        Algoritmo.imprimirRuta(hijos.get(1));
        System.out.println(hijos.get(1).recorrido());

    }

}

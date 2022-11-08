package Geneticos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Algoritmo {
    static List<Camino> recorrido;

    Algoritmo() {
        recorrido = new ArrayList<>();
    }

    static List<Auto> mutar(List<Auto> hijos){
        List<Auto> nuevos = new ArrayList<>();
        Auto m = hijos.get(random(0, hijos.size()-1));
        Auto mutado = new Auto();
        hijos.remove(m);
        nuevos.add(hijos.get(0));

        double[] vcorte = { 0.1, 0.15, 0.20 };
        int c = (int) Math.floor(m.recorrido.size() * vcorte[random(0, vcorte.length - 1)]);
        int corte = random(1, c);

        for (int i = 0; i < corte; i++) {
            mutado.recorrido.add(m.recorrido.get(i));
        }
        recorrido = new ArrayList<>();
        generarRuta(mutado.recorrido.get(mutado.recorrido.size()-1));
        for (int i = 0; i < vcorte.length; i++) {
            mutado.recorrido.add(recorrido.get(i));
        }
        nuevos.add(mutado);

        return nuevos;
    }

    static List<Auto> cruzar(List<Auto> padres) {

        List<Auto> nuevos = new ArrayList<>();
        Auto h1 = new Auto();
        Auto h2 = new Auto();

        int l1 = padres.get(0).recorrido.size();
        int l2 = padres.get(1).recorrido.size();
        int corte = 0;
        double[] vcorte = { 0.15, 0.20};

        if (l1 < l2) {
            // l1
            int c = (int) Math.floor(l1 * vcorte[random(0, vcorte.length - 1)]);
            corte = random(1, c);

            if (padres.get(0).recorrido.get(corte) == padres.get(1).recorrido.get(corte)) {
                for (int i = 0; i < corte; i++) {
                    h1.recorrido.add(padres.get(0).recorrido.get(i));
                    h2.recorrido.add(padres.get(1).recorrido.get(i));
                }
                for (int i = corte; i < l2; i++) {
                    h1.recorrido.add(padres.get(1).recorrido.get(i));
                }
                for (int i = corte; i < l1; i++) {
                    h2.recorrido.add(padres.get(0).recorrido.get(i));
                }
            } else {
                for (int i = corte; i < l2; i++) {
                    if (padres.get(0).recorrido.get(corte) == padres.get(1).recorrido.get(i)) {
                        for (int j = 0; j < corte; j++) {
                            h1.recorrido.add(padres.get(0).recorrido.get(j));
                        }
                        for (int j = 0; j < i; j++) {
                            h2.recorrido.add(padres.get(1).recorrido.get(j));
                        }
                        for (int j = i; j < l2; j++) {
                            h1.recorrido.add(padres.get(1).recorrido.get(j));
                        }
                        for (int j = corte; j < l1; j++) {
                            h2.recorrido.add(padres.get(0).recorrido.get(j));
                        }
                        break;
                    }
                }
            }
        } else {
            // l2
            int c = (int) Math.floor(l2 * vcorte[random(0, vcorte.length - 1)]);
            corte = random(1, c);

            if (padres.get(1).recorrido.get(corte) == padres.get(0).recorrido.get(corte)) {
                for (int i = 0; i < corte; i++) {
                    h1.recorrido.add(padres.get(0).recorrido.get(i));
                    h2.recorrido.add(padres.get(1).recorrido.get(i));
                }
                for (int i = corte; i < l2; i++) {
                    h1.recorrido.add(padres.get(1).recorrido.get(i));
                }
                for (int i = corte; i < l1; i++) {
                    h2.recorrido.add(padres.get(0).recorrido.get(i));
                }
            } else {
                for (int i = 0; i < l1; i++) {
                    if (padres.get(1).recorrido.get(corte) == padres.get(0).recorrido.get(i)) {
                        for (int j = 0; j < corte; j++) {
                            h1.recorrido.add(padres.get(1).recorrido.get(j));
                        }
                        for (int j = 0; j < i; j++) {
                            h2.recorrido.add(padres.get(0).recorrido.get(j));
                        }
                        for (int j = i; j < l2; j++) {
                            h1.recorrido.add(padres.get(0).recorrido.get(j));
                        }
                        for (int j = corte; j < l1; j++) {
                            h2.recorrido.add(padres.get(1).recorrido.get(j));
                        }
                        break;
                    }
                }
            }

        }

        nuevos.add(h2);
        nuevos.add(h1);
        return nuevos;
    }

    static List<Auto> seleccionarPadres(List<Auto> autosInicial) {
        List<Auto> aux = new ArrayList<>();
        List<Auto> nuevos = new ArrayList<>();
        List<Auto> candidatos = new ArrayList<>();

        int denominador = autosInicial.size();
        Auto f = autosInicial.get(random(0, autosInicial.size() - 1));
        autosInicial.remove(f);
        nuevos.add(f);

        for (Auto auto : autosInicial) {
            aux.add(auto);
        }

        int iteraciones = autosInicial.size();
        int suma = 0;
        int porc = 0;
        for (int i = 0; i < iteraciones; i++) {
            candidatos.add(mayorRecorrido(aux));
        }
        for (int i = 0; i < candidatos.size(); i++) {
            candidatos.get(i).peso = ((i + 1) * 100) / denominador;
            suma += candidatos.get(i).peso;
        }
        for (int i = 0; i < candidatos.size(); i++) {
            candidatos.get(i).prob = (int) Math.floor((candidatos.get(i).peso * 100) / suma);
            porc += candidatos.get(i).prob;
        }
        int dif = 100 - porc;
        candidatos.get(candidatos.size() - 1).prob += dif;

        Auto[] vec = new Auto[100];
        Auto seleccionado = new Auto();
        HashMap<Integer, String> nums = new HashMap<>();
        int rand = 0;
        for (int i = 0; i < candidatos.size() - 1; i++) {
            for (int j = 0; j < candidatos.get(i).prob; j++) {
                do {
                    rand = random(0, 99);
                    if (!nums.containsKey(rand)) {
                        nums.put(rand, "");
                        break;
                    }
                } while (true);
                vec[rand] = candidatos.get(i);
            }
        }
        for (int i = 0; i < vec.length; i++) {
            if (vec[i] == null) {
                vec[i] = candidatos.get(candidatos.size() - 1);
            }
        }
        rand = random(0, 99);
        seleccionado = vec[rand];
        nuevos.add(seleccionado);
        autosInicial.remove(seleccionado);

        return nuevos;
    }

    static Auto mayorRecorrido(List<Auto> autosInicial) {
        Auto ind = new Auto();
        ind = autosInicial.get(0);
        for (int i = 0; i < autosInicial.size(); i++) {
            if (ind.recorrido() < autosInicial.get(i).recorrido()) {
                ind = autosInicial.get(i);
            }
        }
        autosInicial.remove(ind);
        return ind;
    }

    public static List<Auto> seleccionarPoblacionInicial(List<Auto> autosGeneral) {
        List<Auto> nuevos = new ArrayList<>();

        int[] c = { 4, 6 };
        int rand = random(0, 1);
        int rand2 = 0;
        for (int i = 0; i < c[rand]; i++) {
            rand2 = random(0, autosGeneral.size() - 1);
            nuevos.add(autosGeneral.get(rand2));
            autosGeneral.remove(autosGeneral.get(rand2));
        }
        return nuevos;
    }

    static List<Auto> generarPoblacion(int densidad) {
        List<Auto> nuevos = new ArrayList<>();

        for (int i = 0; i < densidad; i++) {
            Auto auto = new Auto();
            Camino s = Mapa.caminoC0();
            recorrido.add(s);
            generarRuta(s);
            auto.recorrido = recorrido;
            nuevos.add(auto);
            recorrido = new ArrayList<>();
        }

        return nuevos;
    }

    Mapa m = new Mapa();

    static Camino generarRuta(Camino c) {
        if (c.id == "c28") {
            recorrido.add(c);
            return null;
        }
        Camino cc = Mapa.seleccionarMetodo(c);
        recorrido.add(cc);
        return generarRuta(cc);
    }

    //////////////////////////
    static int random(int ini, int fin) {
        int valorEntero = (int) Math.floor(Math.random() * (fin - ini + 1) + ini);
        return valorEntero;
    }

    static void imprimirRuta(Auto a) {
        for (int i = 0; i < a.recorrido.size(); i++) {
            System.out.print("{" + a.recorrido.get(i).id + "},");
        }
    }

}

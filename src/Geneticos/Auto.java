package Geneticos;

import java.util.ArrayList;
import java.util.List;

public class Auto {
    List<Camino> recorrido = new ArrayList<>();
    int peso;
    int prob;
    int r;

    public int recorrido() {
        for (Camino c : recorrido) {
            r += c.longitud;
        }
        return r;
    }

}

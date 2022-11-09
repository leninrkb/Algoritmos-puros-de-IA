package BusquedaInformada;

import java.util.ArrayList;
import java.util.List;

public class Auto {
    List<Camino> recorrido = new ArrayList<>();
    Auto padre;
    int gn;
    int hn;
    int fn;

    public int hn() {
        hn=0;
        for (Camino c : recorrido) {
            hn += c.longitud;
        }
        return hn;
    }

    public int gn() {
        return recorrido.size()-1;
    }

    public int fn() {
        return hn() + gn();
    }


}

package BusquedaNoInformada;

import java.util.ArrayList;
import java.util.List;

public class Auto {
    List<Camino> recorrido = new ArrayList<>();
    Auto padre;

    int longitud(){
        int i =0;
        for (Camino c : recorrido) {
            i+=c.longitud;
        }

        return i;
    }
}

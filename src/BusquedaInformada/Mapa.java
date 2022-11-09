package BusquedaInformada;

import java.util.ArrayList;
import java.util.List;

public class Mapa {
    static List<Camino> caminos = new ArrayList<>();
    static Camino c0 = new Camino(0, "c0");

    static Camino c1 = new Camino(150, "c1");
    static Camino c2 = new Camino(150, "c2");
    static Camino c3 = new Camino(90, "c3");
    static Camino c4 = new Camino(100, "c4");
    static Camino c5 = new Camino(50, "c5");
    static Camino c6 = new Camino(100, "c6");
    static Camino c7 = new Camino(190, "c7");
    static Camino c8 = new Camino(100, "c8");
    static Camino c9 = new Camino(100, "c9");
    static Camino c10 = new Camino(50, "c10");
    static Camino c11 = new Camino(80, "c11");
    static Camino c12 = new Camino(100, "c12");
    static Camino c13 = new Camino(90, "c13");
    static Camino c14 = new Camino(100, "c14");
    static Camino c15 = new Camino(120, "c15");
    static Camino c16 = new Camino(100, "c16");
    static Camino c17 = new Camino(130, "c17");
    static Camino c18 = new Camino(150, "c18");
    static Camino c19 = new Camino(180, "c19");
    static Camino c20 = new Camino(100, "c20");
    static Camino c21 = new Camino(55, "c21");
    static Camino c22 = new Camino(100, "c22");
    static Camino c23 = new Camino(60, "c23");
    static Camino c24 = new Camino(80, "c24");
    static Camino c25 = new Camino(100, "c25");
    static Camino c26 = new Camino(70, "c26");
    static Camino c27 = new Camino(120, "c27");

    static Camino c28 = new Camino(0, "c28");

    Mapa() {
        caminos.add(c0);
        caminos.add(c1);
        caminos.add(c2);
        caminos.add(c3);
        caminos.add(c4);
        caminos.add(c5);
        caminos.add(c6);
        caminos.add(c7);
        caminos.add(c8);
        caminos.add(c9);
        caminos.add(c10);
        caminos.add(c11);
        caminos.add(c12);
        caminos.add(c13);
        caminos.add(c14);
        caminos.add(c15);
        caminos.add(c16);
        caminos.add(c17);
        caminos.add(c18);
        caminos.add(c19);
        caminos.add(c20);
        caminos.add(c21);
        caminos.add(c22);
        caminos.add(c23);
        caminos.add(c24);
        caminos.add(c25);
        caminos.add(c26);
        caminos.add(c27);
        caminos.add(c28);
    }

    static List<Camino> tomarCaminos(Camino c) {
        switch (c.id) {
            case "c0":
                return caminoC0();
            case "c1":
                return caminoC1();
            case "c2":
                return caminoC2();
            case "c3":
                return caminoC3();
            case "c4":
                return caminoC4();
            case "c5":
                return caminoC5();
            case "c6":
                return caminoC6();
            case "c7":
                return caminoC7();
            case "c8":
                return caminoC8();
            case "c9":
                return caminoC9();
            case "c10":
                return caminoC10();
            case "c11":
                return caminoC11();
            case "c12":
                return caminoC12();
            case "c13":
                return caminoC13();
            case "c14":
                return caminoC14();
            case "c15":
                return caminoC15();
            case "c16":
                return caminoC16();
            case "c17":
                return caminoC17();
            case "c18":
                return caminoC18();
            case "c19":
                return caminoC19();
            case "c20":
                return caminoC20();
            case "c21":
                return caminoC21();
            case "c22":
                return caminoC22();
            case "c23":
                return caminoC23();
            case "c24":
                return caminoC24();
            case "c25":
                return caminoC25();
            case "c26":
                return caminoC26();
            case "c27":
                return caminoC27();
            default:
                break;
        }

        return null;
    }

    static List<Camino> caminoC0() {
        List<Camino> ca = new ArrayList<>();
        ca.add(c1);
        ca.add(c2);
        ca.add(c3);
        return ca;
    }

    static List<Camino> caminoC1() {
        List<Camino> ca = new ArrayList<>();
        ca.add(c4);
        return ca;
    }

    static List<Camino> caminoC2() {
        List<Camino> ca = new ArrayList<>();
        ca.add(c7);
        ca.add(c8);
        ca.add(c10);

        return ca;
    }

    static List<Camino> caminoC3() {
        List<Camino> ca = new ArrayList<>();
        ca.add(c5);
        return ca;
    }

    static List<Camino> caminoC4() {
        List<Camino> ca = new ArrayList<>();
        ca.add(c7);
        ca.add(c6);

        return ca;
    }

    static List<Camino> caminoC5() {
        List<Camino> ca = new ArrayList<>();

        ca.add(c10);
        ca.add(c9);
        ca.add(c12);

        return ca;
    }

    static List<Camino> caminoC6() {
        List<Camino> ca = new ArrayList<>();

        ca.add(c7);
        ca.add(c18);
        ca.add(c11);

        return ca;
    }

    static List<Camino> caminoC7() {
        List<Camino> ca = new ArrayList<>();

        ca.add(c6);
        ca.add(c8);
        ca.add(c10);

        return ca;
    }

    static List<Camino> caminoC8() {
        List<Camino> ca = new ArrayList<>();

        ca.add(c7);
        ca.add(c11);
        ca.add(c10);
        ca.add(c20);
        ca.add(c21);

        return ca;
    }

    static List<Camino> caminoC9() {
        List<Camino> ca = new ArrayList<>();

        ca.add(c10);
        ca.add(c21);
        ca.add(c22);
        ca.add(c13);
        ca.add(c12);

        return ca;
    }

    static List<Camino> caminoC10() {
        List<Camino> ca = new ArrayList<>();

        ca.add(c7);
        ca.add(c8);
        ca.add(c9);
        ca.add(c12);

        return ca;
    }

    static List<Camino> caminoC11() {
        List<Camino> ca = new ArrayList<>();

        ca.add(c6);
        ca.add(c18);
        ca.add(c20);
        ca.add(c8);
        ca.add(c21);

        return ca;
    }

    static List<Camino> caminoC12() {
        List<Camino> ca = new ArrayList<>();

        ca.add(c10);
        ca.add(c9);
        ca.add(c14);
        ca.add(c15);

        return ca;
    }

    static List<Camino> caminoC13() {
        List<Camino> ca = new ArrayList<>();

        ca.add(c9);
        ca.add(c21);
        ca.add(c22);
        ca.add(c25);
        ca.add(c17);
        ca.add(c14);

        return ca;
    }

    static List<Camino> caminoC14() {
        List<Camino> ca = new ArrayList<>();

        ca.add(c12);
        ca.add(c13);
        ca.add(c25);
        ca.add(c17);
        ca.add(c15);

        return ca;
    }

    static List<Camino> caminoC15() {
        List<Camino> ca = new ArrayList<>();

        ca.add(c12);
        ca.add(c14);
        ca.add(c16);

        return ca;
    }

    static List<Camino> caminoC16() {
        List<Camino> ca = new ArrayList<>();

        ca.add(c15);
        ca.add(c17);
        ca.add(c16);

        return ca;
    }

    static List<Camino> caminoC17() {
        List<Camino> ca = new ArrayList<>();

        ca.add(c14);
        ca.add(c13);
        ca.add(c25);
        ca.add(c16);
        ca.add(c27);

        return ca;
    }

    static List<Camino> caminoC18() {
        List<Camino> ca = new ArrayList<>();

        ca.add(c6);
        ca.add(c11);
        ca.add(c19);

        return ca;
    }

    static List<Camino> caminoC19() {
        List<Camino> ca = new ArrayList<>();

        ca.add(c18);
        ca.add(c19);
        ca.add(c20);

        return ca;
    }

    static List<Camino> caminoC20() {
        List<Camino> ca = new ArrayList<>();

        ca.add(c11);
        ca.add(c8);
        ca.add(c21);
        ca.add(c19);
        ca.add(c23);

        return ca;
    }

    static List<Camino> caminoC21() {
        List<Camino> ca = new ArrayList<>();

        ca.add(c11);
        ca.add(c8);
        ca.add(c20);
        ca.add(c22);
        ca.add(c13);
        ca.add(c9);

        return ca;
    }

    static List<Camino> caminoC22() {
        List<Camino> ca = new ArrayList<>();

        ca.add(c21);
        ca.add(c9);
        ca.add(c13);
        ca.add(c24);
        ca.add(c23);

        return ca;
    }

    static List<Camino> caminoC23() {
        List<Camino> ca = new ArrayList<>();

        ca.add(c19);
        ca.add(c20);
        ca.add(c22);
        ca.add(c24);

        return ca;
    }

    static List<Camino> caminoC24() {
        List<Camino> ca = new ArrayList<>();

        ca.add(c23);
        ca.add(c22);
        ca.add(c25);
        ca.add(c26);

        return ca;
    }

    static List<Camino> caminoC25() {
        List<Camino> ca = new ArrayList<>();

        ca.add(c13);
        ca.add(c14);
        ca.add(c17);
        ca.add(c26);
        ca.add(c24);

        return ca;
    }

    static List<Camino> caminoC26() {
        List<Camino> ca = new ArrayList<>();

        ca.add(c24);
        ca.add(c25);
        ca.add(c28);

        return ca;
    }

    static List<Camino> caminoC27() {
        List<Camino> ca = new ArrayList<>();

        ca.add(c16);
        ca.add(c17);
        ca.add(c28);

        return ca;
    }

}

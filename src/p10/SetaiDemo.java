package p10;

import java.util.*;

public class SetaiDemo {
    public static void main(String[] args) {
        System.out.println("TreeSet: ");
        container(new TreeSet<>());

        System.out.println("ArrayList: ");
        container(new ArrayList<>());

    Set<Adresas> adresas1 = new HashSet<>();
    adresas1.add(new Adresas("Babtai", "Lapu aleja 12"));
    adresas1.add(new Adresas("Vilnius", "Gedimino 1"));
    adresas1.add(new Adresas("Babtai", "Lapu aleja 12"));

    Set<Adresas> adresas2 = new TreeSet<>();
    adresas2.add(new Adresas("Babtai", "Lapu aleja 12"));
    adresas2.add(new Adresas("Vilnius", "Gedimino 1"));
    adresas2.add(new Adresas("Babtai", "Lapu aleja 12"));
}

    static void container(Collection<String> miestai) {
        miestai.add("Babtai");
        miestai.add("Vilnius");
        miestai.add("Babtai");
        miestai.add("Kaunas");

        System.out.println(miestai.size() + " " + miestai);
    }
}

class Adresas implements Comparable<Adresas> {
    private String miestas;
    private String gatve;

    public Adresas(String miestas, String gatve) {
        this.miestas = miestas;
        this.gatve = gatve;
    }


    public String getMiestas() {
        return miestas;
    }

    public void setMiestas(String miestas) {
        this.miestas = miestas;
    }

    public String getGatve() {
        return gatve;
    }

    public void setGatve(String gatve) {
        this.gatve = gatve;
    }

    @Override
    public String toString() {
        return miestas + ' '+ gatve + ", " ;
    }

    @Override
    public int compareTo(Adresas o) {

        int c = this.miestas.compareTo(o.miestas);
        if (c !=0) return c;
        return this.gatve.compareTo(o.gatve);
    }
}
package p06.mokyklas;

/*

        Mokytojas
            Vardas
            Pavarde
            Asmens kodas
            Adresas
            Telefonas
            Email

            Destomas dalykas
            Kabineto numeris
            Mokytojo tvarkarastis

        Mokinys
            Vardas
            Pavarde
            Asmens kodas
            Adresas
            Telefonas
            Email

            Klase
            Mokinio tvarkarastis

 */

public class Mokykla {
    public static void main(String[] args) {
        Mokytojas m1 = new Mokytojas();
        m1.setVardas("Jonas");
        m1.setPavarde("Jonaitis");
        m1.setAk("24512212121");
        m1.setDalykas("Fizika");

        Mokinys o1 = new Mokinys();
        o1.setVardas("Ona");
        o1.setPavarde("One");
        o1.setAk("235412122");
        o1.setKlase(3);
    }

}


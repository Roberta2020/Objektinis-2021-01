package p05;

import p05.intro.Mokinys;
public class P05U1 {
    public static void main(String[] args) {

        System.out.println(P05U1.class.getName());

        Mokinys[] mokiniai = readFromDB();

        print(mokiniai);

        //sulygiuoti pagal klase ir varda
        for (int i = 0; i < mokiniai.length - 1; i++) {
            for (int j = i + 1; j < mokiniai.length; j++) {
                if (mokiniai[i].getLevel() > mokiniai[j].getLevel()) {
                    // i<-> j sukeisti
                    Mokinys tmp = mokiniai[i];
                    mokiniai[i] = mokiniai[j];
                    mokiniai[j] = tmp;
                }
                if (compare(mokiniai[i], mokiniai[j]) > 0) {
                    Mokinys tmp = mokiniai[i];
                    mokiniai[i] = mokiniai[j];
                    mokiniai[j] = tmp;
                }
            }
        }

        System.out.println("Sulygiuota:");

        print(mokiniai);
    }
        static void print(Mokinys[] mokiniai) {
            for (Mokinys m : mokiniai) {
                System.out.println(m.getName() + " " + m.getLevel());
            }
        }

        static int compare(Mokinys m1, Mokinys m2) {
            if (m1.getLevel() < m2.getLevel()) return -1;
            if (m1.getLevel() > m2.getLevel()) return 1;
            //m1.level == m2.level
            return m1.getName().compareTo(m2.getName());
        };
    static Mokinys[] readFromDB() {
        Mokinys[] mokiniai = new Mokinys[]{
                new Mokinys(),
                new Mokinys("Ona", 1),
                new Mokinys("Jonas", 1),
                new Mokinys("Jurgis", 3),
                new Mokinys("Antanas", 1),
                new Mokinys("Maryte", 2)
        };

        mokiniai[0].setName(null);
        mokiniai[0].setLevel(0);

        return mokiniai;
    }

    }


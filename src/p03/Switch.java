package p03;

public class Switch {
    public static void main(String[] args) {

        int x = 3; // (int) Math.round(Math.random() * 10);

        switch (x) {
            case 0:
                System.out.println("Nulis");
                break;
            default:
                System.out.println("?");

            case 1:
                System.out.println("Vienetas");

            case 2:
                System.out.println("Du");
        }

        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma +=i;
        }
        System.out.println("1+2+...100 = " + suma);

        String[] s = { "A", "A1", "B", "C", "A3"};
        int sk = 0;
        for (String e : s) {
            if (e.charAt(0) == 'A') sk++;
        }
        System.out.println("Viso prasidedanciu A raide yra " + sk);


        //String s = sk > 0 ? "Teigiamas" : sk > 5 ? "Daugiau 5" : "Xxx";
    }
}

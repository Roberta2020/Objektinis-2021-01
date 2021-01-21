package p04;

public class Ciklai {
    public static void main(String[] args) {

        int[] a = {5, 6, 10, 15, 8, 4};
        int[] b = {8, 5, 3};

        int suma1 = 0;
        for(int e : a) {
            suma1 += e;
        }
        double vidurkis1 = 1.0d * suma1 / a.length;
        System.out.println("a vidurkis = " + vidurkis1);

        int suma2 = 0;
        for(int e : b) {
            suma2 += e;
        }
        float vidurkis2 =  1.0f * suma2 / b.length;
        System.out.println("b vidurkis = " + vidurkis2);

        System.out.println(vidurkis1 - vidurkis2);
    }
}

package p03;

public class Masyvai {
    public static void main(String[] args) {

        int x = 100;
        int y = x;

        x= 200;
        System.out.println(y);

        int[] m = { 1, 2, 3};
        int[] m2 = m;

        m[0] = 10;
        System.out.println(m2[0]);

        String s = "jonas";
        String s2 = s;

        System.out.println("s == s2 ? " + (s == s2));

        s += "!";
        System.out.println("s = " + s);
        System.out.println("s2 = " + s2);

        System.out.println("s == s2 ? " + (s == s2));
    }
}

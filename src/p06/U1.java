package p06;

public class U1 {
    public static void main(String[] args) {
        // 1*1=1
        //4*4=16
        //10*10=100

        for (int x = 1; x <= 10; x++) {
            System.out.print("|  ");
            for (int y = 1; y <= 5; y++) {
                System.out.print(printD(y) + " x " + printD(x) + " = " + printR(x * y) + "  |  ");
            }
            System.out.println();
        }
    }

    static String printD(int d) {
        return (d < 10 ? " " : "") + d;
    }

    static String printR(int r) {
        return (r < 10 ? "  " : r < 100 ? " " : "") + r;
    }
}

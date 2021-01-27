package p08.turnyras;

public abstract class Zaidejas {

    static private int counter;

    private int number;
    public Zaidejas() {
        number = ++counter;
    }

    public abstract String vardasPoroje();

    public abstract String laimetojas();

    public int getNumber() {
        return number;
    }

}

package p09;

public class Main {
    public static void main(String[] args) {
        Man jonas = new Man();
        Horse arklys = new Horse();
        Lake tauragnu = new Lake();

        Point point;
        point = new Man;
        System.out.println(point.getPoints());;

        Object[] objects = { jonas, arklys, tauragnu };

        int totalPoints = 0;
        for (Object o : objects) {
            if (o instanceof Point) {
                totalPoints += ((Point)o).getPoints();
            }
        }
        System.out.println("Total points: " + totalPoints);
    }
}

package p09;

public class Lake extends Static implements Point {

    private int points;
    @Override
    public int getPoints() {
        return 20;
    }

    @Override
    public void setPoints(int points) {
        this.points = points;
    }
}

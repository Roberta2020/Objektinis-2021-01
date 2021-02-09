package p09;

public interface Point {

    int getPoints();
    void setPoints(int points);
    default void incPoints(int delta) {
        setPoints(getPoints() + delta);
    }


}

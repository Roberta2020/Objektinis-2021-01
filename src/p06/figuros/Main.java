package p06.figuros;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.setR(10);

        System.out.println("area = " + circle.area());

        System.out.println(circle);

        Circle circle2 = new Circle();
        circle2.setR(10);

        System.out.println(circle.equals(circle2));
    }
}

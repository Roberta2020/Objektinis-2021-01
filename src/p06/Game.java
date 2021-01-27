package p06;

public class Game {
    public static void main(String[] args) {

        Player a = new Player("A");
        Player b = new Player("B");

        System.out.println(a.getName() + " " + a.getMoney());
        System.out.println(b.getName() + " " + b.getMoney());


        //a.setMoney(a.getMoney() + 33);
        //b.setMoney(b.getMoney() - 33);
        a.transferFrom(b, 33);

        System.out.println(a.getName() + " " + a.getMoney());
        System.out.println(b.getName() + " " + b.getMoney());

    }
}
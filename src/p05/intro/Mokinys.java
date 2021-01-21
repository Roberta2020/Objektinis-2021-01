package p05.intro;

public class Mokinys {

    private String name;
    private int level;

    public Mokinys(String name) {
        if(name == null || name.length() <= 1) {
            // klaida, jei nera vardo
            throw new IllegalArgumentException("Neteisingas vardas");
        }
        this.name = name;
        level = 1;
    }

    public Mokinys(String name, int level) {
        // cia perkelia objekta Mokinio konstruktoriu kuris yra auksciau
        this(name);

        this.name = name;
        this.level = level;
    }

    public Mokinys() {
    }

    public  String getName() {
        return this.name;
    }
    public int getLevel() {
        return  this.level;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setLevel(int level) {
        this.level = level;
    }
}

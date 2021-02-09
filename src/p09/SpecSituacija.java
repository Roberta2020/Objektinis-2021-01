package p09;

public class SpecSituacija {
}

interface A {
    int getX();

    default  int getY() {
        return getX() * 2;
    }


    interface B {
        int getZ();

        default int getY() {
            return getZ() * 3;
        }
    }

    class C implements  A, B {
        @Override
        public int getX() {
            return 10;
        }
        @Override
        public int getZ() {
            return 11;
        }
        @Override
        public int getY() {
            return getX() + getZ();
        }
    }
}

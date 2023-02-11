package day7;

public class Immutable {

        private final int a, b;

        public int getA() {
            return a;
        }


        public int getB() {
            return b;
        }

//        public void setB(int b) {
//            this.b = b;
//        }

        public Immutable(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }



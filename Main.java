public class Main {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;
        float f1 = 15;
        short s1 = 11;
        long l1 = 33;
        double d1 = 50;
        char c = '1';
        boolean b = true;
        Arithmetic<Integer, Float> intFloat = new Arithmetic<>(n1, f1);
        Arithmetic<Integer, Integer> intInt = new Arithmetic<>(n1, n2);
        Arithmetic<Short, Long> shortLong = new Arithmetic<>(s1, l1);
        Arithmetic<Double, Short> doubleShort = new Arithmetic<>(d1, s1);
//        Arithmetic<Character, Integer> charInt = new Arithmetic(c, n1);
//        Arithmetic<Short, Boolean> shortBoolean = new Arithmetic(s1, b);


    }
}
//    Create a single project with two packages, one called Arithmetic and the other called Map.
//    You may choose to have a main class to test your creation.

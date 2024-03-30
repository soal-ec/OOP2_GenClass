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

        System.out.println(intFloat.n1 + ", " + intFloat.n2 + " - " + intFloat.add() + ", " + intFloat.subtract() + ", " + intFloat.multiply() + ", " + intFloat.divide() + ", " + intFloat.getMin() + ", " + intFloat.getMax());
        System.out.println(intInt.n1 + ", " + intInt.n2 + " - " + intInt.add() + ", " + intInt.subtract() + ", " + intInt.multiply() + ", " + intInt.divide() + ", " + intInt.getMin() + ", " + intInt.getMax());
        System.out.println(shortLong.n1 + ", " + shortLong.n2 + " - " + shortLong.add() + ", " + shortLong.subtract() + ", " + shortLong.multiply() + ", " + shortLong.divide() + ", " + shortLong.getMin() + ", " + shortLong.getMax());
        System.out.println(doubleShort.n1 + ", " + doubleShort.n2 + " - " + doubleShort.add() + ", " + doubleShort.subtract() + ", " + doubleShort.multiply() + ", " + doubleShort.divide() + ", " + doubleShort.getMin() + ", " + doubleShort.getMax());

        MyMap<Integer, String> map1 = new MyMap<>();
        map1.put(1, "a");
        map1.put(2, "b");
        map1.put(4, "a");
        map1.put(3, "c");
        map1.put(4, "d");
        map1.put(5, "z");

        for (int i = 0; i < map1.key.size(); i++) {
            System.out.println(map1.key.get(i) + ", " + map1.val.get(i));
        }
        System.out.println();

        map1.remove(5);

        for (int i = 0; i < map1.key.size(); i++) {
            System.out.println(map1.key.get(i) + ", " + map1.get(map1.key.get(i)));
        }



    }
}
//    Create a single project with two packages, one called Arithmetic and the other called Map.
//    You may choose to have a main class to test your creation.

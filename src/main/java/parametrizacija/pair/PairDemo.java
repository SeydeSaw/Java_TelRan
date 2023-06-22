package parametrizacija.pair;

public class PairDemo {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Hello", 123);
        System.out.println("First: " + pair.getFirst());
        System.out.println("Second: " + pair.getSecond());

        pair.setFirst("World");
        pair.setSecond(456);
        System.out.println("First (updated): " + pair.getFirst());
        System.out.println("Second (updated): " + pair.getSecond());
    }
}
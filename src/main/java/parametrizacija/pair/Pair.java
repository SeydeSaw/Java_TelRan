package parametrizacija.pair;
/*
// TODO: 14.06.23
        Напишите параметризированный класс "Pair", который принимает два различных типа данных
        в качестве параметров (например, "Pair").
        Реализуйте методы для получения и установки значений каждого из элементов пары.
 */
public class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getSecond() {
        return second;
    }

    public void setSecond(U second) {
        this.second = second;
    }
}
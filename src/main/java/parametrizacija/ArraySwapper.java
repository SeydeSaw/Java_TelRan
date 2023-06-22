package parametrizacija;
/*
// TODO: 14.06.23
        Реализуйте параметризированный метод "swap", который принимает массив элементов
        и два индекса внутри массива.
        Метод должен поменять местами элементы по указанным индексам.
 */
import java.util.Arrays;

public class ArraySwapper {
    public static <T> void swap(T[] array, int index1, int index2) {
        if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Before swap: " + Arrays.toString(numbers));

        swap(numbers, 1, 3);
        System.out.println("After swap: " + Arrays.toString(numbers));

        String[] strings = {"One", "Two", "Three"};
        System.out.println("Before swap: " + Arrays.toString(strings));

        swap(strings, 0, 2);
        System.out.println("After swap: " + Arrays.toString(strings));
    }
}
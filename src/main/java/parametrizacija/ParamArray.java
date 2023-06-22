package parametrizacija;
/*
// TODO: 14.06.23
        Напишите параметризированный метод "printArray",
        который принимает массив элементов и выводит их на консоль.
        Метод должен работать с любыми типами данных.
 */
public class ParamArray {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Integer array:");
        printArray(intArray);

        String[] stringArray = {"One", "Two", "Three"};
        System.out.println("String array:");
        printArray(stringArray);

        Double[] doubleArray = {1.5, 2.5, 3.5, 4.5};
        System.out.println("Double array:");
        printArray(doubleArray);
    }
}
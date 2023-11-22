package konspekt;

public class _FunctionalInterfaceTask {
    public static void main(String[] args) {

        printTask1(argument -> {// передаём в () такиеже параметры как в методе printTask1
            int sum = 0;
            for (Integer elem : argument){
                sum += elem;
            }
            System.out.println(sum);
        });

        printTask1(_FunctionalInterfaceTask::sumArr);//обращаемся к классу :: вызываем метод
    }

    public static void sumArr(int[] arr){// должна быть такаяже сигнатура как в методе printTask1
        int sum = 0;
        for (Integer elem : arr){
            sum += elem;
        }
        System.out.println(sum);
    }

    public static void printTask1(Task1 task1){
        task1.print(new int[]{1,2,3,4,5});//инициализируем массив
    }
}
@FunctionalInterface
interface Task1 {
    void print(int[] arr);
}
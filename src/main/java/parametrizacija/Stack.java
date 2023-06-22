package parametrizacija;
/*
// TODO: 14.06.23
        Создайте параметризированный класс "Stack", представляющий стек элементов.
        Реализуйте методы "push", "pop" и "isEmpty" для добавления элемента в стек,
        извлечения элемента из стека и проверки, пуст ли стек соответственно.
 */
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Stack<T> {
    private List<T> stack;

    public Stack() {
        stack = new ArrayList<>();
    }

    public void push(T element) {
        stack.add(element);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.remove(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);

        System.out.println("Is integerStack empty? " + integerStack.isEmpty());

        System.out.println("Pop: " + integerStack.pop());
        System.out.println("Pop: " + integerStack.pop());
        System.out.println("Pop: " + integerStack.pop());

        System.out.println("Is integerStack empty? " + integerStack.isEmpty());

        Stack<String> stringStack = new Stack<>();
        stringStack.push("Hello");
        stringStack.push("World");

        System.out.println("Is stringStack empty? " + stringStack.isEmpty());

        System.out.println("Pop: " + stringStack.pop());
        System.out.println("Pop: " + stringStack.pop());

        System.out.println("Is stringStack empty? " + stringStack.isEmpty());
    }
}
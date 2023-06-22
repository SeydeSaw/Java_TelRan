package parametrizacija;
/*
// TODO: 14.06.23
        Создайте параметризированный класс "LinkedList", представляющий связный список элементов.
        Реализуйте методы "add", "remove" и "contains" для добавления элемента в список,
        удаления элемента из списка и проверки, содержится ли элемент в списке соответственно.
 */
public class LinkedList<T> {
    private Node<T> head;
    private int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public void add(T element) {
        Node<T> newNode = new Node<>(element);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public void remove(T element) {
        if (head == null) {
            return;
        }
        if (head.data.equals(element)) {
            head = head.next;
            size--;
            return;
        }
        Node<T> current = head;
        Node<T> prev = null;
        while (current != null && !current.data.equals(element)) {
            prev = current;
            current = current.next;
        }
        if (current != null) {
            prev.next = current.next;
            size--;
        }
    }

    public boolean contains(T element) {
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(element)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("List contains 2? " + list.contains(2));

        list.remove(2);

        System.out.println("List contains 2? " + list.contains(2));
    }
}
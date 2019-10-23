public class LinkedListJava {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        //linkedList.addFirst(10);
        linkedList.addFirst(20);
        linkedList.addLast(30);
        linkedList.addLast(40);

        System.out.println(linkedList.node(2));
    }
}

class LinkedList<E> {

    private Node head;
    private Node tail;
    private int size = 0;

    private class Node {

        private E date;
        private Node next;

        public Node(E input) {
            this.date = input;
            this.next = null;
        }

        public String toString() {
            return String.valueOf(this.date);
        }
    }

    public void addFirst(E input) {
        Node node = new Node(input);
        node.next = head;
        head = node;
        size++;

        if (head.next == null) {
            tail = head;
        }

        System.out.println("First : " + node.toString());
    }

    public void addLast(E input) {
        Node node = new Node(input);

        if (size == 0) {
            addFirst(input);
        } else {
            tail.next = node;
            tail = node;
            size++;
        }

        System.out.println("Last : " + node.toString());
    }

    public Node node(int index) {
        Node node = head;

        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
}

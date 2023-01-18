public class LinkedList<T> {
    private Node<T> head;
    private int listSize;

    public LinkedList() {
        head = null;
        listSize = 0;
    }

    public LinkedList(Node<T> head) {
        this.head = head;
    }

    public void add(T value) {
        Node<T> newNode = new Node<>(value);
        Node<T> node = this.head;

        if (node == null) {
            this.head = newNode;
        } else {
            while (node.next != null) {
                node = node.next;
            }

            node.next = newNode;
        }
        listSize++;
        // Later: Implement add method using tail
    }

    public void remove(T value) {
        Node<T> currentNode = this.head;
        Node<T> previousNode = this.head;

        while (currentNode != null) {
            if (currentNode.value == value) {
                if (currentNode == this.head) {
                    this.head = currentNode.next;
                    listSize--;
                    return;
                } else {
                    previousNode.next = currentNode.next;
                    listSize--;
                    return;
                }
            } else {
                if (currentNode != this.head) {
                    previousNode = previousNode.next;
                }
                currentNode = currentNode.next;
            }
        }
    }

    public int getListSize() {
        return listSize;
    }

    public void printList() {
        Node<T> currentNode = this.head;
        System.out.print("Linked list: ");
        while (currentNode != null) {
            if (currentNode.next != null) {
                System.out.print(currentNode.value + " - ");
            } else {
                System.out.print(currentNode.value + "\n");
            }
            currentNode = currentNode.next;
        }
    }

    public T get(int position) {
        int listSize = getListSize();
        if (position >= listSize) {
            throw new IllegalArgumentException("Position is greater than number of list nodes.");
        }

        int pointer = 0;
        Node<T> currentNode = this.head;

        while (currentNode != null) {
            if (pointer == position) {
                return currentNode.value;
            }
            pointer++;
            currentNode = currentNode.next;
        }
        throw new IllegalArgumentException();
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                '}';
    }

    public class Node<T> {
        private T value;
        private Node<T> next;

        Node(T value) {
            this.value = value;
        }
    }
}

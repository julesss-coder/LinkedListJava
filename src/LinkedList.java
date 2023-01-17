public class LinkedList {
    private Node head;
    private int listSize;

    public LinkedList() {
        head = null;
        listSize = 0;
    }

    public LinkedList(Node head) {
        this.head = head;
    }

    public void add(int value) {
        Node newNode = new Node(value);
        Node node = this.head;

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

    public void remove(int value) {
        Node currentNode = this.head;
        Node previousNode = this.head;

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
        Node currentNode = this.head;
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

    public int get(int position) {
        int listSize = getListSize();
        if (position >= listSize) {
            throw new IllegalArgumentException("Position is greater than number of list nodes.");
        }

        int pointer = 0;
        Node currentNode = this.head;

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

    public class Node {
        private int value;
        private Node next;

        Node(int value) {
            this.value = value;
        }
    }
}

public class LinkedList {
    Node head = null;
    // Ich will head standardmaessig auf `null` setzen, aber einen constructor haben, an den ich `head` uebergeben kann.
    // Warum funktioniert der folgende Code nicht? Wenn ich aus `Main` `new LinkedList()` aufrufe, wird ein Argument verlangt.
    // Sollte nicht `head` `null` sein, wenn ich kein Argument übergebe?
//    LinkedList(Node head) {
//        this.head = head;
//    }

    // Class constructor, der head null zuweist: das obige Problem besteht trotzdem weiter.
//    static {
//        head = null;
//    }

    void addNode(int value) {
        Node newNode = new Node(value);
        Node node = this.head;

        if (node == null) {
            this.head = newNode;
        } else {
            while (node.next != null) {
                node = node.next;
            }

            // Now, we are at the last node. Add newNode here.
            node.next = newNode;
        }

        // Later: Implement add method using tail
    }


    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                '}';
    }
}

/*
- Soll die Linked List auch ein `tail` haben, oder nur einen `head`?
- Wie iteriert man generell über Objekte?

TODOS:
- access modifier hinzufügen
- static hinzufügen
- Methoden zu LinkedList hinzufügen:
    - [x] add
    - [ ] remove
    - [ ] size
    - [ ] printList
    - [ ] get
 */
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNode(2);
        list.addNode(3);
        System.out.println(list.head.value);
        System.out.println(list.head.next.value);


        // Wie iteriere ich durch die LinkedList? Wie logge ich sie in der Konsole?
            // Iterator?





    }
}
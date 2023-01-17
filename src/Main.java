public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.printList();
        System.out.println("list size: " + list.getListSize());
        list.remove(3);
        list.printList();
        System.out.println("list size: " + list.getListSize());
        
        try {
            System.out.println("node value at index 0: " + list.get(4));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getLocalizedMessage());
            System.out.println("Enter a position between 0 and " + (list.getListSize() - 1));
        }
        
        System.out.println("node value at index 1: " + list.get(1));
    }
}

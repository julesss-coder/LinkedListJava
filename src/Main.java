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
        System.out.println("node value at index 0: " + list.get(0));
        System.out.println("node value at index 1: " + list.get(1));
    }
}

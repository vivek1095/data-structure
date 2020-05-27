public class MainClass{
    public static void main(String args[]){
        Node<Number> head = null;

        // number linkedlist
        head = LinkedList.add(head, 2);
        head = LinkedList.add(head, 3);

        head = LinkedList.addFirst(head, 1);    
        head = LinkedList.addLast(head, 4);
        head = LinkedList.addLast(head, 5);

        head = LinkedList.addAfter(head, 5, 7);
        
        head = LinkedList.addBefore(head, 1, 0);
        head = LinkedList.addBefore(head, 7, 6);
        head = LinkedList.addBefore(head, 10, 5);

        System.out.println("Number linked list");
        LinkedList.display(head);
        
        int index = LinkedList.search(head,5);
        System.out.println("\nElement found on index " + index);

        head = LinkedList.delete(head, 0);
        LinkedList.display(head);

        head = LinkedList.delete(head, 2);
        LinkedList.display(head);

        // string linkedlist
        Node<String> head2 = null;
        head2 = LinkedList.add(head2, "abc");
        head2 = LinkedList.add(head2, "xyz");

        System.out.println("\nString linked list");
        LinkedList.display(head2);
    }
}
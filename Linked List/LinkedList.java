public class LinkedList{
    
    public static <T> Node<T> add(Node<T> head,T value) {
        if(head == null){
            head = new Node<T>(value);
        }
        else{
            Node<T> newNode = new Node<T>(value);
            head.setNext(newNode);
        }
        return head;
    }

    public static <T> void display(Node<T> head){
        if (null == head){
            System.out.println("List is empty");
        }
        else{
            Node<T> tempNode = head;
            while(tempNode != null){
                System.out.println(tempNode.getValue() + "-->");
                tempNode = tempNode.getNext();
            }
        }
    }
}
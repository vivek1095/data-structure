public class LinkedList{
    public static <T> Node<T> add(Node<T> head,final T value) {
        if(head == null){
            head = new Node<T>(value);
        }
        else{
            final Node<T> newNode = new Node<T>(value);
            head.setNext(newNode);
        }
        return head;
    }

    public static <T> Node<T> addFirst(Node<T> head,final T value){
        if(head == null){
            head = new Node<T>(value);
        }
        else{
            final Node<T> newNode = new Node<T>(value);
            newNode.setNext(head);
            head = newNode;
        }
        return head;
    }

    public static <T> Node<T> addLast(Node<T> head,final T value){
        if(head == null){
            head = new Node<T>(value);
        }
        else{
            final Node<T> newNode = new Node<T>(value);
            Node<T> tempNode = head;

            while(tempNode.getNext() != null){
                tempNode = tempNode.getNext();
            }
            tempNode.setNext(newNode);
        }
        return head;
    }

    public static <T> Node<T> addAfter(Node<T> head,final T indexVal,final T value){
        final Node<T> newNode = new Node<T>(value);
        if(head.getValue() == indexVal){
            newNode.setNext(head.getNext());
            head.setNext(newNode);
        }
        else{
            Node<T> tempNode = head;

            while(tempNode != null && tempNode.getValue()!= indexVal ){
                tempNode = tempNode.getNext();
            }
            if(tempNode == null){
                System.out.println("Index value does not exist " + indexVal);
            }
            else{
                newNode.setNext(tempNode.getNext());
                tempNode.setNext(newNode);
            }
        }
        return head;
    }

    public static <T> Node<T> addBefore(Node<T> head, T indexVal, T value){
        Node<T> newNode = new Node<T>(value);
        if(head.getValue() == indexVal){
            newNode.setNext(head);
            head = newNode;
        }
        else{
            Node<T> curr = head;
            Node<T> prev = null;

            while(curr != null && curr.getValue()!=indexVal){
                prev = curr;
                curr = curr.getNext();
            }
            if(curr == null){
                System.out.println("Index value does not exist " + indexVal);
            }
            else{
                newNode.setNext(prev.getNext());
                prev.setNext(newNode);
            }
        }
        return head;
    }

    public static <T> int search(Node<T> head, T value){
        int index = 0;
        if(head == null){
            return -1;
        }
        else if(head.getValue() == value){
            return 0;
        }
        else{
            Node<T> tempNode = head;
            while(tempNode != null && tempNode.getValue() != value){
                tempNode = tempNode.getNext();
                index++;
            }
            if(tempNode == null){
                return -1;
            }
            else{
                return index;
            }
        }
    }
    public static <T> Node<T> delete(Node<T> head,T value){
        if(head.getValue() == value){
            Node<T> temp = head;
            head = null;
            head = temp.getNext();
        }
        else{
            Node<T> curr = head;
            Node<T> prev = null;
            while(curr != null && curr.getValue() != value){
                prev = curr;
                curr = curr.getNext();
            }        
            if(curr == null){
                System.out.println("Value does not exist");
            }  
            else{
                prev.setNext(curr.getNext());
            } 
        }
        return head;
    }

    public static <T> Node<T> reverse(Node<T> head){
        Node<T> temp = head;
        while(temp.getNext() != null){
            temp = temp.getNext();
        }
        return head;
    }
    public static <T> void display(final Node<T> head){
        if (null == head){
            System.out.println("List is empty");
        }
        else{
            Node<T> tempNode = head;
            System.out.println();
            while(tempNode != null){
                System.out.print(tempNode.getValue() + "--> ");
                tempNode = tempNode.getNext();
            }
        }
    }
}
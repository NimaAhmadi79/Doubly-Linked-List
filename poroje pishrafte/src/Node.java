public class Node<E> {
    Node next;
    Node prev;
    E data;
    public Node(E data){
        this.data=data;
        next=null;
        prev=null;
    }
}

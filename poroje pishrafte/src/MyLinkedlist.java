public class MyLinkedlist<E>implements Safe2Sar {
    Node akharlist;
    Node avallist;

    @Override
    public void addFront(Object item) {
        Node new_node=new Node(item);
        if(empty()){
            avallist=new_node;
            akharlist=avallist;
        }
        else{
            akharlist.next=new_node;
            new_node.prev=akharlist;
            akharlist=akharlist.next;

        }
    }

    @Override
    public void addBack(Object item) {
        Node new_node=new Node(item);
        Node temp;
        temp=avallist;
        avallist.prev=new_node;
        avallist=avallist.prev;
        avallist.next=temp;
    }

    @Override
    public E removeFront() {
        if(size()==1){
            Node temp=akharlist;
            akharlist=null;
            avallist=null;
            return (E) temp.data;
        }
        else {
            Node temp=akharlist;
            (akharlist.prev).next=null;
            akharlist=temp.prev;
            return (E) temp.data;
        }
    }

    @Override
    public E removeBack() {
        if(size()==1){
            Node temp=akharlist;
            akharlist=null;
            avallist=null;
            return (E)temp.data;
        }
        else {
            Node temp=avallist;
            (avallist.next).prev=null;
            avallist=temp.next;
            return (E) temp.data;

        }
    }

    @Override
    public E peekFront() {
        return (E) akharlist.data;
    }

    @Override
    public E peekBack() {
        return(E) avallist.data;
    }

    @Override
    public int size() {
        int size=0;
        Node temp=avallist;
        while (temp!=null){
            size++;
            temp=temp.next;
        }
        return size;
    }

    @Override
    public boolean empty() {
        if(avallist==null){
            return true;
        }
        else {
            return false;
        }

    }
}

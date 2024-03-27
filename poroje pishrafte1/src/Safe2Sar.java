public interface Safe2Sar<E> {
    public void addFront(E item); // Inserts item at the front of the safe2sar.

    public void addBack(E item); // Inserts item at the back of the safe2sar.

    public E removeFront(); // Removes item from front of the safe2sar and returns item . // Returns null if the safe2sar is empty.

    public E removeBack(); // Removes item from back of the safe2sar and returns item . // Returns null if the safe2sar is empty.

    public E peekFront(); // Returns the item at the front of the safe2sar, leaves safe2sar unchanged. // Returns null if the safe2sar is empty.

    public E peekBack(); // Returns the item at the back of the safe2sar, leaves safe2sar unchanged. // Returns null if the safe2sar is empty.

    public int size(); // Returns the number of elements in the safe2sar.

    public boolean empty(); // Returns true if the safe2sar has any elements, otherwise false
}

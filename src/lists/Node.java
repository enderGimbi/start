package lists;

public class Node<T1> {
     private T1 value;
     Node<T1> next;

     public Node() {
         this.value = null;
         this.next = null;
     }

    public Node(T1 value) {
        this.value = value;
        this.next = null;
    }

    public Node(T1 value, Node<T1> next) {
         this.value = value;
         this.next = next;
     }


    public T1 getValue() {
        return value;
    }

    public void setValue(T1 value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value.toString();
    }
}

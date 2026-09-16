package lists;

public class StackStrategy<T> implements ListStrategy<T>{

    @Override
    public Node<T> add(Node<T> head, Node<T> newNode) {
        if(head==null){
            head=newNode;
            return head;
        }
        newNode.next=head;
        return newNode;
    }

    @Override
    public Node<T> delete(Node<T> head) {
        if(head==null) return null;
        head=head.next;
        return head;
    }
}

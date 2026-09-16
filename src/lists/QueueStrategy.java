package lists;

public class QueueStrategy<T> implements ListStrategy<T>{

    @Override
    public Node<T> add(Node<T> head, Node<T> newNode) {
        if(head==null){
            head=newNode;
            return head;
        }
        var cache = head;
        while(cache.next!=null){
            cache=cache.next;
        }
        cache.next=newNode;
        return head;
    }

    @Override
    public Node<T> delete(Node<T> head) {
        if(head==null) return null;
        head=head.next;
        return head;
    }
}

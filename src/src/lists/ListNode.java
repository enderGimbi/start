package src.lists;

public class ListNode<T1> {
    Node<T1> head;
    int length;

    public ListNode() {
        this.head = null;
        this.length = 0;
    }

    public ListNode(Node<T1> head) {
        this.head = head;
        this.length=1;
    }

    public void add(T1 newEl){
        var cache = head;
        while(cache.next!=null){
            cache = cache.next;
        }
        cache.next=new Node<T1>(newEl);
    }

    public void addNode(Node<T1> node){
        var cache = head;
        while(cache.next!=null){
            cache = cache.next;
        }
        cache.next=node;
    }

    public void deleteEl(T1 el){
        var cache = head;
        Node<T1> prev;
        while(cache.next!=null || cache.getValue()==el){
            prev = cache;
            cache = cache.next;
        }
        if(cache.next==null&&cache.getValue()!=el) return;
    }
}

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
        if(this.length==0){
            this.head = new Node<>(newEl);
            this.length++;
            return;
        }
        var cache = this.head;
        while(cache.next!=null){
            cache = cache.next;
        }
        cache.next=new Node<T1>(newEl);
        this.length++;
    }

    public void addNode(Node<T1> node){
        if(this.length==0){
            this.head = node;
            this.length++;
            return;
        }
        var cache = this.head;
        while(cache.next!=null){
            cache = cache.next;
        }
        cache.next=node;
        this.length++;
    }

    public void deleteEl(T1 el){
        var cache = this.head;
        if(this.head.getValue()==el){
            this.head=this.head.next;
            this.length--;
            return;
        }
        Node<T1> prev = null;
        while(cache.next!=null || cache.getValue()==el){
            prev = cache;
            cache = cache.next;
        }
        if(cache.next==null&&cache.getValue()!=el) return;
        prev.next=cache.next;
        cache.next=null;
        this.length--;
    }

    @Override
    public String toString() {
        if (this.length==0)
            return "";
        var a = this.head;
        StringBuilder cache;
        cache = new StringBuilder("{ ");
        while(a!=null){
            cache.append(a.getValue());
            cache.append(", ");
            a = a.next;
        }
        cache.delete(cache.length()-2,cache.length()-1);
        cache.append("}");
        return cache.toString();
    }
}

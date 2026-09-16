package lists;

public class ListNode<T> {
    Node<T> head;
    int length;
    ListStrategy<T> strategy;

    public ListNode(ListStrategy<T> strategy) {
        this.strategy = strategy;
        this.head=null;
        this.length=0;
    }

    public void add(T newEl){
        var newNode = new Node<>(newEl);
        this.head=this.strategy.add(head,newNode);
        this.length++;
    }

    public void delete(){
        this.head = this.strategy.delete(head);
        this.length--;
    }

    public void deleteEl(T el){
        var cache = this.head;
        if(this.head.getValue()==el){
            this.head=this.head.next;
            this.length--;
            return;
        }
        Node<T> prev = null;
        while(cache.next!=null || cache.getValue()==el){
            prev = cache;
            cache = cache.next;
        }
        if((cache.next==null&&cache.getValue()!=el)||prev==null) return;
        prev.next=cache.next;
        cache.next=null;
        this.length--;
    }

    public void setStrategy(ListStrategy<T> strategy){
        this.strategy = strategy;
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

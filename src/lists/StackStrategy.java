package lists;

public class StackStrategy<T1> implements ListStrategy{

    Node<T1> head;
    int length;

    @Override
    public <T2> void add(T2 newEl) {
        if(this.length==0){
            this.head = new Node<T1>((T1)newEl);
            this.length++;
            return;
        }
        Node<T1> nEl = new Node<T1>((T1)newEl);
        nEl.next= this.head;
        this.head = nEl;
        this.length++;
    }

    @Override
    public void delete() {
        if(this.length==0) return;
        this.length--;
        this.head=this.head.next;
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

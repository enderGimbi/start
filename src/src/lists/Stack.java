package src.lists;

public class Stack<T1> {

    Node<T1> head;
    int length;

    public Stack() {
        this.head =null;
        this.length=0;
    }

    public Stack(Node<T1> head) {
        this.head = head;
        this.length=1;
    }

    public void add(T1 newEl){
        if(this.length==0){
            this.head = new Node<>(newEl);
            this.length++;
            return;
        }
        var nEl = new Node<>(newEl);
        nEl.next=this.head;
        this.head = nEl;
        this.length++;
    }

    public void delete(){
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

import lists.ListNode;
import lists.ListStrategy;
import lists.QueueStrategy;
import lists.StackStrategy;

public class Main {
    public static void main(String[] args) {
        ListStrategy<Integer> a = new QueueStrategy<>();
        ListStrategy<Integer> b = new StackStrategy<>();
        var list = new ListNode<>(a);
        list.add(1);
        list.add(2);
        System.out.println(list);
        list.setStrategy(b);
        list.add(2);
        list.add(3);
        System.out.println(list);

    }
}
import lists.QueueStrategy;
import lists.StackStrategy;

public class Main {
    public static void main(String[] args) {
//        Node<Integer> node = new Node<>(10);
//        ListNode<Integer> list = new ListNode<Integer>();
//        list.addNode(node);
//        list.add(12);
//        System.out.println(list);
//        System.out.println(node);

//        Stack<Integer> stack = new Stack<Integer>();
//        stack.add(1);
//        stack.add(2);
//        stack.add(3);
//        System.out.println(stack);
//        stack.delete();
//        System.out.println(stack);
//        stack.delete();
//        System.out.println(stack);

        var a =new QueueStrategy<>();
        a.add(1);
        a.add(2);
        a.add(3);
        System.out.println(a);
        a.delete();
        System.out.println(a);
        a.delete();
        System.out.println(a);



        var b =new StackStrategy<>();
        b.add(1);
        b.add(2);
        b.add(3);
        System.out.println(b);
        b.delete();
        System.out.println(b);
        b.delete();
        System.out.println(b);


    }
}
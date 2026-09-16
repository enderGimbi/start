package lists;

public interface ListStrategy<T> {
    Node<T> add(Node<T> head,Node<T> newNode);
    Node<T> delete(Node<T> head);
}

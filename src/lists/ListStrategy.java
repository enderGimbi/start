package lists;

public interface ListStrategy {
    <T2> void add(T2 newEl);
    void delete();
}

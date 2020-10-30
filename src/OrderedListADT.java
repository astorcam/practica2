public interface OrderedListADT<T> {
    void add(T elem);
    void merge(OrderedCircularLinkedList<T> lista);
}

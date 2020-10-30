public interface ListADT<T> {
    void setDescr(String nom); + String getDescr();
    T removeFirst();
    T removeLast();
    T remove(T elem);
    T first();
    T last();
    boolean contains(T elem); + T find(T elem);
    boolean isEmpty();
    int size();
    IteratorCLL<T> iterator();
}

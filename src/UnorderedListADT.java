public interface UnorderedListADT<T> extends ListADT{

   void addToFront(T elem);
   void addToRear(T elem);
   void addAfter(T elem, T target);
}

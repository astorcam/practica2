public class UnorderedCircularLinkedList<T> extends CircularLinkedList implements UnorderedListADT {

    public UnorderedCircularLinkedList (){
        super();
    }

    @Override
    public void addToFront(Object elem) {
        Nodo<T> nuevo= new Nodo(elem);
        if (size()!=0){
            nuevo.setNext((Nodo<T>) last());
            nuevo=nuevo.next();
            ((Nodo<T>) last()).setNext(nuevo);}
        else{setLast(nuevo);
            nuevo.setNext(nuevo);}
        setSize(size()+1);
    }

    @Override
    public void addToRear(Object elem) {
        Nodo<T> nuevo= new Nodo(elem);
        if (!this.isEmpty()) {
            Nodo<T> act= (Nodo<T>) last();
            nuevo.setNext(act.next());
            act.setNext(nuevo);}
        else {setLast(nuevo);
            nuevo.setNext(nuevo);}
        setSize(size()+1);
    }

    @Override
    public void addAfter(Object elem, Object target) {
        Nodo<T> nuevo= new Nodo(elem);
        if (!this.isEmpty()) {
            Nodo<T> act= (Nodo<T>) last();
            setSize(size()+1);
            if(target.equals(act.getData())){ //si es igual al ultimo
                addToFront(elem);}
            else {
                act=act.next();
                Nodo<T> ultimo= (Nodo<T>) last();
                while(!act.next().getData().equals(target)&&act!=ultimo){
                    act=act.next();}
                nuevo.setNext(act.next());
                act.setNext(nuevo);}
        }
    }
}

public class CircularLinkedList<T> implements ListADT {
    private Nodo<T> last;
    private int size;
    private String descr;

    public CircularLinkedList(){
        this.descr=null;
        this.size=0;
        this.last=null;
    }
    @Override
    public void setDescr(String nom) {
        this.descr=nom;
    }

    @Override
    public String getDescr() {
        return this.descr;
    }

    @Override
    public Nodo<T> removeFirst() {
        if (!this.isEmpty()){
            Nodo<T> first = this.last.next();
            last.setNext(first.next());
            this.size--;
            return first;
        }
        else {return null};
    }

    @Override
    public Nodo<T> removeLast() {
        if (!this.isEmpty()) {
            Nodo<T> act=last.next();
            while (act.next()!=last){
                act=act.next();
            }
            act.setNext(last.next());
            Nodo<T> borrado=last;
            last=act;
            this.size--;
            return borrado;}
        else {return null};
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setLast(Nodo<T> last) {
        this.last = last;
    }

    @Override
    public T remove(T elem) {
        if (!this.isEmpty()) {
            if (elem.equals(this.last.getData())){
                this.removeLast();
            return elem;}
            else if (elem.equals(this.last.next().getData())){
                this.removeFirst();
                return elem;
            }
            else {
                Nodo<T> act=last.next();
                Nodo<T> aux;
                while (!act.next().getData().equals(elem)) {
                    act=act.next();
                }
                aux=act.next();
                act.setNext(aux.next());
                this.size--;
                return elem;}
        }
        else{return null;}
    }


    @Override
    public T first() {
        if (!this.isEmpty()){
        return (T) this.last.next();}
        else{return null;}
    }

    @Override
    public T last() {
        if (!this.isEmpty()){
        return (T) this.last;}
        else{return null;}
    }

    @Override
    public boolean contains(Object elem) {
        if(!this.isEmpty()){
            boolean encontrado=false;
            Nodo<T> act=last.next();
            if(act.getData().equals(elem)){
                encontrado=true;}
            else{act=act.next()}
            while ((!encontrado)&&(act!=last.next()){
                if(act.getData().equals(elem)){
                    encontrado=true;}
                act=act.next();
            }
        }
        else {return false;}
    }

    @Override
    public T find(T elem) {
        if(!this.isEmpty()){
            boolean encontrado=false;
            Nodo<T> act=last.next();
            if(act.getData().equals(elem)){
                encontrado=true;}
            else{act=act.next()}
            while ((!encontrado)&&(act!=last.next()){
                if(act.getData().equals(elem)){
                    encontrado=true;}
                act=act.next();
            }
            if(encontrado){return act.getData();}
        }
        else {return null;}
    }

    @Override
    public boolean isEmpty() {
        return (this.size==0);
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public IteratorCLL iterator() {
        return new IteratorCLL<T>(this.last);
    }
}

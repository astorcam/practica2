import java.util.Iterator;

public class IteratorCLL<T> implements Iterator {
    private Nodo<T> act;
    private Nodo<T> last;

    public IteratorCLL(Nodo<T> pLast){
        this.last=pLast;
        this.act=null;
    }
    @Override
    public boolean hasNext() {
        if (act==null){
            return (last!=null);
        }
        else if (act.next() == last.next()) {
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public Nodo<T> next() {
        if (act==null){
            act=last.next();
        }
        else{
            act=act.next();
        }
        return act;
    }
}

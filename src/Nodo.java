public class Nodo<T> {
    private Nodo<T> next;
    private T data;

    public Nodo(T data){
        this.data=data;
    }

    public T getData(){
        return this.data;
    }
    public void setData(T data) {
        this.data = data;
    }
    public void setNext(Nodo<T> next){
        this.next= next;
    }

    public Nodo<T> next() {
        return this.next;
    }
}

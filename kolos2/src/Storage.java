public class Storage<T> {
    T item;
    public void store(T item) {
        this.item = item;
    }
    public T retrieve() {
        return this.item;
    }
}

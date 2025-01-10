import java.util.ArrayList;
import java.util.List;

public class Counter<T> {
    List<T> list = new ArrayList<T>();

    public void add(T item) {
        list.add(item);
    }
    public int getCount() {
        return list.size();
    }
}

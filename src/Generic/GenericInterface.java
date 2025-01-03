package Generic;

interface Container<T> {
    void add(T item);
    T get();
}

class GenericContainer <T> implements Container<T> {
    private T item;

    public void add(T item){
        this.item = item;
    }

    public T get(){
        return item;
    }
}

public class GenericInterface {
    public static void main(String[] args) {
        GenericContainer<Integer> c = new GenericContainer<>();
        c.add(10);
        System.out.println(c.get());
    }
}

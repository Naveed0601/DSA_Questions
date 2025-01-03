package Generic;

class Pair <K , V> {
    private K key;
    private V value;

    public Pair(K key , V value){
        this.key = key;
        this.value = value;
    }

    public K getKey(){
        return key;
    }

    public V getValue(){
        return value;
    }
}

public class Example3 {
    public static void main(String[] args) {
        Pair<String , Integer> pair = new Pair<>("AGE" , 20);
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());
    }
}
package Generic;


public class Example2 {

    public class Box <T> {
        private T value;

        public T getValue(){
            return value;
        }
        public void setValue(T value){
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Example2 ex = new Example2();
        Box<Integer> box = ex.new Box<>();
        box.setValue(1);
        int i = (Integer) box.getValue();
        System.out.println(i);
    }
}

package Interface;

interface Computer{
    void code();
}

class laptop implements Computer {
    public void code() {
        System.out.println("Laptop");
    }
}

class desktop implements Computer {
    public void code(){
        System.out.println("Desktop");
    }
}


public class Example {
    public static void main(String[] args) {
        Computer lap = new laptop();
        Computer desk = new desktop();

       lap.code();
       desk.code();
    }
}

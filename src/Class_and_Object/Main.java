package Class_and_Object;

public class Main {
    public static void main(String[] args){
        Car myCar = new Car();

        myCar.name = "Audi";
        myCar.model = "A3";
        myCar.Year = 2018;
        myCar.BehaviourEngine();

        System.out.println("The Car name is " + myCar.name);
        System.out.println("The Modal Name is " + myCar.model);
        System.out.println("Lauch Year" + myCar.Year);

    }
}

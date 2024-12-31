package Exceptions;

public class Multiple_Catch_Blocks {
    public static void main(String[] args) {
        try{
            int []  numbers = {1 , 2 , 3};
            System.out.println(numbers[4]);

        }catch (ArithmeticException e){
            System.out.println("ArithmeticException " + e);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBound" + e);
        }catch(Exception e){
            System.out.println("General Exception");
        }
    }
}

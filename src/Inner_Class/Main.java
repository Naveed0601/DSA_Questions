package Inner_Class;

public class Main {
   public static void main(String... args){
       // static nested class
       Static_Nested_Class.staticNestedClass nested = new Static_Nested_Class.staticNestedClass();
       nested.display();
       nested.name();
       System.out.println();
       // member nested class
       Member_Inner_Classes member = new Member_Inner_Classes();
       Member_Inner_Classes.memberinnerclasses inner = member.new memberinnerclasses();
       inner.displayName();
       inner.displayEmail();
       System.out.println();
       // local nested class
       Local_Inner_Class local = new Local_Inner_Class();
       local.method();

   }
}

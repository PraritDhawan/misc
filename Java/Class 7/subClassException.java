
class Parent{
    public void notDivideByZero() throws Exception{
        System.out.println("Played by bot");
    }
}

class Child extends Parent{
    public void notDivideByZero() throws Exception{
        System.out.println("Played by human");
        super.notDivideByZero();
    }
}

public class subClassException extends Child {
    public static void main(String[] args) {
        Child child = new Child();
        try{
            child.notDivideByZero();
        }catch(Exception e){

        }
    }
}

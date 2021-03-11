package class_6;
interface Motor {
    float capacity= (float) 9.0;
    void run();
    void consume();
}
class WashingMachine implements Motor{
    public void run(){
        System.out.println("The washing machine is running");
    }
    public void consume(){
        System.out.println("The washing machine is consuming water");
    }
}
public class Q1{
    public static void main(String args[]){
        Motor obj= new WashingMachine();
        WashingMachine wm= new WashingMachine();
        System.out.println("Capacity of washing machine is : "+wm.capacity);
        wm.run();
        wm.consume();
    }
}
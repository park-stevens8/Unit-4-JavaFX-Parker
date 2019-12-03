public class DieTester{
    public static void main(String[] args){
        Die die1, die2;
        int sum;
        die1 = new Die(1);
        die2 = new Die(2);
        die1.roll();
        die2.roll();
        System.out.println("Die 1: " + die1 + " Die 2: " + die2);
    }
}


public class CoinTester{
    public static void main(String []args){
        final int goal = 3;
        int count1 = 0;
        int count2 = 0;

        Coin coin1 = new Coin();
        Coin coin2 = new Coin();

        while(count1 < goal && count2 < goal){
            coin1.flip();
            coin2.flip();

            System.out.println("Coin 1 = " + coin1);
            System.out.println("Coin 2 = " + coin2);


        }
        if(count1 == goal){
            System.out.println("Coin 1 Wins!");
        }
        if(count2 == goal){
            System.out.println("Coin 2 Wins!");
        }
    }


}
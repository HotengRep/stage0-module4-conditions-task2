package school.mjc.stage0.conditions.task2;

public class CoinFlip {
    public void throwCoin(int from1UpTo1000) {

        String result = "Tail";

        if(from1UpTo1000 < 500)
        {
            result = "Eagle";
        }

        System.out.println(result);
    }
}

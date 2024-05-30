package lang.math.test;

import java.util.Random;

public class LottoGenerator {

    private final Random rand = new Random();
    private int[] randomLotto;
    private int counter;

    public int[] spin() {
        randomLotto = new int[6];
        counter = 0;

        while (counter < 6) {
            int number =  rand.nextInt(45) + 1;
            if (isRight(number)) {
                randomLotto[counter] = number;
                counter++;
            }
        }

        return randomLotto;
    }

    private boolean isRight(int number) {
        for (int i = 0; i < counter; i++) {
            if (randomLotto[i] == number) {
                return false;
            }
        }
        return true;
    }
}

package lang.math.test;

public class LottoMain {

    public static void main(String[] args) {

        LottoGenerator lottoGenerator = new LottoGenerator();
        int[] spin = lottoGenerator.spin();
        Integer integer = Integer.valueOf(10);
        int intValue = integer.intValue();
        System.out.print("로또 번호: ");
        for (int i = 0; i < spin.length; i++) {
            System.out.print(spin[i] + " ");
        }

    }
}

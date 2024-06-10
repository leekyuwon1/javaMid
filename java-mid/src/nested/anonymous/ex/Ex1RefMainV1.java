package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV1 {

    static class Dice implements Process{
        @Override
        public void process() {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 = " + randomValue);
        }
    }

    static class Sum implements Process{
        @Override
        public void process() {
            for (int i = 0; i < 3; i++) {
                System.out.println("i = " + i);
            }
        }
    }

    public static void hello(Process process) {
        System.out.println("프로그램 시작");
        process.process();
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        hello(new Dice());
        hello(new Sum());
    }
}

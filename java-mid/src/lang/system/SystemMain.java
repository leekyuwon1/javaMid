package lang.system;

import java.util.Arrays;
import java.util.Scanner;

public class SystemMain {

    public static void main(String[] args) {
        // 현재 시간(밀리초)를 가져온다.
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        // 현재 시간(나노 초)를 가져온다.
        long currentTimeNano = System.nanoTime();
        System.out.println("currentTimeNano = " + currentTimeNano);

        // 환경 변수를 읽는다.
        System.out.println("getenv= " + System.getenv()); // 운영체제가 사용하는 시스템 환경

        // 시스템 속성을 읽는다.
        System.out.println("properties= " + System.getProperties()); // 자바가 사용하는 시스템 환경
        System.out.println("Java version= " + System.getProperty("java.version"));

        // 배열을 고속으로 복사한다. 루프로 돌려서 하는 것보다 배로 빠르다.
        char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);

        // 배열 출력
        System.out.println("copiedArray = " + copiedArray);
        System.out.println("copiedArray = " + Arrays.toString(copiedArray));

        // 프로그램 종료 가급적 사용을 권장하지는 않는다.
        System.exit(0); // 상태 코드 0: 정상 종료
                             // 상태 코드 0 이 아님: 오류나 예외적인 종료
        System.out.println("hello");



    }
}

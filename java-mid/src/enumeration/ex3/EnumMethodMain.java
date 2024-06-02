package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {

    public static void main(String[] args) {

        // 모든 Enum 반환
        Grade[] values = Grade.values();
        System.out.println("values = " + Arrays.toString(values));

        for (Grade value : values) {
            System.out.println("name = " + value.name() + ", ordinal = " + value.ordinal());
        }

        // String -> ENUM 변환, 잘못된 문자일 시, IllegalArgumentException 예외 발생
        String input = "gold";
        Grade gold = Grade.valueOf(input);
        System.out.println("gold = " + gold);
    }
}

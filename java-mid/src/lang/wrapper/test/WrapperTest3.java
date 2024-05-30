package lang.wrapper.test;

public class WrapperTest3 {

    public static void main(String[] args) {
        // 오토 박싱과 오토 언박싱 사용 X
        String str = "100";
        Integer integer1 = Integer.valueOf(str);
        System.out.println("integer1 = " + integer1);

        int intValue = integer1.intValue();
        System.out.println("intValue = " + intValue);

        Integer integer2 = Integer.valueOf(intValue);
        System.out.println("integer2 = " + integer2);

    }
}

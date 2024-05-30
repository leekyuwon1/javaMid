package lang.wrapper.test;

public class WrapperTest4 {

    public static void main(String[] args) {
        // 오토 박싱과 오토 언박싱문제
        String str = "100";
        Integer integer1 = Integer.parseInt(str);
        System.out.println("integer1 = " + integer1);

        int intValue = integer1;
        System.out.println("intValue = " + intValue);
        
        Integer integer2 = intValue;
        System.out.println("integer2 = " + integer2);

    }
}

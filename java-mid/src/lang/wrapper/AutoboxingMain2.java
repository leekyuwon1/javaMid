package lang.wrapper;

public class AutoboxingMain2 {

    public static void main(String[] args) {
        //Primitive -> wrapper
        int value = 8;
        Integer boxedValue = value; // 오토 박싱( Auto-Boxing ) - 컴파일 단계에서 자동으로 넣어준다.

        //Wrapper -> Primitive
        int unboxedValue = boxedValue; // 오토 언박싱( Auto-unBoxing )

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }

}

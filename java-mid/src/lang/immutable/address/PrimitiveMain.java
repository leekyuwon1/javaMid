package lang.immutable.address;

public class PrimitiveMain {

    public static void main(String[] args) {
        //기본형은 절대로 같은 값을 공유하지 않는다.
        int a = 10;
        int b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b = 20; // b의 값만 "부산"으로 변경할려고 하였으나 a 값도 변경
        System.out.println("20 -> b ");
        System.out.println("a = " + a); // 사이드 이펙트 발생
        System.out.println("b = " + b);
    }
}

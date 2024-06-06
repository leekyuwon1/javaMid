package nested.nested;

public class NestedOuterMain {

    public static void main(String[] args) {
//        NestedOuter outer = new NestedOuter();
        NestedOuter.Nested nested = new NestedOuter.Nested(); // NestedOuter 클래스와 인스턴스 소속이 아니라서 따로 인스턴스 생성 가능 + private에 접근가능

        nested.print();

        System.out.println("nestedClass = " + nested.getClass());
    }
}

package nested.inner;

public class InnerOuterMain {

    public static void main(String[] args) {
//        InnerOuter.Inner inner = new InnerOuter.Inner(); // X
        InnerOuter outer = new InnerOuter();
        InnerOuter.Inner inner = outer.new Inner(); // 내부클래스를 호출하는 방법은 참조값이 존재해야 된다.

        inner.print();
        System.out.println("innerClass = " + inner.getClass());

    }
}

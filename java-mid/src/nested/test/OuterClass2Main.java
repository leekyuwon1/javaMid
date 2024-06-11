package nested.test;

public class OuterClass2Main {

    public static void main(String[] args) {
        OuterClass2 nested = new OuterClass2();
        OuterClass2.InnerClass innerClass = nested.new InnerClass();

        innerClass.hello();
    }
}

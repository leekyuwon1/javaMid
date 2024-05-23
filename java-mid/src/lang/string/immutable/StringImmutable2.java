package lang.string.immutable;

public class StringImmutable2 {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2= str1.concat(" java");

        // String 이 불변객체로 설계되어 있는 이유
        // 1. 사이드 이펙트 : 같은 참조값을 사용하고 있다. 그러므로 하나를 바꾸면 다른 곳도 같이 변경되어 버려 사이드 이펙트가 발생
        // 2. 문자열 풀 : 리터럴을 사용하게 되면 문자열 풀에 할당되어 있어 변경되면 같이 변경된다.
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}

package lang.string.equals;

public class StringEqualsMain1 {

    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("new String() == 비교 " + (str1 == str2));
        System.out.println("new String() equals 비교 " + str1.equals(str2));
        System.out.println(str1.toString());

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("리터럴 == 비교: " + (str3 == str4));
        System.out.println("리터럴 equals 비교: " + str3.equals(str4));

        String str5 = Integer.toHexString(System.identityHashCode(str3));
        String str6 = Integer.toHexString(System.identityHashCode(str4));
        String str7 = Integer.toHexString(System.identityHashCode(str1));
        String str8 = Integer.toHexString(System.identityHashCode(str2));
        // str3과 str4는 같은 byte[] 일때 문자열 리터럴을 사용하므로써 자바가 메모리를 최적화, 코드 성능 최적화를 위하여 문자열 풀을 사용한다.
        // 문자열 풀은 힙 영역
        System.out.println("참조값: " + str5);
        System.out.println("참조값: " + str6);

        System.out.println("참조값: " + str7);
        System.out.println("참조값: " + str8);
    }
}

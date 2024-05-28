package lang.string;

public class StringConcatMain {

    public static void main(String[] args) {
        String a = "hello";
        String b = " java";

        String result1 = a.concat(b);
        String result2 = a + b; // 특별하게 + 허용해준다.

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);


        String str = new String("hello");
        String str2 = new String(" java");

//        String result = x001 + x002; // 자바에서 String은 + 허용해준다.( 참조타입은 + 안됨 )
//        System.out.println("result = " + result);
    }
}

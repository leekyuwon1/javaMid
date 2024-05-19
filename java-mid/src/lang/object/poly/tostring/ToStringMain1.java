package lang.object.poly.tostring;

public class ToStringMain1 {

    public static void main(String[] args) {
        Object obj = new Object();
        String string = obj.toString();

        // toString() 반환값 출력  toString - 클래스의 정보, 참조값
        System.out.println(string);

        // object 직접 출력
        System.out.println(obj);
    }
}

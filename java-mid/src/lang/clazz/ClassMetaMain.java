package lang.clazz;

import java.lang.reflect.Field;

public class ClassMetaMain {

    public static void main(String[] args) throws Exception {
        // Class 조회 3가지 방법
        Class clazz = String.class; // 1. 클래스에서 조회
//        Class clazz1 = new String().getClass(); // 2. 인스턴스에서 조회
//        Class clazz2 = Class.forName("java.lang.String"); // 문자열로 조회

        // 모든 필드 출력
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field.getType() + " " + field.getName());
        }

        Field[] methods = clazz.getDeclaredFields();
        for (Field method : methods) {
            System.out.println("method = " + method);
        }

    }
}

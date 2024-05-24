package lang.string.builder;

public class StringBuilderMain1_2 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("AB"); // Side Impact
        String string = sb.append("A").append("B").append("C").append("D")
                .insert(3, "Java")
                .delete(3, 5)
                .reverse()
                .toString();
        // 메서드 체이닝기법
        System.out.println("string = " + string);
    }
}

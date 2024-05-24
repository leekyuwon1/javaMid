package lang.string.builder;

public class StringBuilderMain1_1 {

    public static void main(String[] args) {
         StringBuilder sb = new StringBuilder("AB"); // Side Impact
         sb.append("C");
        System.out.println(sb);

        sb.insert(3, "java");
        System.out.println(sb);

        sb.delete(3,5);
        System.out.println("Delete " + sb);

        sb.reverse();
        System.out.println("reverse " + sb);

        // StringBuilder -> String
        String string = sb.toString();
        System.out.println("string = " + string);
    }
}

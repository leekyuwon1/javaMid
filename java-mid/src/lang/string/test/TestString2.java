package lang.string.test;

public class TestString2 {

    public static void main(String[] args) {
        int sum = 0;
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].length();
            System.out.println(arr[i] + ": " + arr[i].length());
        }
        System.out.println("sum = " + sum);
    }
}

package enumeration.test;

import java.util.Scanner;

public class AuthGradeMain2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = true;
        while (exit) {
            System.out.print("당신의 등급을 입력하세요. [GUEST, LOGIN, ADMIN]: ");
            String grade = sc.nextLine();
            AuthGrade auth = AuthGrade.valueOf(grade.toUpperCase());
            auth.getAuth(auth);
        }
    }

}

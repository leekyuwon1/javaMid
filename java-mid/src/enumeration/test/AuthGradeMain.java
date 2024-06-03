package enumeration.test;


public class AuthGradeMain {

    public static void main(String[] args) {

        AuthGrade[] values = AuthGrade.values();
        for (AuthGrade value : values) {
            getUsed(value);
        }
    }

    private static void getUsed(AuthGrade grade) {
        System.out.println("grade= " + grade.name() + "\n" + "level= " + grade.getLevel() + "\n" + "설명= " + grade.getDescription() + "\n");
    }
}

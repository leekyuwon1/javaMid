package enumeration.test;

public enum AuthGrade {

    GUEST(1, "손님"), LOGIN(2, "로그인 회원"), ADMIN(3, "관리자");

    private final int level;
    private final String description;

    AuthGrade(int level, String description){
        this.level = level;
        this.description = description;
    }

    public int getLevel() {
        return level;
    }

    public String getDescription() {
        return description;
    }

    public void getAuth(AuthGrade grade) {
        if(grade == AuthGrade.GUEST) {
            System.out.println("당신의 등급은 " + description + "입니다.");
            System.out.println("- 메인 화면");
        } else if (grade == AuthGrade.LOGIN) {
            System.out.println("당신의 등급은 " + description + "입니다.");
            System.out.println("- 메인 화면\n- 이메일 관리 화면");
        } else if (grade == AuthGrade.ADMIN) {
            System.out.println("당신의 등급은 " + description + "입니다.");
            System.out.println("- 메인 화면\n- 이메일 관리 화면\n- 관리자 화면");
        }
    }
}

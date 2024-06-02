package enumeration.ex2;

public class ClassGrade {
    //타입 안전 열거형 패턴

    public static final ClassGrade BASIC = new ClassGrade();
    public static final ClassGrade GOLD = new ClassGrade();
    public static final ClassGrade DIAMOND = new ClassGrade();

    // private 생성자 추가
    private ClassGrade() {
        // 시그니처만 확인하고 새로운 객체를 생성하는것을 막기위해 사용
    }
}

package exception.basic.checked;

public class CheckedThrowMain {

    // 예외가 Main 밖으로 나가서 println() 메서드를 호출하지않고 시스템 종료
    public static void main(String[] args) throws MyCheckedException {
        Service service = new Service();
        service.catchThrow();
        System.out.println("정상 종료");
    }
}

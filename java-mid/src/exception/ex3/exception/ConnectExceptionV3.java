package exception.ex3.exception;

/**
 * 서버에 연결 실패했을 때 예외(세분화)
 * */
public class ConnectExceptionV3 extends NetworkClientExceptionV3 {

    private final String address;

    public ConnectExceptionV3(String address, String message) {
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}

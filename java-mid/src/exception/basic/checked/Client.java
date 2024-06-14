package exception.basic.checked;

/**
 * throw 예외 발생
 * throws 예외 던지기
 **/
public class Client {
    public void call() throws MyCheckedException {

        // call() 호출시, 예외 발생
        throw new MyCheckedException("ex");
    }
}

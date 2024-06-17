package exception.ex3;


import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.NetworkClientExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_2 {

    public void sendMessage(String data) {
        String address = "http://example.com";

        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data); // 추가

        try {
            client.connect();
            client.send(data);
        } catch (ConnectExceptionV3 e) { // 디테일한 것이 맨 윗줄 상위로 갈수록 아래쪽
            System.out.println("[연결 오류] 주소: " + e.getAddress() + ", 메시지: " + e.getMessage());
        } catch (NetworkClientExceptionV3 e) {
            System.out.println("[네트워크 오류] 메시지: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("[알 수 없는 오류] 메시지: " + e.getMessage());
        } finally {
            client.disconnect();
        }

//        try {
//            client.connect();
//            client.send(data);
//        } catch(ConnectExceptionV3  | SendExceptionV3 e){ // 이렇게 될 경우 각각의 get메서드는 호출 불가 공통 부모의 메서드만 사용 가능
//            System.out.println("[연결 또는 전송 오류] 주소: , 메시지: " + e.getMessage());
//        } finally {
//            client.disconnect();
//        }
    }
}

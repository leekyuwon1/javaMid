package exception.ex4;


public class NetworkServiceV5 {

    public void sendMessage(String data) {
        String address = "http://example.com";

        try(NetworkClientV5 client = new NetworkClientV5(address)) {
            client.initError(data); // 추가
            client.connect();
            client.send(data); // try가 끝나는 동시에 close 오버라이딩이 출력되면서 자원을 반납한다.
        } catch (Exception e) {
            System.out.println("[예외 확인]: " + e.getMessage());
            throw e;
        }
    }
}

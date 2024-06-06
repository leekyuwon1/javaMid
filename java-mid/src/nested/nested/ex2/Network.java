package nested.nested.ex2;

public class Network {

    public void sendMessage(String text) {
//        Network.NetworkMessage networkMessage = new Network.NetworkMessage(text); //외부에서만 이렇게 사용한다.
        NetworkMessage networkMessage = new NetworkMessage(text);
        networkMessage.print();
    }

    private static class NetworkMessage {
        // private 로 막아두면 Network 내부에서만 사용하는걸로 인지 가능
        private String content;

        public NetworkMessage(String content) {
            this.content = content;
        }

        public void print() {
            System.out.println(content);
        }
    }

}

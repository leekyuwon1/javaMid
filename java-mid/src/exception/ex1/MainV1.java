package exception.ex1;

import java.util.Scanner;

public class MainV1 {

    public static void main(String[] args) {
//        NetworkServiceV1_1 networkService = new NetworkServiceV1_1(); // 오류 코드를 줄때 간단하게 해당 오류만 처리
//        NetworkServiceV1_2 networkService = new NetworkServiceV1_2(); // 서버 오류일시 메시지 보내지 않음, 하지만 연결은 유지
        NetworkServiceV1_3 networkService = new NetworkServiceV1_3(); // 서버 오류일시 메시지 보내지 않음, 하지만 연결은 유지 하지않음

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("전송할 문자: ");
            String message = sc.nextLine();
            if(message.equals("exit")){
                break;
            }
            networkService.sendMessage(message);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }
}

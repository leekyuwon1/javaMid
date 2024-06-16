package exception.ex2;

import java.util.Scanner;

public class MainV2 {

    public static void main(String[] args) throws NetworkClientExceptionV2 {
        NetworkServiceV2_1 networkService = new NetworkServiceV2_1(); // 서버 오류일시 메시지 보내지 않음, 연결 유지 하지않음

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

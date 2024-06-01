package enumeration.ex1;

public class StringGradeEx1_2 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();


        // 존재하지 않는 등급 ( 잘못된 등급 기입 )
        int vip = discountService.discount("VIP", price);
        System.out.println("VIP 등급의 할인 금액 = " + vip);

        // 오타
        int diamodd = discountService.discount("DIAMODD", price);
        System.out.println("DIAMODD 등급의 할인 금액 = " + diamodd);

        // 소문자 입력
        int gold = discountService.discount("gold", price);
        System.out.println("gold 등급의 할인 금액 = " + gold);

        /**
         * 상수를 사용하더라도 다른 개발자가 시그니처만 보고 작성할 가능성이 농후하다.*/

    }
}

package lang.object.poly.equals;

public class EqualsMainV1 {

    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");

        System.out.println("identity = " + (user1 == user2)); // 참조값이 다르다.( 동일성 )
        System.out.println("equals = " + (user1.equals(user2))); // ( 동일성 )
    }
}

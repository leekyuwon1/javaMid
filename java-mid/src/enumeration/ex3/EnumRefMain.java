package enumeration.ex3;

public class EnumRefMain {

    public static void main(String[] args) {
        System.out.println("class BASIC: " + Grade.BASIC.getClass());
        System.out.println("class GOLD: " + Grade.GOLD.getClass());
        System.out.println("class DIAMOND: " + Grade.DIAMOND.getClass());

        System.out.println("ref BASIC: " + refValue(Grade.BASIC)); //toString 오버라이딩 했음
        System.out.println("ref BASIC: " + refValue(Grade.GOLD)); //toString 오버라이딩 했음
        System.out.println("ref BASIC: " + refValue(Grade.DIAMOND)); //toString 오버라이딩 했음
   }

   private static String refValue(Object object) {
        return Integer.toHexString(System.identityHashCode(object));
   }
}

package nested.anonymous.ex;

public class Ex0RefMain {

    public static void main(String[] args) {
        Anony anony = new Anony() {
            @Override
            public void call(String lang) {
                System.out.println("프로그램 시작");
                System.out.println("Hello " + lang);
                System.out.println("프로그램 종료");
            }
        };

        anony.call("Java");
        anony.call("Spring");
    }
}

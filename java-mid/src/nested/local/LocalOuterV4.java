package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV4 {

    private int outInstanceVar = 3;

    public Printer process(int paramVar) {
        int localVar = 1; // final or 사실상 final

        class LocalPrinter implements Printer{
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);

                // 인스턴스는 지역 변수보다 더 오래 살아남는다.
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        LocalPrinter printer = new LocalPrinter(); // LocalPrinter를 생성하는 시점에 참조하는 지역변수를 캡쳐한다.
        // 만약 localVar의 값을 변경한다면? 다시 캡쳐해야 하나??
//        localVar = 10; // 동기화 문제,
        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV4 local = new LocalOuterV4();
        Printer printer = local.process(2);
        printer.print();

        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }
    }
}

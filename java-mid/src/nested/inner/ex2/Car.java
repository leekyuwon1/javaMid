package nested.inner.ex2;

public class Car {

    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine(); // 메모리 누수 위험. engine 변수가 암묵적인 참조를 유지하여 가비지 돌지를 못하게함
    }

    public void start() {
        engine.start();
        System.out.println(model + " 시작 완료");
    }

    private class Engine {
        // 내부 클래스이기때문에 private 접근 가능 -> getXxx 메서드 불필요, Car 객체에 접근이 가능하여 생성자 X
        public void start() {
            System.out.println("충전 레벨 확인: " + chargeLevel);
            System.out.println(model + "의 엔진을 구동합니다.");
        }
    }

}

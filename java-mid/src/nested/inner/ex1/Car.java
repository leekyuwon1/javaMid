package nested.inner.ex1;

public class Car {

    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine(this);
    }

    // Engine에서만 사용하는 메서드
    public int getChargeLevel() {
        return chargeLevel;
    }

    // Engine에서만 사용하는 메서드
    public String getModel() {
        return model;
    }
    /**
     * Engine 클래스에서만 사용하는 getXxx 메서드들이 불필요하게 외부에 노출하게 되어 캡슐화를 떨어뜨린다.
     * */

    public void start() {
        engine.start();
        System.out.println(model + " 시작 완료");
    }

}

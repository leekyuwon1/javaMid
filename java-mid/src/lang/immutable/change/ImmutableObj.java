package lang.immutable.change;

public class ImmutableObj {

    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    public ImmutableObj add(int addValue) {
        //불변 객체에 값변동이 필요할 때 원래의 value는 변경이 없고 새로운 객체를 만들어서 반환한다.
//        int result = value + addValue;
        return new ImmutableObj(value + addValue);
    }

    public int getValue() {
        return value;
    }
}

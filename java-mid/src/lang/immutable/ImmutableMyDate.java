package lang.immutable;

public class ImmutableMyDate {

    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // withXxx: (불변객체) 원본 객체의 상태가 그대로 유지됨을 강조하면서 변경사항을 새 복사본에 포함하는 과정을 간결하게 표현한다. (관례)
    public ImmutableMyDate withDate(int year) {
        return new ImmutableMyDate(year, month, day);
    }

    public ImmutableMyDate withDate(int year, int month) {
        return new ImmutableMyDate(year, month, day);
    }

    public ImmutableMyDate withDate(int year, int month, int day) {
        return new ImmutableMyDate(year, month, day);
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}

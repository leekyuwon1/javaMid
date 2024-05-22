package lang.immutable;

public class ImmutableMyDateMain {

    public static void main(String[] args) {
        ImmutableMyDate date1 = new ImmutableMyDate(2024, 1, 1);
        ImmutableMyDate date2 = date1;

        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
        String date3= Integer.toHexString(System.identityHashCode(date1));
        String date4= Integer.toHexString(System.identityHashCode(date2));
        System.out.println("date1 = " + date3);
        System.out.println("date1 = " + date4);

        System.out.println();
        System.out.println("2025 -> date1");
        date1= date1.withDate(2025);

        String date5= Integer.toHexString(System.identityHashCode(date1));
        String date6= Integer.toHexString(System.identityHashCode(date2));
        System.out.println("date1 = " + date5);
        System.out.println("date1 = " + date6);
        System.out.println();
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
    }
}

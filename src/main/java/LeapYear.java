public class LeapYear {
    public static boolean isLeapYear(int year) {


        if (divisibleBy400(year)) {
            return true;
        }

        return false;
    }

    private static boolean divisibleBy400(int year) {
        return year % 400 == 0;
    }
}

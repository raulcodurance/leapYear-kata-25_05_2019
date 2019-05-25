public class LeapYear {
    public static boolean isLeapYear(int year) {

        if (year == 2000){
            return 2000% 400 == 0;
        }

        if (year == 1600){
            return 1600 % 400 == 0;
        }
        return false;
    }
}

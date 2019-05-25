import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class LeapYearShould {
    // 2000, 2004, 2008,
    @Test
    public void return_true_if_year_2000_is_divisible_by_400() {

        assertTrue(LeapYear.isLeapYear(2000));
    }

    @Test
    public void return_true_if_year_1600_is_divisible_by_400() {

        assertTrue(LeapYear.isLeapYear(1600));
    }

    @Test
    public void return_true_if_year_2400_is_divisible_by_400() {

        assertTrue(LeapYear.isLeapYear(2400));
    }

}

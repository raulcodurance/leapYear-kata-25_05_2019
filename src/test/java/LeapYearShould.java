import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

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
    
    // 1700, 1800, and 1900


    @Test
    public void return_false_if_year_1700_is_divisible_by_100_but_not_by_400() {
        assertFalse(LeapYear.isLeapYear(1700));

    }

}

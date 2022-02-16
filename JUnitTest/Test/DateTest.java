import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    @Test
    void addDays() {
        Date d1 = new Date(2015, 12,24);
        d1.addDays(9);
        assertEquals(31, d1.getDay());
    }

    @Test
    void daysInMonth()
    {
        Date d1 = new Date(2016, 2,24);

        assertEquals(29, d1.daysInMonth(d1.getMonth()));
    }
}
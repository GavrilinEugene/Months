import org.junit.Test;

import static org.junit.Assert.*;

public class MonthTest {
    @Test
    public void days() throws Exception {
        assertEquals(29, Month.FEBRUARY.days(true));
        assertEquals(28, Month.FEBRUARY.days(false));
        assertEquals(31, Month.DECEMBER.days());
        assertEquals(30, Month.JUNE.days());
    }

    @Test
    public void next() throws Exception {
        assertTrue(Month.DECEMBER.next() == Month.JANUARY);
        assertTrue(Month.JUNE.next() == Month.JULY);
    }

    @Test
    public void previous() throws Exception {
        assertTrue(Month.DECEMBER.previous() == Month.NOVEMBER);
        assertTrue(Month.JANUARY.previous() == Month.DECEMBER);
    }
}
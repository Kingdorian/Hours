package com.kingdorian.android.hours;

import com.kingdorian.android.hours.model.HourEntry;
import org.junit.Test;
import java.util.Calendar;
import java.util.GregorianCalendar;
import static org.junit.Assert.assertTrue;

/**
 * Created by dorian on 19-4-16.
 */
public class HourEntryTest {
    @Test
    public void testSetDate() throws Exception {
        Calendar oldDate = new GregorianCalendar();
        HourEntry hEntry = new HourEntry(3.5, oldDate);
        Calendar newDate = new GregorianCalendar();
        hEntry.setDate(newDate);
        // Check if it is exactly the same object
        assertTrue(hEntry.getDate() == newDate);
    }
}

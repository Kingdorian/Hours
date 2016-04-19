package com.kingdorian.android.hours;

import com.kingdorian.android.hours.model.HourEntry;
import org.junit.Test;
import java.util.Date;
import static org.junit.Assert.assertTrue;

/**
 * Created by dorian on 19-4-16.
 */
public class HourEntryTest {
    @Test
    public void testSetDate() throws Exception {
        Date oldDate = new Date();
        HourEntry hEntry = new HourEntry(3.5, oldDate);
        Date newDate = new Date();
        hEntry.setDate(newDate);
        // Check if it is exactly the same object
        assertTrue(hEntry.getDate() == newDate);
    }
}

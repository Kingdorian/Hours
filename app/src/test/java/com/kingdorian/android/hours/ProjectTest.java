package com.kingdorian.android.hours;

import org.junit.Test;

import com.kingdorian.android.hours.model.HourEntry;
import com.kingdorian.android.hours.model.Project;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ProjectTest {

    @Test
    public void testAddHoursTotalTimeIncrease() {
        HourEntry hourEntry = new HourEntry(3.5, null);
        HourEntry hourEntry2 = new HourEntry(2.2, null);
        Project p = new Project("Name");
        p.addHours(hourEntry);
        p.addHours(hourEntry2);
        assertEquals(p.getTotalHours(), hourEntry.getTime()+hourEntry2.getTime(), 0.001);
    }
}
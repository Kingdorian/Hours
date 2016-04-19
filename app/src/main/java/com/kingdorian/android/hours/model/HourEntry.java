package com.kingdorian.android.hours.model;

import java.util.Calendar;

/**
 * Created by dorian on 19-4-16.
 */
public class HourEntry {
    private double time;
    private int projectId;
    private Calendar calendar;

    /**
     * Constructs a new HourEntry object.
     */
    public HourEntry(double time, Calendar date) {
        this.time = time;
        this.calendar = date;
    }

    /**
     * Returns the date of this timeEntry
     */
    public Calendar getDate() {
        return calendar;
    }
    /**
     * Returns the time stored in this entry.
     */
    public double getTime() {
        return time;
    }
    /**
     * Set a new time spend in this entry
     * @param time The new time spend
     */
    public void setTime(double time) {
        this.time = time;
    }
    /**
     * Changes the date of this entry.
     * @param date new date
     */
    public void setDate(Calendar c) {
        this.calendar = c;
    }


}

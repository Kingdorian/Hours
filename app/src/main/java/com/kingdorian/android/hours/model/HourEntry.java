package com.kingdorian.android.hours.model;

import java.util.Date;

/**
 * Created by dorian on 19-4-16.
 */
public class HourEntry {
    private double time;
    private int projectId;
    private Date date;

    /**
     * Constructs a new HourEntry object.
     */
    public HourEntry(double time, Date date) {
        this.time = time;
        this.date = date;
    }

    /**
     * Returns the date of this timeEntry
     */
    public Date getDate() {
        return date;
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
    public void setDate(Date date) {
        this.date = date;
    }


}

package com.kingdorian.android.hours.model;

import java.util.ArrayList;

/**
 * Created by dorian on 19-4-16.
 */
public class Project {
    private String  name;
    private double totalHours;
    private ArrayList<HourEntry> hours = new ArrayList<HourEntry>();
    private int id;
    private static int idCount = 0;

    /**
     * Creates a new Project object
     * @param name the name of the project
     */
    public Project(String name) {
        this.name = name;
        this.id = idCount +1;
        idCount = idCount +1;
    }
    /**
     * Returns name of this project
     * @return name
     */
    public String getName() {
        return this.name;
    }
    /**
     * Returns the amount of hours in total spend on this project
     * @return the amount of hours spend on total
     */
    public double getTotalHours() {
        return totalHours;
    }
    /**
     * Sets the name of this project
     * @param name the newe name
     */
    public void setName(String name) {
        this. name = name;
    }
    /**
     * Add hourentry to this project
     * @param hEntry an hour entry to add to this project
     */
    public void addHours(HourEntry hEntry) {
        hours.add(hEntry);
        totalHours = totalHours+hEntry.getTime();
    }

}

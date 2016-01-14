package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by amhassen on 1/14/16.
 */
public class SadMood extends AbstractMood{
    private String mood="sad";
    private Date date_insert;

    public Date get_Date(){
        return this.date_insert;}
    public void set_Date(Date date_inserted) {
        this.date_insert = date_inserted;
    }
    public String get_Mood(){
        return this.mood;
    }
    public boolean is_happy(){
        return false;
    }
    public SadMood() {
        this.date_insert = new Date();
    }
    public SadMood(Date this_date) {
        this.date_insert = this_date;
    }
}
package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by amhassen on 1/14/16.
 */
public abstract class Tweet {


    protected String message;
    private Date date;
    private ArrayList<String> moods;

    public Tweet(String message) {
        this.message = message;
        this.date= new Date(System.currentTimeMillis());
    }

    public ArrayList<String> getMoods() {
        return moods;
    }

    public void addMoods(String mood) {
        this.moods.add(mood);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length()>140){
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Tweet(String message, Date date) {
        this.message = message;

        this.date = date;
    }
    abstract public boolean isImportant();

}

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by amhassen on 1/14/16.
 */
public class NormalTweet extends Tweet implements Tweetable{
    public NormalTweet(String message) {
        super(message);
    }
    @Override
    public String getMessage() {

        return this.message;
    }
    public String get_message(){
        return this.get_message();
    }
    public Date get_date(){
        return this.get_date();
    }
    public boolean isImportant(){
        return false;

    }
}

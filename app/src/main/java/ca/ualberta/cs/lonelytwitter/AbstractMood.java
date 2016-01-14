package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by amhassen on 1/14/16.
 */
public abstract class AbstractMood {

    public abstract void set_Date(Date date_inserted);
    public abstract Date get_Date();
    public abstract String get_Mood();
    public abstract boolean is_happy();
    public String print_mood(){
        if (this.is_happy()){
            return "happy";

        }
        else{
            return "sad";
        }
    }
}

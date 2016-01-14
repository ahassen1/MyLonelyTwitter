package ca.ualberta.cs.lonelytwitter;

/**
 * Created by amhassen on 1/14/16.
 */
public class ImportantTweet extends Tweet {
    public ImportantTweet(String message) {
        super(message);
    }
    @Override
    public boolean isImportant(){
        return true;

    }
}

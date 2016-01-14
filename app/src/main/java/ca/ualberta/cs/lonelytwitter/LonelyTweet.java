package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class LonelyTweet
{

    private String text;
    private String mood;
    private Date timestamp;

    public String getText()
    {

        return text;
    }

    public LonelyTweet(String text)
    {

        super();
        this.text = text;
        timestamp = new Date();
        this.mood="nothing";
    }

    public LonelyTweet(String text, Date timestamp)
    {

        super();
        this.text = text;
        this.timestamp = timestamp;
    }
    public LonelyTweet(String text, Date timestamp,String mood)
    {

        super();
        this.text = text;
        this.timestamp = timestamp;
        this.mood=mood;
    }
    public void setText(String text)
    {

        this.text = text;
    }

    public abstract Date getTimestamp();

    public void setTimestamp(Date timestamp)
    {

        this.timestamp = timestamp;
    }
}
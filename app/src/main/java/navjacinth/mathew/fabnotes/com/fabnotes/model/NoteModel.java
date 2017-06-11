package navjacinth.mathew.fabnotes.com.fabnotes.model;

import java.util.Date;

import io.realm.RealmObject;

/**
 * Created by Navjacinth Mathew on 6/11/2017.
 */

public class NoteModel extends RealmObject {

    private String title;
    private String content;
    private Date timeStamp;

    public NoteModel(String title, String content, Date timeStamp) {
        this.title = title;
        this.content = content;
        this.timeStamp = timeStamp;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }
}

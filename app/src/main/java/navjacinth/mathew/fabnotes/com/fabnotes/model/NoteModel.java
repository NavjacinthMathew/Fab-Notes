package navjacinth.mathew.fabnotes.com.fabnotes.model;

import io.realm.RealmObject;

/**
 * Created by Navjacinth Mathew on 6/11/2017.
 */

public class NoteModel extends RealmObject {

    private int id;
    private String title;
    private String content;
    private String time;
    private String date;

    public NoteModel() {
    }

    public NoteModel(int id, String title, String content, String time, String date) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.time = time;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

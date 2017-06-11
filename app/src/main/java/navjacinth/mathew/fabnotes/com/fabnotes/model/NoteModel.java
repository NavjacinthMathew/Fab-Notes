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
}
